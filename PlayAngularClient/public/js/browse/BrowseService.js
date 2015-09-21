define(function(){

    function browseService($http){
    	var service = {};
    	
    	// Returns  a promise
        service.browseEntity = function browseEntity() {
            return $http.get('/hubble/segments');
        };
                 
        console.log(service);
        
        return service;
    }

    browseService.$inject=['$http'];

    return browseService;
});