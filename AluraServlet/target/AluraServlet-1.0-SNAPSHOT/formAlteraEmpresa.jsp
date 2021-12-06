<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:url value="/AlteraEmpresaServlet" var="linkServletNovaEmpresa"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<form action="${linkServletNovaEmpresa}" method="post">
    <label>Nome</label>
    <input type="text" name="nome" value="${empresa.nome}"/>
    <label>Data</label>
    <input type="text" name="data"  value="<fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/>" />
    <input type="hidden" name="id" value="${empresa.id}">
    <input type="submit"/>
</form>
</body>
</html>
