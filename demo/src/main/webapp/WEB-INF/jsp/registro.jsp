<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Registro</title>
	</head>
	
	<body>

		<h1>REGISTROS</h1>
		
		<br />
		
		<form action="/registro/listarPecas" method="post">
			<input type="text" name="nomeCliente" value="${nomeCliente}">

			<select name="idVeiculo">
				<c:forEach items="${veiculos}" var="veiculo">
					<option value="${veiculo.id}">${veiculo.nome}</option>
				</c:forEach>
			</select>
			
			<input type="submit" value="Listar Peças" />
		</form>
		<form action="/registro/salvar" method="post">

			<c:if test="${not empty registros}">
				<br /><br />
	
				<input type="hidden" name="veiculo.id" value="${veiculo.id}">
				<input type="hidden" name="cliente" value="${nomeCliente}">
				
				<table >
					<tr>
				    	<th></th>
				    	<th>Peça</th>
				    	<th>Defeito</th>
				  	</tr>
				  	<c:forEach items="${registros}" var="reg">
						<tr>
					    	<td><input type="checkbox" name="selecionados" value="${reg.peca.id}_${reg.defeito.id}" /></td>
					    	<td>${reg.peca.nome}</td>
					    	<td>${reg.defeito.nome}</td>
					  	</tr>
					</c:forEach>
				</table>
				<input type="submit" value="Gravar" />
			</c:if>
		</form>
		
	</body>
</html>