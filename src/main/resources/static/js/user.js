let index ={
    init: function(){
        $("#btn-save").on("click",()=> {
            this.save();
            });
        },

        save : function(){
        alert("testing");

            let data = {

                user_id : $("#user_id").val(),
                password : $("#password").val(),
                email : $("#email").val()
                }

                console.log(data);
                console.log(JSON.stringify(data));


            //ajax 호출시 default 가 비동기 호출
            //ajax 통신을 이용해서 3개의 데이터를 Json으로 변경하여 insert 요청
            //ajax가 통신을 성공하고 서버가 json을 리턴해주면 자봉으로 자바오브젝트로 변환

            $.ajax({
                type : "POST",
                url : "/blog/api/user",
                data : JSON.stringify(data), //http body데이터
                contentType : "application/json; charset=utf-8", //bod데이터가 어떤 타입인지(MIME)
                dataType : "json" //요청을 서버로해서 응답이 왔을 때 기본적으로 모든 것이 문자열(생긴게 json이라면) => javasctipObject로 응답해줌

            }).done(function(resp) {
                alert("회원가입완료");

                location.href ="/blog/user"
            }).fail(function(error) {
                alert(JSON.stringify(error));
            });




    }
}

index.init();