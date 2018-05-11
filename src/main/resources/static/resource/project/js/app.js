/*
启动 App
 */
var baohao_app = angular.module('app', ["ui.router", 'ngAnimate', 'ui.bootstrap', 'ng-pagination', 'ngFileUpload', 'cgBusy', 'ngSanitize', 'localytics.directives']);

/*
fit2cloud_app.run(function ($rootScope) {
    $rootScope.getLength = function (str) {
        ///<summary>获得字符串实际长度，中文2，英文1</summary>
        ///<param name="str">要获得长度的字符串</param>
        var realLength = 0, len = str.length, charCode = -1;
        for (var i = 0; i < len; i++) {
            charCode = str.charCodeAt(i);
            if (charCode >= 0 && charCode <= 128) realLength += 1;
            else realLength += 2;
        }
        return realLength;
    };

    //页面初次打开或刷新后，根据state自动展开左侧菜单
    $rootScope.$on("$stateChangeSuccess", function (event, toState, toParams, fromState) {
        if (fromState.name === "") {
            try {
                var targetName = toState.name;
                var menuItem = $("[ui-sref='" + targetName + "']");
                if (menuItem) {
                    menuItem.parents(".has_sub").children(":first").trigger("click");
                    menuItem.trigger("click");
                }
            } catch (e) {
                console.log(e);
            }
        }
    });

    $rootScope.window = window;

});
 */

baohao_app.run(function ($rootScope) {
    $rootScope.getLength = function (str) {

    };

    $rootScope.$on("$stateChangeSuccess", function (event, toState, toParams, fromState) {

    });

    $rootScope.window = window;
});

/*
fit2cloud_app.config(function ($stateProvider, $urlRouterProvider, $httpProvider) {

    $stateProvider.state('ctrl_table', {
        url: "/ctrl/table",
        templateUrl: "page/project/demo/control/table.html" + '?_t=' + window.appversion
    }).state('ctrl_table2', {
        url: "/ctrl/table2",
        templateUrl: "page/project/demo/control/table2.html" + '?_t=' + window.appversion
    });

    $httpProvider.interceptors.push('sessionInjector');

    $urlRouterProvider.when("", "/wizard");
});
 */

baohao_app.config(function ($stateProvider, $urlRouterProvider, $httpProvider) {
    $stateProvider.state('news', {
        url: "/news",
        templateUrl: "page/project/news.html" + "?_t=" + window.appversion,
    });
    $httpProvider.interceptors.push('sessionInjector');
});

/*
fit2cloud_app.factory('sessionInjector', function ($q) {
    return {
        response: function (response) {
            var deferred = $q.defer();
            if (typeof(response.data) === "string" && response.data.indexOf("loginApp") !== -1) {
                notification.alert("认证信息已过期，请重新登录", function () {
                    location.reload();
                });
            } else {
                deferred.resolve(response);
            }
            return deferred.promise;
        }
    };
});
 */

baohao_app.factory('sessionInjector', function ($q) {
    return {
        response: function (response) {
            var deferred = $q.defer();
            if (typeof(response.data) === 'string' && response.data.indexOf('loginApp') !== -1) {
                notification.alert("认证信息已过期，请重新登录！", function () {
                    location.reload();
                });
            } else {
                deferred.resolve(response);
            }
            return deferred.promise;
        }
    }
});
