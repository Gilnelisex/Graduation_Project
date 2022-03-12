function changePics() {
    var reads = new FileReader();
    var pics = document.querySelector("#file").files[0];
    var size = (pics.size/1024).toFixed(0);
    reads.readAsDataURL(pics);
    reads.onload = function(e) {
        document.querySelector(".review").src = this.result;
        if(size >= 1024) {
            document.querySelector("#picSubmit").style.background="darkgray"
            document.querySelector("#picSubmit").disabled = true;
            window.alert("图片最大不能超过1MB!")
        }else {
            document.querySelector("#picSubmit").style.background="#189f92"
            document.querySelector("#picSubmit").disabled = false;
        }
    }
}