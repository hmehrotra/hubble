/*
    Run in strict mode to avoid debugging nightmares
    This make Javascript engine use more stricter rules while evaluating code
    In this app, global and all local execution contexts are executed in Strict Mode
    Eg: In string mode a variable needs to be declared before it could be used.

    https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Strict_mode
*/
"use strict";

require(['angular',
         'angular-ui-router',
         'angular-route',
         'js/browse/BrowseService',
         'js/browse/BrowseController'],

    function(angular,
    		 angularUIRouter, 
    		 angularRoute, 
    		 browseService,  
    		 BrowseCtrl){

	angular.module('hubble',['ui.router', 'ngRoute'])
           .config(['$routeProvider', '$stateProvider', function($routeProvider, $stateProvider){

                // Route provider works by listening to "hash change events" in browser
                // This event is fired when hash or fragment identifier on html page changes
                // https://docs.angularjs.org/api/ngRoute/provider/$routeProvider
                $routeProvider.when('/', {
                	templateUrl: 'vassets/js/login/loginPage.html'
                  })
                  .when('/login', {
                        templateUrl: 'vassets/js/login/loginPage.html'
                  })
                  .when('/hubble/home', {
                        templateUrl: 'vassets/views/homePage.html'
                  })
                  .otherwise({redirectTo: '/login'});                                    
           }])
           // Register services
           .factory('browseService', ['$http', browseService ])
           
           // Register Controllers
           .controller('BrowseCtrl', ['$scope', '$http', '$log', 'browseService', BrowseCtrl]);
	
		angular.element(document).ready(function() {
			angular.bootstrap(document, ['hubble']);
		});
});
