define(function(){

    function browseService($http){
    	var service = {};
    	
        service.browseEntity = function browseEntity() {
                return $http.get('/hubble/segments');
        };
                 
        console.log(service);
        
        return service;
    }

    browseService.$inject=['$http'];

    return browseService;
});