define(['angular', './SegmentListController'], function(angular, segmentListCtrl){
    angular.module('segmentListModule',[])
           .config(['$routeProvider'] , function($routeProvider){
                $routeProvider.when('/home', { templateUrl: 'views/homePage.html', controller: segmentListCtrl});
           })
           .controller('segmentListCtrl', segmentListCtrl);
});



