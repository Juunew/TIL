$(document).ready(function(){
	$(document).on('click', '#memberDeleteBtn', function(){
		const r = confirm("정말 탈퇴하시겠습니까?");
			if(r == true) {
				$.post('main',
					{sign : "memberDelete"},
					function(data){
						alert(data);
					}
				);
			}
	});
	
	console.log("index ready");
});