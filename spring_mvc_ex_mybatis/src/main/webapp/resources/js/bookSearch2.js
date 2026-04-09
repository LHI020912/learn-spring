$(document).ready(function(){
 	$("#bookSearchFrm2").on('submit', function(e) {
    	e.preventDefault();
 		
 		let formData = $(this).serialize();
 		let keyword = $("#keyword").val();
 		let type = $("#type").val();
 		
 		if(keyword=="" || type==""){ alert("검색조건과 검색어를 입력해주세요."); }
 		else{
 			$.ajax({
 				type:"post",
 				url:"/mybatis/book/bookSearch2",
 				data:formData,
 				success:function(result){
 					console.log(result);
 					$("#searchResultBox").html(result);
 				},
 				error:function(){ alert("전송실패"); }
 			}); // ajax 끝
 		} // else
 	});//on 
 });//ready