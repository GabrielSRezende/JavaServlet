<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/NovaEmpresaServlet" var="linkServletNovaEmpresa"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

    <form action="${linkServletNovaEmpresa}" method="post">
        <label>Nome</label>
        <input type="text" name="nome"/>
        <label>Data</label>
        <input type="text" name="data"/>
        <input type="submit" value="Enviar"/>
    </form>
</body>
</html>