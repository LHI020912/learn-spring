/**
 * 회원 가입 시 id 중복 체크 : idCheck.js
 * 연습문제
 * 사용 불가능한 id일 경우 id 입력란을 지우고 포커스 이동
 */

$(document).ready(function(){
    $('#joinForm').on('submit',function(event){
        event.preventDefault();
		let memId = $('#memId').val();
		
		if(memId ==""){ alert("ID를 입력하세요"); }
		else{ 
			$.ajax({
				type:"post",
				url:"/member/idCheck",
				data:{"id":memId},
				dataType:"text",
				success:function(result){
					if(result=="1"){ 
						alert("사용할 수 없는 ID 입니다.");
						$('#memId').val("").focus();
					}else { alert("사용가능한 ID입니다.");}
				},
				error:function(){ alert("실패"); }
			});
		}
    });
});