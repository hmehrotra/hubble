define(function(){

    function countryService($http){

        var service = {
            allCountries : function allCountries() {
                return $http.get('/hubble/countries');
            },
            allCountriesForCompany : function allCountriesForCompany(companyId) {
                return $http.get('/hubble/countries');
            }
        };

        return service;
    }

    countryService.$inject=['$http'];

    return countryService;
});