// There are two ways of defining controller in AngularJS
// a) myApp.controller("controllerName" , function($scope, $log){ Function Body  })

// This controller definition will break by javascript minification because minifier
// replaces method parameters by alphabetical representations to save bandwidth

// b)  myApp.controller("controllerName" , ["$scope", "$log", function($scope, $log){ Function Body  }])
// This does not break by minifier because the minifier does not replace the content of string


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

    // Test this once controllers are working
    // The injector method returns array of arguments passed to method.
    // Angular then analyzes each input to see if it a service (begins with $) and then injects the service
    // console.log('Here' + angular.injector().annotate(controllers.HubbleController));

    return controllers;
});

