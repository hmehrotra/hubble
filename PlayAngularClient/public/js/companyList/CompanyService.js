define(function(){

    function companyService($http){

        var service = {
            allCompanies : function allCompanies() {
                return $http.get('/hubble/companies');
            },
            allCompaniesForSegments : function allCompaniesForSegments(segmentId) {
                return $http.get('/hubble/companies');
            }
        };

        return service;
    }

    companyService.$inject=['$http'];

    return companyService;
});