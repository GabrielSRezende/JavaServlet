<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="br.com.alura.gerenciador.servlet.Empresa" %>
<%@ page import="java.util.List" %>
<c:url value="/RemoveEmpresaServlet" var="linkServletRemoveEmpresa"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Java Standart Taglib</title>
</head>
<body>
    <h3>Lista de empresas:</h3>

    <c:if test="${not empty empresa1}">
        Empresa ${empresa1} cadastrada com sucesso!
    </c:if>

    <ul>
        <c:forEach items="${empresa}" var="empresa">
            <li>
                    ${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
                    <a href="MostraEmpresaServlet?id=${empresa.id}">Alterar</a>
                    <a href="RemoveEmpresaServlet?id=${empresa.id}">Remove</a>
            </li>
        </c:forEach>
    </ul>

</body>
</html>
