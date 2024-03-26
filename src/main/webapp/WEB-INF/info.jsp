<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Додаткова інформація</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="../styles/global.styles.scss">
    <link rel="stylesheet" href="../styles/item-page.styles.scss">
</head>
<body>
<div class="header">
    <a href="/" class="icon-container"><img src="/assets/left-arrow-ivon.png"></a>
    <h3>Новини</h3>
    <img src="/assets/movies-icon.png">
</div>
<h4>
    <b>Актори, що поки не мають досвіду гри у фільмах:</b>
    <c:choose>
        <c:when test="${not empty unfilmedActors}">
            <c:forEach var="unfilmedActor" items="${unfilmedActors}">
                <c:out value="${unfilmedActor.name}." />
            </c:forEach>
        </c:when>
        <c:otherwise>
            Таких немає.
        </c:otherwise>
    </c:choose>
</h4>
<h4><b>Фільм тижня:</b> ${movieWithMostActors}.</h4>
</body>
</html>
