define(function(){
    function countryListCtrl($scope, $http){
        $http.get('../sampleData/Countries.json')
        .success(function(data) {
            $scope.countries = data.countries;
        })
        .error(function(data, status, headers, config){
            console.log('Error occurred' + status);
        });
    }

    countryListCtrl.$inject=['$scope', '$http'];

    return countryListCtrl;
});
