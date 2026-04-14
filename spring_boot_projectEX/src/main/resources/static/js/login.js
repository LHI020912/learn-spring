/**
 * login.js
 * 연습문제
 * 로그인 요청 전에 폼 데이터 비어있는지 여부에 따라 진행하는 스크립트
 * 로그인 실패 했을 경우 아이디 비밀번호 reset후에 id 입력란에 포커스
 */

$(document).ready(function(){
    $('#loginForm').on('submit',function(event){
        event.preventDefault();
        
        $.ajax({
            type:"post",
            url:"/member/login",
            data:{"id":$('#id').val(), "pwd":$('#pwd').val()},
            dataType:"text",
            success:function(result){ // result 매개변수 추가 (필수!)
                if(result === "success"){ // === 사용 권장
                    alert("로그인 성공 \nMain 페이지로 이동합니다.");
                    location.href="/";
                } else { 
                    alert("아이디 또는 비밀번호가 일치하지 않습니다.");
					$('#pwd').val("");
					$('#id').val("").focuse();
                }
            },
            error:function(){ alert("전송실패"); }
        });
    });
});