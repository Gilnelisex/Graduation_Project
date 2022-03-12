window.onload = function () {
    getVCode();
}

/**
 * 获取验证码
 * 将验证码写到login.html页面的id = verifyimg 的地方
 */
function getVCode() {
    document.getElementById("code").src = timestamp("http://localhost:8080/verifyCode");
}

//为url添加时间戳
function timestamp(url) {
    var getTimestamp = new Date().getTime();
    if (url.indexOf("?") > -1) {
        url = url + "&timestamp=" + getTimestamp
    } else {
        url = url + "?timestamp=" + getTimestamp
    }
    return url;
}


