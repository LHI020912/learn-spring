/**
 * 상품번호 중복 체크 : ajax get 활용
 */
 
 $(document).ready(function(){
	$('#prdNoCheckBtn').on('click',function(){
		event.preventDefault();
		
		let prdNo = $('#prdNo').val();
		
		if(prdNo == "") {
			alert("상품번호를 입력하세요."); 
			return false;
		}else{
			// axios.get("url"+data).then(function(response){처리코드}).catch()
			axios.get("/batis/procut/prdNoCheck4/"+prdNo)
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