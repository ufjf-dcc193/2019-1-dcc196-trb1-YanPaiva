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
    <form action="novaSede.html" method="post">
        Nome <input name="nome"/> <br>
        Estado <input name="estado"/><br>
        Cidade <input name="cidade"/><br>
        Bairro <input name="bairro"/><br>
        Telefone <input name="telefone" type="number"/><br>
        link <input name="endWeb"/><br>
        <input type="submit"/> <br>
    </form>
</body>
</html>