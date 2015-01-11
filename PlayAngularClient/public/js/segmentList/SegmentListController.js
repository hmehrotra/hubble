define(function(){
    function segmentListCtrl($scope, $http){
        $http.get('../sampleData/EcosystemSegments.json')
        .success(function(data) {
            $scope.segments = data.segmentNames;
        })
        .error(function(data, status, headers, config){
            console.log('Error occurred' + status);
        });
    }

    segmentListCtrl.$inject=['$scope', '$http'];

    return segmentListCtrl;
});
