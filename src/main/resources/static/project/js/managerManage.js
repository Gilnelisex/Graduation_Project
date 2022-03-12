function insertManager() {
    $.get(`/getInsertManager`, function (resp) {
        $('#updateform-modal-body1').html(resp);
    });
}

function updateManager(id) {
    $.get(`/getChangeManager/${id}`, function (resp) {
        $('#updateform-modal-body2').html(resp);
    });
}

function deleteManager(id) {
    $.get(`/getDeleteManager/${id}`, function (resp) {
        $('#updateform-modal-body3').html(resp);
    });
}

function resetPassword(id) {
    $.get(`/getResetPassword/${id}`, function (resp) {
        $('#updateform-modal-body4').html(resp);
    });
}

function insertUser() {
    $.get(`/getInsertUser`, function (resp) {
        $('#updateform-modal-body1').html(resp);
    });
}

function updateUser(id) {
    $.get(`/getChangeUser/${id}`, function (resp) {
        $('#updateform-modal-body2').html(resp);
    });
}

function deleteUser(id) {
    $.get(`/getDeleteUser/${id}`, function (resp) {
        $('#updateform-modal-body3').html(resp);
    });
}

function resetPasswordu(id) {
    $.get(`/getResetPasswordu/${id}`, function (resp) {
        $('#updateform-modal-body4').html(resp);
    });
}