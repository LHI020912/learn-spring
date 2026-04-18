/**
 * 상품번호 중복 체크 : ajax 활용
 */
 
 $(document).ready(function(){
	$('#prdNoCheckBtn').on('click',function(){
		event.preventDefault();
		
		let prdNo = $('#prdNo').val();
		
		if(prdNo == "") {
			alert("상품번호를 입력하세요."); 
			return false;
		}else{
			// javascript 내장함수 : post방식 featch("url+data").then().catch()
			fetch("/batis/product/prdNoCheck3",
				{
					method:'post',
					headers:{
						'Content-Type':'application/json'
					},
					body:prdNo
				})
			.then(response=>response.text())
			.then(result=>{
					console.log(result);
					if(result == "available") { alert("사용 가능한 번호입니다."); }
					else { alert("사용 불가능한 번호입니다."); }
				})
			.carch(err=> console.log(err));
		}
	}); 
});