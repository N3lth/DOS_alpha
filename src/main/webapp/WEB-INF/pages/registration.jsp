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

    <title>Dziennik Obecnosci Studentow</title>

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

    <form:form method="POST" modelAttribute="userForm" class="form-signin">
        <h2 class="form-signin-heading">Utworz nowe konto</h2>
        <spring:bind path="username">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="username" class="form-control" placeholder="Nazwa uzytkownika"
                            autofocus="true"/>
                <form:errors path="username">
                </form:errors>
            </div>
        </spring:bind>

        <spring:bind path="name">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="name" class="form-control" placeholder="Imie"
                            autofocus="true"/>
                <form:errors path="name">
                </form:errors>
            </div>
        </spring:bind>

        <spring:bind path="surname">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="surname" class="form-control" placeholder="Nazwisko"
                            autofocus="true"/>
                <form:errors path="surname">
                </form:errors>
            </div>
        </spring:bind>

        <spring:bind path="password">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="password" path="password" class="form-control" placeholder="Haslo"/>
                <form:errors path="password">
                </form:errors>
            </div>
        </spring:bind>

        <spring:bind path="passwordConfirm">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="password" path="passwordConfirm" class="form-control"
                            placeholder="Potwierdz haslo"/>
                <form:errors path="passwordConfirm">
                </form:errors>
            </div>
        </spring:bind>

        <spring:bind path="roleId">
            <div class="form-group text-center ${status.error ? 'has-error' : ''}">
                <label class="radio-inline"><form:radiobutton path="roleId" value="1" checked="checked"/>Student</label>
                <label class="radio-inline"><form:radiobutton path="roleId" value="3"/>Nauczyciel</label>
                <form:errors path="roleId">

                </form:errors>
            </div>
        </spring:bind>

        <!-- TODO: nauczyciela przydzielic do konkretnych lekcji, a uczniowi przypisac index, skorzystaj z jquery nizej -->

        <button class="btn btn-lg btn-primary btn-block" type="submit">Utworz</button>
    </form:form>

</div>
<!-- /container -->

<%--<script>--%>
<%--$(document).ready(function(){--%>
    <%--$('#roleId1').click(function() {--%>
        <%--alert("checked 1");--%>
    <%--});--%>
    <%--$('#roleId2').click(function() {--%>
        <%--alert("checked 3");--%>
    <%--});--%>
<%--});--%>
<%--</script>--%>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
