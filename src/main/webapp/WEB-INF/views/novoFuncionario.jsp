<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>ONG</title>

    <a href="index.html">home </a>
    <a href="sedes.html">sedes </a>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css">
    <script src="main.js"></script>
</head>
<body>

<form action="novoFuncionario.html?idSede=${param.idSede}" method="post">
        nome <input name="nome"/>
        função <input name="funcao"/>
        e-mail <input name="email"/>
        <input type="submit" value="Cadastrar"/> 
    </form>
</body>
</html>
