/**
 * 
 */

let qty = 1;

window.onload = function() {
    let plusBtn = document.getElementById('plusBtn');
    let minusBtn = document.getElementById('minusBtn');
    
    // 버튼 클릭 시 qtyChange 함수를 호출하도록 연결
    plusBtn.addEventListener('click', () => {
        qtyChange(1);
    });

    minusBtn.addEventListener('click', () => {
        qtyChange(-1);
    });
};

// 주문 수량 변경 함수
function qtyChange(num) {
    qty = qty + num;
    if (qty < 1) qty = 1;
    // 주문액 계산하는 함수 호출
    calcAmount();
}

// 주문 수량 변경 될 때 주문액 계산 및 내용 태그에 출력
function calcAmount() {
    let cartQty = document.getElementById('cartQty');
    let amount = document.getElementById('amount');
    
    let price = Number(document.getElementById('price').dataset.price);
    
    let total = qty * price;
    
    cartQty.value = qty;
    amount.innerHTML = total.toLocaleString(); 
}