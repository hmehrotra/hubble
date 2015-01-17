/* Run in strict mode to avoid debugging nightmares */
'use strict';

require(['angular',
         './libs/angular-ui-router',
         'angular-route'],
    function(angular){
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
                                controller: function($scope, segments){
                                    $scope.segments = segments;
                                },
                                resolve: {
                                    segments: ['$http', function($http){
                                        return $http.get('../sampleData/EcosystemSegments.json').then(function(response){
                                            return response.data.segmentNames;
                                        })
                                    }]
                                }
                            },
                            'companyListView' : {
                                templateUrl: 'js/companyList/CompanyListView.html',
                                controller: function($scope, companies){
                                      $scope.companies = companies;
                                },
                                resolve: {
                                      companies: ['$http', function($http){
                                          return $http.get('../sampleData/Companies.json').then(function(response){
                                              return response.data.companies;
                                          })
                                      }]
                                }
                            },
                            'countryListView' : {
                                templateUrl: 'js/countryList/CountryListView.html',
                                controller: function($scope, countries){
                                       $scope.countries = countries;
                                },
                                resolve: {
                                       countries: ['$http', function($http){
                                            return $http.get('../sampleData/Countries.json').then(function(response){
                                                return response.data.countries;
                                            })
                                       }]
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
