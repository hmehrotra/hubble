/*
    Run in strict mode to avoid debugging nightmares
    This make Javascript engine use more stricter rules while evaluating code
    In this app, global and all local execution contexts are executed in Strict Mode
    Eg: In string mode a variable needs to be declared before it could be used.

    https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Strict_mode
*/
"use strict";

require(['angular',
         './libs/angular-ui-router',
         'angular-route',
         './segmentList/SegmentListCtrl',
         './companyList/CompanyListCtrl',
         './countryList/CountryListCtrl'],

    function(angular, angularUIRouter, angularRoute, SegmentListCtrl, CompanyListCtrl, CountryListCtrl){

        angular.module('hubble',['ui.router', 'ngRoute'])
           .config(['$routeProvider', '$stateProvider', function($routeProvider, $stateProvider){

                // Route provider works by listening to "hash change events" in browser
                // This event is fired when hash or fragment identifier on html page changes
                // https://docs.angularjs.org/api/ngRoute/provider/$routeProvider
                $routeProvider.when('/', {
                                    templateUrl: 'views/loginPage.html'
                                    //  TODO: specify the controller for login page
                              })
                              .when('/login', {
                                    templateUrl: 'views/loginPage.html'
                              })
                              .when('/home', {
                                    templateUrl: 'views/homePage.html'
                              })
                              .otherwise({redirectTo: '/login'});

                $stateProvider
                    .state('home', {
                        views: {
                            'homePage' : {
                                templateUrl: 'views/homePage.html'
                            }
                        }
                    })
                    .state('home.details', {                    // Here home.details is nested inside home state
                        views: {                                // When these states are activated, the templates get inserted into ui-view of the parent template
                            'segmentListView' : {
                                templateUrl: 'js/segmentList/SegmentListView.html',
                                controller: SegmentListCtrl
                            },
                            'companyListView' : {
                                templateUrl: 'js/companyList/CompanyListView.html',
                                controller: CompanyListCtrl
                            },
                            'countryListView' : {
                                templateUrl: 'js/countryList/CountryListView.html',
                                controller: CountryListCtrl
                            }
                        }
                    })
           }])
           .run(function($state){
                $state.go('home.details');
           });

        angular.bootstrap(document, ['hubble']);
});
