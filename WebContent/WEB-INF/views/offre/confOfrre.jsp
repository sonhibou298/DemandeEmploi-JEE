<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../../../header.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation</title>
</head>
<body>
	<div class="container col-md-8 col-md-offset-2 col-xs-12 ">
		<div class="panel panel-primary">
			<div class="panel-heading">Offre Validée </div>
				<div class="panel-body">
					<div class="form-group">
						<label>ID</label>
						<label>${offre.idO}</label>
					</div>
					<div class="form-group">
						<label>Description</label>
						<label>${offre.description}</label>
					</div>
					<div class="form-group">
						<label>IdEntreprise</label>
						<label>${offre.idEntreprise}</label>
					</div>
				</div>
		</div>
	</div>
</body>
</html>