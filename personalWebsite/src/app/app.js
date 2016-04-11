(function() {
        var personalWebsite = angular.module('personalWebsite', ['ngRoute','ngMessages'])
            .config(['$routeProvider', '$locationProvider', function ($routeProvider, $locationProvider) {
            $routeProvider.when('/login', {
                templateUrl: 'src/app/templates/login.html',
                controller: 'LoginController',
                controllerAs: 'LoginVm'
            }).when('/details', {
                templateUrl: 'src/app/templates/details.html',
                controller: 'DetailsController',
                controllerAs: 'DetailsVm'
            }).otherwise({
                redirectTo: '/login'
            });

           /* $locationProvider.html5Mode(true);*/
        }]);
    }
)();