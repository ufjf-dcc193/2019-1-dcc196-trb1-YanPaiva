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
    <h1>tbr01: home</h1>
    <a href="novaA.html?idSede=${param.idSede}">cadastrar nova atividade</a>
    <h1>lista de Atividades</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Lista de Atividades</th>
                <th>Editar Atividades</th>
                <th>Excluir Atividades</th>
            </tr>
        </thead>
        <c:forEach var="atividade" items="${atividades}">
            <tbody>
                <tr>
                    <td>${atividade.titulo}</td>
                    <form action="editarAtividade.html?idAtividade=${atividade.getId()}&idSede=${param.idSede}" method="POST">
                        <td><Button name="btnEditar" type="submit">editar</Button></td>
                    </form>
                    <form action="excluirAtividade.html?idAtividade=${atividade.getId()}&idSede=${param.idSede}"
                        method="POST">
                        <td><button name="btnExcluir" type="submit">excluir</button></td>
                    </form>
                </tr>
            </tbody>
        </c:forEach>
</body>

</html>