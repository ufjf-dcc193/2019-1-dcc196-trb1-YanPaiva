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
    <form action="informacoesSede.html?idSede=${sede.getId()}" method="post">
        Nome <input name="nome" value="${sede.nome}"/> <br>
        Estado <input name="estado" value="${sede.estado}"/><br>
        Cidade <input name="cidade" value="${sede.cidade}"/><br>
        Bairro <input name="bairro" value="${sede.bairro}"/><br>
        Telefone <input name="telefone" type="number" value="${sede.telefone}"/><br>
        link <input name="endWeb" value="${sede.endWeb}"/><br>
        <input type="submit" value="Salvar"/> <br>
    </form>
    <a href="funcionarios.html?idSede=${sede.getId()}">funcionarios</a>
    <a href="atividades.html?idSede=${sede.getId()}">atividades</a>
</body>
</html>
    