<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Retângulo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>


	<h1 class="ms-4 mt-3">Cálculo Retângulo</h1>
	<h5 class="ms-4 mt-3">Vamos calcular a área e o perímetro do retângulo?</h5>

	<form name="form" action="calcular" method="post">
	
	<div class="ms-4">
		<label for="name">Base: </label><br>
		<input type="number" id="base" name="base" value="" class="form-control w-50" placeholder="Digite o valor da base"><br>
		<label for="name">Altura: </label><br>
		<input type="number" id="altura" name="altura" value="" class="form-control w-50" placeholder="Digite o valor da altura"><br>
		<input type="submit" value="Calcular" class="btn btn-success w-25">
		<input type="reset" value="Limpar" class="btn btn-danger w-25">
	</div>
		
	</form>


</body>
</html>