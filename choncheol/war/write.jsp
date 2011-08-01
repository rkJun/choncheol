<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>ChonCheol[촌철].appspot.com</title>

	<script>
		function doWrite() {
			document.form1.actionMethod.value="write";
			document.form1.submit();
		}
	</script>

  </head>


  <body>
  
    <header>
      <h1>촌철살인의 한마디</h1>      
      <h6>촌철살인 [寸鐵殺人] : 한 치의 쇠붙이로 살인한다는 뜻으로, 날카로운 경구로 상대편의 급소를 찌름을 비유하여 이르는 말.</h6>
    </header>

     
    	<form name="form1" method="get" >
			누가    : <input type="text" name="wiseAuthor" /> <br/>
			말했나  : <input type="text" name="wiseContent" /> <br/>
			누가 (원문): <input type="text" name="wiseContentOrg" /> <br/>
			말했나 (원문)  : <input type="text" name="wiseAuthorOrg" /> <br/>
  	  		<a onclick="doWrite()" href="/write">write</a>
    	</form>
	<footer>
		<h6>choncheol.appspot.com 촌철살인의 한마디. 2011.08.v001 rkJun (알케이준)</h6>
	</footer>

  </body>
</html>
    		