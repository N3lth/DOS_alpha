<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> <!-- FORMAT DATY -->
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge">
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">

    <title>Dziennik Obecnosci Studentow</title>
    <link href="${contextPath}/resources/css/style.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">


    <!--<script src="static/js/html5shiv.js"/>
    <script src="static/js/respond.js"/>-->

</head>
<body>
<div class="page-container">

    <!-- top navbar -->
    <div class="navbar navbar-default navbar-fixed-top" role="navigation">
        <div class="container">
            <form id="logoutForm" method="POST" action="${contextPath}/logout?logout">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form>
            <div class="nav navbar-nav navbar-right"><a class="navbar-brand btn" onclick="document.forms['logoutForm'].submit()"><strong>Wyloguj</strong></a>
            </div>
                <%--<a class="navbar-right" onclick="document.forms['logoutForm'].submit()">Wyloguj</a>--%>
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="offcanvas" data-target=".sidebar-nav">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Witaj ${pageContext.request.userPrincipal.name}</a>

            </div>
        </div>
    </div>

    <div class="container">
        <div class="row row-offcanvas row-offcanvas-left">

            <!-- sidebar -->
            <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar" role="navigation">
                <ul class="nav">
                    <li class="active"><a href="/teacher/manage">Home</a></li>
                    <li><a href="/teacher/manage/check-attendnace">Sprawdzanie obecnosci</a></li>
                    <li><a href="#">Link 2</a></li>
                </ul>
                <a class="btn btn-lg btn-primary btn-block" onclick="document.forms['logoutForm'].submit()">Wyloguj</a>
            </div>

            <!-- main area -->
            <div class="col-xs-12 col-sm-9">

                <c:choose>
                <c:when test="${mode=='MODE_HOME'}">
                <h1>Shrink Width to Collapse Sidebar</h1>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus in nisi eu arcu tempus vehicula.
                    Nulla faucibus cursus metus in sagittis. Nunc elit leo, imperdiet in ligula in, euismod varius est.
                    Aenean pellentesque lorem a porttitor placerat. Vestibulum placerat nunc ac rutrum fringilla. Donec
                    arcu leo, tempus adipiscing volutpat id, congue in purus. Pellentesque scelerisque mattis nibh vel
                    semper. Sed a risus purus. Fusce pulvinar, velit eget rhoncus facilisis, enim elit vulputate nisl, a
                    euismod diam metus eu enim. Nullam congue justo vitae justo accumsan, sit amet malesuada nulla sagittis.
                    Nam neque tellus, tristique in est vel, sagittis congue turpis. Aliquam nulla lacus, laoreet dapibus
                    odio vitae, posuere volutpat magna. Nam pulvinar lacus in sapien feugiat, sit amet vestibulum enim
                    eleifend. Integer sit amet ante auctor, lacinia sem quis, consectetur nulla.</p>

                <p>Vestibulum porttitor massa eget pellentesque eleifend. Suspendisse tempor, nisi eu placerat auctor,
                    est erat tempus neque, pellentesque venenatis eros lorem vel quam. Nulla luctus malesuada porttitor.
                    Fusce risus mi, luctus scelerisque hendrerit feugiat, volutpat gravida nisi. Quisque facilisis risus
                    in lacus sagittis malesuada. Suspendisse non purus diam. Nunc commodo felis sit amet tortor
                    adipiscing varius. Fusce commodo nulla quis fermentum hendrerit. Donec vulputate, tellus sed
                    venenatis sodales, purus nibh ullamcorper quam, sit amet tristique justo velit molestie lorem.</p>

                <p>Fusce sollicitudin lacus lacinia mi tincidunt ullamcorper. Aenean velit ipsum, vestibulum nec
                    tincidunt eu, lobortis vitae erat. Nullam ultricies fringilla ultricies. Sed euismod nibh quis
                    tincidunt dapibus. Nulla quam velit, porta sit amet felis eu, auctor fringilla elit. Donec
                    convallis tincidunt nibh, quis pellentesque sapien condimentum a. Phasellus purus dui, rhoncus
                    id suscipit id, ornare et sem. Duis aliquet posuere arcu a ornare. Pellentesque consequat libero
                    id massa accumsan volutpat. Fusce a hendrerit lacus. Nam elementum ac eros eu porttitor.
                    Phasellus enim mi, auctor sit amet luctus a, commodo fermentum arcu. In volutpat scelerisque
                    quam, nec lacinia libero.</p>

                <p>Aliquam a lacinia orci, iaculis porttitor neque. Nullam cursus dolor tempus mauris posuere, eu
                    scelerisque sem tincidunt. Praesent blandit sapien at sem pulvinar, vel egestas orci varius.
                    Praesent vitae purus at ante aliquet luctus vel quis nibh. Mauris id nulla vitae est lacinia
                    rhoncus a vel justo. Donec iaculis quis sapien vel molestie. Aliquam sed elementum orci.
                    Vestibulum tristique tempor risus et malesuada. Sed eget ligula sed quam placerat dapibus.
                    Integer accumsan ac massa at tempus.</p>

                </c:when>
                <c:when test="${mode=='MODE_CHECK_ATTENDANCE'}">

                </c:when>
                </c:choose>
            </div><!-- /.col-xs-12 main -->
        </div><!--/.row-->
    </div><!--/.container-->
</div><!--/.page-container-->

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/script.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>

</body>
</html>