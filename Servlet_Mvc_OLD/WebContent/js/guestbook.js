/**
 * guestbook.js
 */
 
 function check(){ //function 키워드로 check()함수정의
 
    let $gname = $.trim($('#gname').val()); //$gname은 jQuery 변수명, $.trim()은 jQuery함수로
    //서 양쪽 공백을 제거한다. val() jQuery함수는 입력필드에 입력한 값을 가져온다.
    if($gname == ''){//방명록 글쓴이가 빈공백과 같을때
      window.alert('글쓴이를 입력하세요!');//window.은 생략가능
      $('#gname').val('');//글쓴이 입력필드를 초기화
      $('#gname').focus();//글쓴이 입력필드로 포커스 이동
      return false;
     }

    if($.trim($('#gtitle').val()).length == 0) {//length속성은 문자열 길이를 반환
       alert('글제목을 입력하세요!');
       $('#gtitle').val('').focus();//한줄로 연이어서 사용하는 메서드 체이밍 방법을 사용
       return false;
    }    
    
    if(jQuery.trim(jQuery('#gcontent').val()) == '') {//$ 대신 jQuery 를 사용해도 된다.
       alert('글내용을 입력하세요!');
       $('#gcontent').val('').focus();//글내용 입력필드 초기화하고 포커스 이동
       return false;
    } 
} 
