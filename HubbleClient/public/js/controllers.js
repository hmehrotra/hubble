/* Run in strict mode to avoid debugging nightmares */
'use strict';

define(function() {
    /* Controllers */
    var controllers = {};

    controllers.LoginController = function($scope, $location) {

        $scope.loginError = '';
        $scope.validateLogin = function(){
            if ( !($scope.username === 'hmehrotra' && $scope.password === 'hubble')){
                $scope.loginError = 'Username and password do not match';
            }
            else{
                $location.path("/home");
            }
        };
    };

    controllers.HubbleController = function($scope, $http) {
            $http.get('sampleData/EcosystemSegments.json').success(function(data) {
                $scope.segments = data.segmentNames;
                $scope.companies = data.segmentNames;
                $scope.countries = data.segmentNames;
            });
    };

    controllers.LoginController.$inject = ['$scope', '$location'];
    controllers.HubbleController.$inject = ['$scope', '$http'];

    return controllers;
});

