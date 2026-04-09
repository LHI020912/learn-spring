/**
 * 
 */
  $(document).ready(function(){
	$('#bookNoCheckBtn').on('click',function(){
		event.preventDefault();
		
		let bookNo = $('#bookNo').val();
		
		if(bookNo == "") {
			alert("도서 번호를 입력하세요."); 
			return false;
		}else{
			axios.get("/mybatis/book/bookNoCheck_axios_get/"+bookNo)
				.then(function(response){
				console.log(response.data)
				if(result == "available") { alert("사용 가능한 번호입니다."); }
				else { alert("사용 불가능한 번호입니다."); }
				})
				.catch(
					(error)=> {console.log(error.response)}
				)
		}
	}); 
});