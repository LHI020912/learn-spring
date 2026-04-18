/**
 * 상품번호 중복 체크 : ajax post 활용
 */
 
 $(document).ready(function(){
	$('#prdNoCheckBtn').on('click',function(){
		event.preventDefault();
		
		let prdNo = $('#prdNo').val();
		
		if(prdNo == "") {
			alert("상품번호를 입력하세요."); 
			return false;
		}else{
			let data={prdNo:prdNo}; // json 형식의 데이터
			// axios.post("url",data).then(function(response){처리코드}).catch()
			axios.post("/batis/procut/prdNoCheck5/",data)
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