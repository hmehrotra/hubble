/*
    All angular services are Singletons, except $scope. Each controller gets a child $Scope

    Controller design principles (Refer https://docs.angularjs.org/guide/controller)

    Use: Initialize and add behavior to $scope
    Do not use to share state of variables with other controllers. Angular services should be used instead
*/

// Using RequireJS to define AngularJS modules
// Refer for details http://www.sitepoint.com/using-requirejs-angularjs-applications/

define(function(){ // Function to execute when all dependencies have loaded

      function companyListCtrl($scope, $http, $log, CompanyService){

            CompanyService.allCompanies().success(function(data){
                $scope.companyNames = data.companyNames;
            })
       }

       companyListCtrl.$inject=['$scope', '$http', '$log', 'CompanyService'];

       return companyListCtrl;
});
