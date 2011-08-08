<%@page import="java.util.List"%>
<%@page import="com.appspot.choncheol.jdo.MemoriesJDO"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
	MemoriesJDO resultJdo = (MemoriesJDO) request.getAttribute("resultJdo");
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<link type="text/css" rel="stylesheet" href="/css/main.css" />
    <title>ChonCheol[촌철].appspot.com</title>

	<script>
	</script>

  </head>


  <body>
  
    <header>
      <h1>촌철살인의 한마디</h1>      
      <h6>촌철살인 [寸鐵殺人] : 한 치의 쇠붙이로 살인한다는 뜻으로, 날카로운 경구로 상대편의 급소를 찌름을 비유하여 이르는 말.</h6>
    </header>
    
    <nav>

    </nav>    

    <section>
    	<article>
<%
	if ( resultJdo == null || "".equals(resultJdo.getWiseAuthor())) {
		out.println("No data Found<br/>");
	}else {
%>
		[ No : <%=resultJdo.getId()%> ] <br/>
		[ 명언 : <%=resultJdo.getWiseContent() %> ]  - <%=resultJdo.getWiseAuthor() %><br/>	
		<br/>
		<% if (!"".equals(resultJdo.getWiseContentOrg())) { %>
			[ 원문 : <%=resultJdo.getWiseContentOrg() %> ] - <%=resultJdo.getWiseAuthorOrg() %><br/>
		<% } %>
<%				
	}
%>

    	</article>
    </section>	

	<footer>
		<h6>choncheol.appspot.com 촌철살인의 한마디. 2011.08 version 0.1 rkJun (알케이준)</h6>
	</footer>

  </body>
</html>
