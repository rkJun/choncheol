<%@page import="java.util.List"%>
<%@page import="com.appspot.choncheol.jdo.MemoriesJDO"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
	List<MemoriesJDO> resultList = (List<MemoriesJDO>) request.getAttribute("resultList");
%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
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
    	[ <a href="/index.jsp">top</a> ] [ 전체목록 ] [ root ]
    </nav>    
	<p>&nbsp;</p>
    <section>
    	<article>
<%

	System.out.println("resultList:"+resultList.size());
	if ( resultList == null || resultList.isEmpty()) {
		out.println("No data Found<br/>");
	}else {

		for (MemoriesJDO resultJdo : resultList ) {
%>
<%
	out.println("1"+resultJdo.getId());
	out.println("2"+resultJdo.getUpdateUser());
	out.println("3"+resultJdo.getWiseAuthorOrg());
	out.println("4"+resultJdo.getWiseContentOrg());
	out.println("5"+resultJdo.getWriteUser());
	out.println("6"+resultJdo.getUpdateDate());
	out.println("7"+resultJdo.getWriteDate());
%>

	[ <%=resultJdo.getWiseContent() %> ]  - <%=resultJdo.getWiseAuthor() %><br/>	
<%
		}	
	}
%>

    	</article>
    </section>	

	<footer>
		<h6>choncheol.appspot.com 촌철살인의 한마디. 2011.08 version 0.1 rkJun (알케이준)</h6>
	</footer>

  </body>
</html>
