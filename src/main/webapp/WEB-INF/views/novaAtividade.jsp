<%@page pageEncoding="utf-8"%>
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
    <form action="novaAtividade.html" method="post">
        Titulo <input name="titulo"/> <br>
        Descrição <input name="descricao"/><br>
        Horas Assistencial <input name="horaAssistencial" type="number" value="0"/><br>
        Horas Juridica <input name="horaJuridica" type="number" value="0"/><br>
        Horas Executiva <input name="horaExecutiva" type="number" value="0"/><br>
        <input type="submit"/> <br>
    </form>
</body>
</html>