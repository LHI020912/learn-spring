/**
 * id 중복 체크
 */

$(document).ready(function(){
	$('#joinForm').on('submit',function(event){
		event.prevenDefault();
		let memId = $('#memId').val();
		
		if(memId=="") { alert("ID를 입력하세요."); }
		else{
			$.ajax({
				type:"post",
				url:"/member/idCheck",
				data:{"id":memId},
				dataType:"text",
				success:function(result){
					if(result=="1"){
						alert("사용할 수 없는 ID입니다.")
						$('#memId').val("").focus();
					}else{ alert("사용가능한 ID입니다."); }
				},
				error:function(){ alert("실패"); }
			});
		}
	});
});