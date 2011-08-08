<%@page import="com.appspot.choncheol.comm.DateUtil"%>
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
    	[ <a href="/index.jsp">top</a> ] [ 전체목록 ] [ root ]
    </nav>    
	<p>&nbsp;</p>
    <section>
    	<article>
    		<table>
    			<tr>
    				<th>Id</th>
    				<th>명언</th>
    				<th>출처</th>
    				<th>명언 (원문)</th>
    				<th>출처 (원문)</th>
    				<th>글 올린 이</th>
    				<th>글 올린 날</th> 
    				<th>글 고친 날</th>
    				<th>글 고친 이</th>
    				<th>삭제여부</th>
    			</tr>
<%
	if ( resultList == null || resultList.isEmpty()) {
%>
				<tr>
					<td colspan="10">작성된 글이 없습니다.</td>
				</tr>
<% 
	}else {

		for (MemoriesJDO resultJdo : resultList ) {
%>
				<tr>
					<td><%= resultJdo.getId() %> </td>
					<td><%= resultJdo.getWiseContent() %> </td>
					<td><%= resultJdo.getWiseAuthor()%> </td>
					<td><%= resultJdo.getWiseContentOrg()%> </td>
					<td><%= resultJdo.getWiseAuthorOrg()%> </td>
					<td><%= resultJdo.getWriteUser()%> </td>
					<td><%= DateUtil.getShortDate(resultJdo.getWriteDate())%> </td>
					<td><%= resultJdo.getUpdateUser()%> </td>
					<td><%= DateUtil.getShortDate(resultJdo.getUpdateDate())%> </td>
					<td><%= resultJdo.isDelete()%> </td>
				</tr>
<%		}
	}
%>
    		</table>			
    	</article>
    </section>	

	<footer>
		<h6>choncheol.appspot.com 촌철살인의 한마디. 2011.08 version 0.1 rkJun (알케이준)</h6>
	</footer>

  </body>
</html>
