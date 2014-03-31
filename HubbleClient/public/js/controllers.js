/* Run in strict mode to avoid debugging nightmares */
'use strict';

define(function() {
    /* Controllers */
    var controllers = {};

    controllers.LoginController = function($scope, $http) {
        $http.get('sampleData/EcosystemSegments.json').success(function(data) {
            $scope.segments = data.segmentNames;
            $scope.companies = data.segmentNames;
            $scope.countries = data.segmentNames;
        });
    };
    controllers.LoginController.$inject = ['$scope', '$http'];

    return controllers;
});

