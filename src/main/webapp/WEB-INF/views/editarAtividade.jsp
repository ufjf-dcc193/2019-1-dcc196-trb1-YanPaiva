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
    <form action="salvarAtividade.html?idSede=${param.idSede}&idAtividade=${atividade.getId()}" method="post">
        Titulo <input name="titulo" value="${atividade.titulo}"/> <br>
        Descrição <input name="descricao" value="${atividade.descricao}"/><br>
        Horas Assistencial<input name="horasAssistencial" type="number" value="${atividade.horasAssistencial}"/><br>
        Horas Juridica <input name="horasJuridica" type="number" value="${atividade.horasJuridica}"/><br>
        Horas Financeira <input name="horasFinanceira" type="number" value="${atividade.horasFinanceira}"/><br>
        Horas Executiva <input name="horasExecutiva" type="number" value="${atividade.horasExecutiva}"/><br>
        
        <input type="submit" value="Salvar"/> <br>
    </form>
</body>
</html>
    