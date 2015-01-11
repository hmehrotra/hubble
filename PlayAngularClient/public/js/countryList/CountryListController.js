angular.module('countryList').controller('CountryListCtrl', function($scope, $http){
    $http.get('sampleData/Countries.json').success(function(data) {
          $scope.segments = data.countries;
    });
});