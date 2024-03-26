<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Актор</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="../styles/global.styles.scss">
    <link rel="stylesheet" href="../styles/item-page.styles.scss">
</head>
<body>
<c:set var="actor" value="${actors[actorId]}" />
<div class="header">
    <a href="/" class="icon-container"><img src="/assets/left-arrow-ivon.png"></a>
    <h3>${actor.name}</h3>
    <img src="/assets/movies-icon.png">
</div>
<h4>Фільми, у яких грав актор:</h4>
<ul>
    <c:forEach var="movie" items="${movies}">
        <li>${movie.name}</li>
    </c:forEach>
</ul>
<h4>Актори, з якими грав:</h4>
<ul>
    <c:forEach var="coactor" items="${coactors}">
        <li>${coactor.name}</li>
    </c:forEach>
</ul>
</body>
</html>
