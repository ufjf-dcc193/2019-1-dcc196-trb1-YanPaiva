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
    <p>funcionarios</p>
    <a href="novoF.html?idSede=${param.idSede}">cadastrar novo funcionario</a>

    <h1>lista de pessoas</h1>


    <table border="1">
        <thead>
            <tr>
                <th>Lista de Membros</th>
                <th>Editar Membro</th>
                <th>Excluir Membro</th>
            </tr>
        </thead>

        <c:forEach var="funcionario" items="${funcionarios}">
            <tbody>
                <tr>
                    <td>${funcionario.nome}</td>
                    <form action="editarFuncionario.html?idSede=${param.idSede}" method="POST">
                        <td><Button name="btnEditar" type="submit">editar</Button></td>
                    </form>
                    <form action="excluirFuncionario.html?idMembro=${funcionario.getId()}idSede=${param.idSede}" method="POST">
                        <td><button name="btnExcluir" type="submit">excluir</button></td>
                    </form>
                </tr>
            </tbody>


        </c:forEach>

</body>

</html>