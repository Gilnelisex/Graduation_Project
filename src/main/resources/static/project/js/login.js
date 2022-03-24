$(document).ready(function() {
    getVCode();
})

/**
 * 获取验证码
 * 将验证码写到login.html页面的id = verifyimg 的地方
 */
function getVCode() {
    document.getElementById("code").src = timestamp("/verifyCode");
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

function submits() {
    var account = $("#account").val();
    var password = $("#password").val();
    var verify = $("#verify").val();
    if(account == null || account.trim().length === 0) {
        window.alert("账号不能为空!");
    }else if(password == null || password.trim().length === 0) {
        window.alert("密码不能为空!");
    }else if(verify == null || verify.trim().length === 0) {
        window.alert("验证码不能为空!")
    }else {
        return true;
    }
    return false;
}


