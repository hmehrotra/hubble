define(function(){

    function segmentService($http){

        var service = {
            allSegments : function allSegments() {
                return $http.get('/hubble/segments');
            },
            allSegmentsForCompany : function allSegmentsForCompany(companyId) {
                return $http.get('/hubble/segments');
            }
        };

        return service;
    }

    segmentService.$inject=['$http'];

    return segmentService;
});