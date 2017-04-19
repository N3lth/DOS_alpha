<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Dostep wzbroniony</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<div class="container">

    <div class="alert alert-danger">
        <h2 class="text-center">
                ${pageContext.request.userPrincipal.name}, nie masz odpowiednich uprawnien, by wyswietlac ta strone! <br />
                <h3 class="text-center">(Kod bledu: 403)</h3>
            <%--<c:choose>--%>
                <%--<c:when test="${pageContext.request.userPrincipal.name != null}">--%>
                    <%--${pageContext.request.userPrincipal.name}, nie powinienes tu byc!--%>
                <%--</c:when>--%>
                <%--<c:otherwise>--%>
                    <%--Nie powinienes tu byc!--%>
                <%--</c:otherwise>--%>
            <%--</c:choose>--%>
        </h2>
    </div>

</div>
<!-- /container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
