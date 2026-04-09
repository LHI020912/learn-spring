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
			let data={bookNo:bookNo};
			
			axios.post("/batis/book/bookNoCheck_axios_post/",data)
				.then(function(response){
				console.log(response.data)
				if(response.data=="available") { alert("사용 가능 번호"); }
				else { alert("사용 불가능 번호"); }
				})
				.catch(
					(error)=> {console.log(error.response)}
				)
		}
	}); 
});