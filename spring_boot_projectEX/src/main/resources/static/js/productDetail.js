/**
 * 
 */

window.onload=function(){
	let qty =1;
	let plusBtn=document.getElementById('plusBtn');
	let minusBtn=document.getElementById('minusBtn');
	
	plusBtn.addEventListener('click',()=>{
		
	})

	minusBtn.addEventListener('click',()=>{
		
	})
}

// 주문 수량 변경 함수
function qtyChange(num){
	qty = qty+num;
	if(qty < 1) qty=1;
	// 주문액 계산하는 함수 호출
	calcAmount();
}

// 주문 수량 변경 될 때 주문액 계산 및 내용 태그에 풀력
function calcAmount(){
	let cartQty = docement.getElementById('cartQty');
	let amount = docement.getElementById('amount');
	
	let price = document.getElementById('price').dataset.price;
	
	let total = qty * price;
	
	// 결과값 반영
	cartQty.value=qty;
	amount.innerHTML = total.toLocaleString(); // 천단위 구분
}