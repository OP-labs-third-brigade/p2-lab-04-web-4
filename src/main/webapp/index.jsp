<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Головна</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="styles/global.styles.scss">
    <link rel="stylesheet" href="styles/main-page.styles.scss">
</head>
<body>
<div class="header">
    <h3>Головна</h3>
</div>
<div class="categories gap-4">
    <a href="actors.jsp" class="category">
        <img src="assets/actors.png">
        <p>Список акторів</p>
    </a>
    <a href="movies.jsp" class="category">
        <img src="assets/movies.png">
        <p>Список фільмів</p>
    </a>
</div>
<div class="mt-4">
    <p><b>Актори, що поки не мають досвіду гри у фільмах:</b> ${unfilmedActors ? unfilmedActors : 'Таких немає.'}</p>
    <p><b>Фільм тижня:</b> ${movieWithMostActors}.</p>
</div>
</body>
</html>
