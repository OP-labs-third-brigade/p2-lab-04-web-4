<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Список фільмів</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="../styles/global.styles.scss">
    <link rel="stylesheet" href="../styles/list-page.styles.scss">
</head>
<body>
<div class="header">
    <a href="/" class="icon-container"><img src="/assets/left-arrow-ivon.png"></a>
    <h3>Список фільмів</h3>
    <img src="/assets/movies-icon.png">
</div>
<ul>
    <c:forEach var="movie" items="${movies}">
        <li>
            <form action="MovieController" method="post">
                <input type="hidden" name="movieId" value="${movie.id}" />
                <input type="submit" value="${movie.name}" />
            </form>
        </li>
    </c:forEach>
</ul>
</body>
</html>
