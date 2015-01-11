angular.module('login').controller('LoginCtrl', function($scope, $http){
    $scope.loginError = '';
    $scope.validateLogin = function(){
       if ( !($scope.username === 'hmehrotra' && $scope.password === 'hubble')){
           $scope.loginError = 'Username and password do not match';
       }
       else{
            $location.path("/home");
       }
    };
});