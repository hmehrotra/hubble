define(function(){
    function companyListCtrl($scope, $http){
        $http.get('../sampleData/Companies.json')
        .success(function(data) {
            $scope.companies = data.companies;
        })
        .error(function(data, status, headers, config){
            console.log('Error occurred' + status);
        });
    }

    companyListCtrl.$inject=['$scope', '$http'];

    return companyListCtrl;
});