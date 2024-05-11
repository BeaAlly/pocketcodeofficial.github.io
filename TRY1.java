$('#scroller').scroll(function () {
     if ($(this).scrollTop() > 0) {
        $('#scroller').addClass("custom-scroll");
        } else {
        $('#scroller').removeClass("custom-scroll");
        }
});


$('.img-defile').each(function(i) {
     $pT=$("#scroller").height();
     $pL=$("#scroller").width();
     $(this).css({
        top:Math.floor(Math.random()*$pT),
        left:Math.round(Math.random()*$pL)
      });
  });