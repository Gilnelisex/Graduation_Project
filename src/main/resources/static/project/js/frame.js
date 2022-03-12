function passwordUpdate() {
    $.get(`/passwordChange`, function (resp) {
        $('#updateform-modal-body').html(resp);
    });
    // $('.bs-updateform-modal-lg').on('hidden.bs.modal', function (e) {
    //     // do something...
    //     window.alert('模态框隐藏后触发的动作。')
    // })
}

function changePic(id) {
    $.get(`/getChangePic/${id}`, function (resp) {
        $('#updateform-modal-body0').html(resp);
    });
}

