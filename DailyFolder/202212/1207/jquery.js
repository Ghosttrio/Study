
window.onload = function() {
    // let h1s = document.querySelectorAll("h1");
    // for(let i=0; i<h1s.length; i++){
    //     h1s[i].innerHTML = "hello";
    // }
    // console.log(h1s)


    // jQuery === $
    $("h1").html("hello");
    //  == document.querySelectorAll("h1");

    let h1 = $("h1"); // 배열이다 // innerHTML 못씀
    console.log(h1);
    console.log(h1[0].innerHTML);

    $('<p id="test">My <em>new</em> text</p>').appendTo('body');


    $(function () {
        // Do something...
    });
    
    $(()=>{
        // Do something...
    })


    let b = document.querySelector("#div1.cDiv");
    let div1 = document.querySelector("#div1");
    let c = div1.querySelector(".cDiv")
    // b === c

    $("#div1 .cDiv");
    let $div1 = $("#div1");
    let $div2 = $div1.find(".cDiv");
    // c === $c[0]

    // $("#btn").off("click");
    // dom에 click 이벤트 모두 삭제
    // 이벤트 줄때 무조건 off먼저 걸어주고 on
    $("#btn").off("click").on("click", function(){
        
        // $("#input1").val() // === $("#input1")[0].value
        let value1 = $("#input1").val();
        // $("#msg").html(value1);
        let html = "<p>" + value1 + "</p>"
        // $("#msg").append(html);
        $("#msg").prepend(html);
        // $("h1").hide();
        $("h1").show();
        // $("h1").remove();
        // $("#msg").empty();
        let val = $("#msg").attr("id");
        $("#msg").attr("data-id", "test");
        // attr() 요소하나면 getattr 두개면 setattr

        console.log(val);

        let chk = $("#chk").prop("checked")
        console.log(chk);
    })


    // 특정부분만 없애주려면 click.id1처럼 작성
    // on === addEventListener


    $("#chk").prop("checked",true);
    $("#chk").prop("checked",false);
    $("#msg").addClass("blue");
    $("#msg").removeClass("blue");
    $("#msg").css("background-color", "red");

    if($("#msg").hasClass("red")){

    }
    if($("#msg").css)


    // .position()
    // .scrollTop()

    console.log( $("#msg").width());

    // 2022값 가져오기
    $("#msg").attr("data-year")
    $("#msg").data("year")
}