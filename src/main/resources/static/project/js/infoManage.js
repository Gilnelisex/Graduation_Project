function insertBase() {
    $.get(`/getInsertBase`, function (resp) {
        $('#updateform-modal-body1').html(resp);
    });
}

function updateBase(id) {
    $.get(`/getUpdateBase/${id}`, function (resp) {
        $('#updateform-modal-body2').html(resp);
    });
}

function sjBase(id) {
    $.get(`/getSjBase/${id}`, function (resp) {
        $('#updateform-modal-body4').html(resp);
    });
}

function xjBase(id) {
    $.get(`/getXjBase/${id}`, function (resp) {
        $('#updateform-modal-body5').html(resp);
    });
}

function deleteBase(id) {
    $.get(`/getDeleteBase/${id}`, function (resp) {
        $('#updateform-modal-body3').html(resp);
    });
}

function insertActivity() {
    $.get(`/getInsertActivity`, function (resp) {
        $('#updateform-modal-body1').html(resp);
    });
}

function updateActivity(id) {
    $.get(`/getUpdateActivity/${id}`, function (resp) {
        $('#updateform-modal-body2').html(resp);
    });
}

function sjActivity(id) {
    $.get(`/getSjActivity/${id}`, function (resp) {
        $('#updateform-modal-body4').html(resp);
    });
}

function xjActivity(id) {
    $.get(`/getXjActivity/${id}`, function (resp) {
        $('#updateform-modal-body5').html(resp);
    });
}

function deleteActivity(id) {
    $.get(`/getDeleteActivity/${id}`, function (resp) {
        $('#updateform-modal-body3').html(resp);
    });
}

function insertReview() {
    $.get(`/getInsertReview`, function (resp) {
        $('#updateform-modal-body1').html(resp);
    });
}

function updateReview(id) {
    $.get(`/getUpdateReview/${id}`, function (resp) {
        $('#updateform-modal-body2').html(resp);
    });
}

function sjReview(id) {
    $.get(`/getSjReview/${id}`, function (resp) {
        $('#updateform-modal-body4').html(resp);
    });
}

function xjReview(id) {
    $.get(`/getXjReview/${id}`, function (resp) {
        $('#updateform-modal-body5').html(resp);
    });
}

function deleteReview(id) {
    $.get(`/getDeleteReview/${id}`, function (resp) {
        $('#updateform-modal-body3').html(resp);
    });
}

function qrJoinInfo(id) {
    $.get(`/getQrJoinInfo/${id}`, function (resp) {
        $('#updateform-modal-body1').html(resp);
    });
}

function qxJoinInfo(id) {
    $.get(`/getQxJoinInfo/${id}`, function (resp) {
        $('#updateform-modal-body2').html(resp);
    });
}

function deleteJoinInfo(id) {
    $.get(`/getDeleteJoinInfo/${id}`, function (resp) {
        $('#updateform-modal-body3').html(resp);
    });
}

function insertRotation() {
    $.get(`/getInsertRotation`, function (resp) {
        $('#updateform-modal-body1').html(resp);
    });
}

function updateRotation(id) {
    $.get(`/getUpdateRotation/${id}`, function (resp) {
        $('#updateform-modal-body2').html(resp);
    });
}

function sjRotation(id) {
    $.get(`/getSjRotation/${id}`, function (resp) {
        $('#updateform-modal-body4').html(resp);
    });
}

function xjRotation(id) {
    $.get(`/getXjRotation/${id}`, function (resp) {
        $('#updateform-modal-body5').html(resp);
    });
}

function deleteRotation(id) {
    $.get(`/getDeleteRotation/${id}`, function (resp) {
        $('#updateform-modal-body3').html(resp);
    });
}