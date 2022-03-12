function changePassword() {
    var password = document.querySelector("#newPassword").value;
    var confirmpassword = document.querySelector("#confirmPassword").value;
    var tests = / /;
    if (password === "" || confirmpassword === "") {
        window.alert("密码不能为空");
    } else if (tests.test(password) || tests.test(confirmpassword)) {
        window.alert("密码不能包含空格");
    } else if (password === confirmpassword) {
        document.querySelector("#passwordChange").submit();
    } else {
        window.alert("两次密码不一致");
    }
}