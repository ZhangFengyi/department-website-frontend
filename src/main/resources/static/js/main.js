$(function(){
	$('#menu li').click(function(){
		$(this).addClass("on").siblings().removeClass();
	})
})