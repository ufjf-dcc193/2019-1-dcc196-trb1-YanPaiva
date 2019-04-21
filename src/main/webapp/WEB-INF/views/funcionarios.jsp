<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>exem01: home</title>
    <a href="funcionarios.html">funcionarios </a>
    <a href="atividades.html">atividades </a>
    <a href="index.html">home </a>
    <a href="sedes.html">sedes </a>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css">
    <script src="main.js"></script>
</head>
<body>
    <h1>tbr01: home</h1>
    <p>funcionarios</p>
    <a href="novoF.html">cadastrar novo funcionario</a>

    <h1>lista de pessoas</h1>

    <c:forEach var="funcionario" items="${funcionarios}">
        <p>${funcionario.nome}</p>
    </c:forEach>



</body>
</html>