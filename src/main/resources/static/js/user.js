let index ={
    init: function(){
        $("#btn-save").on("click",()=>{
            this.save();
        });
    },

    save: function(){
//        alert("user의 save 함수 호출");


        let data = {
            user_id : $("user_id").val(),
            password : $("password").val(),
            email : $("email").val()
            }

            console.log(data);
            console.log("hi");

            $.ajax().done().fail();
    }
}

index.init();