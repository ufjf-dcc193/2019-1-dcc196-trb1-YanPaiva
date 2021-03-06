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
    <h1>tbr01: Sedes</h1>
    <a href="novaS.html">cadastrar nova sede</a>

    <table border="1">
        <thead>
            <tr>
                <th>Lista de Sedes</th>
                <th>Horas Assistenciais</th>
                <th>Horas Juridicas</th>
                <th>Horas Executiva</th>
                <th>Horas Financeira</th>
                <th>Editar sede</th>
                <th>Excluir sede</th>
            </tr>
        </thead>

    <c:forEach var="sede" items="${sedes}">
            <tbody>
                <tr>
                    <td>${sede.nome}</td>
                    <td>${sede.horasAssistencial}</td>
                    <td>${sede.horasJuridica}</td>
                    <td>${sede.horasExecutiva}</td>
                    <td>${sede.horasFinanceira}</td>
                    <form action="editarSede.html?idSede=${sede.getId()}" method="POST">
                        <td><Button name="btnEditar" type="submit">editar</Button></td>
                    </form>
                    <form action="excluirSede.html?idSede=${sede.getId()}" method="POST">
                        <td><button name="btnExcluir" type="submit">excluir</button></td>
                    </form>    
                </tr>
            </tbody>
        
    
    </c:forEach>
</body>
</html>
