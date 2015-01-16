/* Run in strict mode to avoid debugging nightmares */
'use strict';

/* require(['angular', './controllers', './directives', './filters', './services', 'angular-route'],
    function(angular, controllers) {

        // Declare app level module which depends on filters, and services

        /* Setter for module dependencies
        angular.module('hubble', ['ngRoute']).
            config(['$routeProvider' , function($routeProvider){
            $routeProvider.when('/login', { templateUrl: 'views/loginPage.html', controller: controllers.LoginController });
            $routeProvider.when('/home', { templateUrl: 'views/homePage.html', controller: controllers.HubbleController });
            $routeProvider.otherwise({redirectTo: '/home'});
        }]);

        angular.bootstrap(document, ['hubble']);
    }); */

// Getter for module dependencies
// angular.module("hubble");

require(['angular',
         './libs/angular-ui-router',
         './segmentList/SegmentListController',
         'angular-route'],
    function(angular, undefined, segmentListCtrl){
        angular.module('hubble',['ui.router', 'ngRoute'])
           .config(['$routeProvider', '$stateProvider', function($routeProvider, $stateProvider){

                $routeProvider.when('/login', { templateUrl: 'views/loginPage.html'});
                $routeProvider.otherwise({redirectTo: '/home'});

                $stateProvider
                    .state('home', {
                        views: {
                            'homePage' : {
                                templateUrl: 'views/homePage.html'
                            }
                        }
                    })
                    .state('home.details', {
                        views: {
                            'segmentListView' : {
                                templateUrl: 'js/segmentList/SegmentListView.html',
                                controller: function($scope, $http){
                                    $http.get('../sampleData/EcosystemSegments.json')
                                            .success(function(data) {
                                                $scope.segments = data.segmentNames;
                                            })
                                            .error(function(data, status, headers, config){
                                                console.log('Error occurred' + status);
                                            });
                                }
                            },
                            'companyListView' : {
                                templateUrl: 'js/companyList/CompanyListView.html',
                                controller: function($scope, $http){
                                    $http.get('../sampleData/Companies.json')
                                          .success(function(data) {
                                             $scope.companies = data.companies;
                                          })
                                          .error(function(data, status, headers, config){
                                             console.log('Error occurred' + status);
                                          });
                                }
                            },
                            'countryListView' : {
                                templateUrl: 'js/countryList/CountryListView.html',
                                controller: function($scope, $http){
                                    $http.get('../sampleData/Countries.json')
                                         .success(function(data) {
                                             $scope.countries = data.countries;
                                         })
                                         .error(function(data, status, headers, config){
                                             console.log('Error occurred' + status);
                                         });
                                }
                            }
                        }
                    })
           }])
           .run(function($state){
                $state.go('home.details');
           });

        angular.bootstrap(document, ['hubble']);
});
