(function () {
    angular.module("home", [
        "ui.router",
        "admin",
        "student"
    ])
        .directive("materialSelect", function ($timeout) {
            function link(scope, element, attrs) {
                $timeout(function () {
                    element.material_select();
                }, 30, false);

            }

            return {
                link: link
            };

        })
}());