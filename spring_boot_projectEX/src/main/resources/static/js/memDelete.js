/**
 *  회원탈퇴
 */
$(document).ready(function(){
	$('.deleteBtn').on('click', function(){
	    var prdNo = $(this).data('no');
		
		if(confirm("정말 탈퇴하시겠습니까?")) {
		    $.ajax({
		        url: "<c:url value='/member/memberDelete'/>",
		        type: "post",
		        success: function(result) {
		            if(result == "success") {
		                alert("탈퇴되었습니다.");
		                location.href = "<c:url value='/'/>";
		            }
		        },
		        error: function() {
		            alert("오류가 발생했습니다.");
		        }
		    });
		}
	});
});