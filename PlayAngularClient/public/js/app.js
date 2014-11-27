/* Run in strict mode to avoid debugging nightmares */
'use strict';

require(['angular', './controllers', './directives', './filters', './services', 'angular-route'],
    function(angular, controllers) {

        // Declare app level module which depends on filters, and services

        /* Setter for module dependencies */
        angular.module('hubble', ['ngRoute']).
            config(['$routeProvider' , function($routeProvider){
            $routeProvider.when('/login', { templateUrl: 'views/loginPage.html', controller: controllers.LoginController });
            $routeProvider.when('/home', { templateUrl: 'views/homePage.html', controller: controllers.HubbleController });
            $routeProvider.otherwise({redirectTo: '/home'});
        }]);

        angular.bootstrap(document, ['hubble']);
    });

// Getter for module dependencies
// angular.module("hubble");
