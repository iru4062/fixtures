<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="./common/top.jsp"></jsp:include>

	<div>
		<select>
		<c:forEach  var="x" items="${listCode}" varStatus="i" >
			<option value="${x.CODE_ID}">${x.CODE_NAME}</option>
		</c:forEach>	
		</select>
	
	</div>

	<div>
		<table class="table table-bordered"> 
				<!-- 8개 -->
				<tr>
				  	<td>No</td>
				  	<td>품목</td>
				  	<td>관리번호</td>
				  	<td>모델명</td>
				  	<td>규격</td>
				  	<td>창고위치</td>
				  	<td>상태</td>
				  	<td>당회배정</td>
			  	</tr>
				<c:forEach  var="x" items="${list}" varStatus="i" >
				<tr>
				  <td> ${i.index} </td>
				  <td> ${x.ITEM_NAME} </td>
				  <td> ${x.ITEM_MANAGEMENT_NUMBER} </td>
				  <td> ${x.ITEM_MODEL_NAME} </td>
				  <td> ${x.ITEM_STANDARD} </td>
				  <td> ${x.ITEM_LOCATION} </td>
				  <td> ${x.ITEM_STATE_CODE} </td>
				  <td> ${x.ITEM_ASSIGN_HALL} </td>
				</tr>  
				</c:forEach>
		
		</table>
	</div>
</body>
</html>