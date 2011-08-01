<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.appspot.choncheol.jdo.MemoriesJDO"%>
<%@page import="java.util.List"%>

<%
	List<MemoriesJDO> resultList = (List<MemoriesJDO>) request.getAttribute("resultList");
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List</title>
</head>
<body>
목록test<br/>
------<br/>
<%

	System.out.println("resultList:"+resultList);
	if ( resultList == null || resultList.isEmpty()) {
		out.println("No data Found<br/>");
	}else {

		for (MemoriesJDO resultJdo : resultList ) {
%>
	id : <%=resultJdo.getId() %> ,
    author : <%=resultJdo.getWiseAuthor() %> ,
    contents : <%=resultJdo.getWiseContent() %> , 
<%
		}	
	}
%>
------

</body>
</html>