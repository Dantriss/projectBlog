let index ={
    init: function(){
        $("#btn-save").on("click",()=>{ //function(){} 을 사용하지 않고 ()=>{}을 사용한이유 :  this를 바인딩하기 위해서
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


            //ajax 호출시 default 가 비동기 호출
            //ajax 통신을 이용해서 3개의 데이터를 Json으로 변경하여 insert 요청

            $.ajax({
                type : "POST",
                url : ""

            }).done(function() {

            }).fail(function() {

            });
    }
}

index.init();