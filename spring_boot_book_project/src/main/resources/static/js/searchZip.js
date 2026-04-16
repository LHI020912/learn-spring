/**
 *  우편번호 검색
 */

$(document).ready(function(){
	$('#searchZipBtn').on('click',function(){
		new daum.Postcode(
			{
				oncomplete:function(data){
				let address1="";
				// 도로명 주소인 경우
				if(data.userSelectedType=='R'){
					address1=data.roadAddress+"("+data.bname+data.buildingName+")";
				}else{ // 지번 주소인 경우
					address1=data.jibunAddress
				}
				document.getElementById('memZipcode').value=data.zonecode;
				document.getElementById('memAddress1').value=address1;
							
				let address2 = document.getElementById('memAddress2');
				$('#memAddress2').val("").focus();
				}
			}				
		).open(); // 다음 제공 우편번호 객체를 구성하고 검색창 열기	
	});
});