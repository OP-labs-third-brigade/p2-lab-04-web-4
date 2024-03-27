<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Головна сторінка</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="./styles/global.styles.scss">
    <link rel="stylesheet" href="./styles/main-page.styles.scss">
</head>
<body>
<div class="header">
    <h3>Головна</h3>
</div>
<div class="main-container">
    <div class="categories gap-4">
        <div class="category">
            <img src="assets/actors.png">
            <form action="ActorsController" method="get">
                <input type="submit" value="Список акторів">
            </form>
        </div>
        <div class="category">
            <img src="assets/movies.png">
            <form action="MoviesController" method="get">
                <input type="submit" value="Список фільмів">
            </form>
        </div>
    </div>
    <div class="mt-4">
        <form action="InfoController" method="get">
            <input type="submit" value="Додаткова інформація">
        </form>
    </div>
</div>
</body>
</html>
