/**
 *  상품 삭제
 */
$(document).ready(function(){
    $('.deleteBtn').on('click', function(){
        var prdNo = $(this).data('no');
		var ctgId = $(this).data('ctg');
        
        if(confirm("해당 상품을 정말 삭제하시겠습니까?")) {
            $.ajax({
                url: "/product/deleteProduct",
                type: "post",
                data: { "prdNo": prdNo },
                success: function(result) {
                    if(result == "success") {
                        alert("상품이 삭제되었습니다.");
                        location.href = "/product/productCtgListView/"+ctgId;
                    }
                },
                error: function() {
                    alert("삭제 중 오류가 발생했습니다.");
                }
            });
        }
    });
});