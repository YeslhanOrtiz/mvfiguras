<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Figuras</title>
    <link rel="stylesheet" href="./css/normalize.css">
    <link rel="stylesheet" href="./css/estilos.css">
</head>
<body>

    <header class="hero">
        <nav class="nav container">
            <div class="nav__logo">
                <h2 class="nav__titulo">Figuras geometricas</h2>
            </div>

            <ul class="nav__link nav__link--menu">
                <li class="nav__items">
                    <a href="index.jsp" class="nav__links">Inicio</a>
                </li>
                <li class="nav__items">
                    <a href="#" class="nav__links">Figuras</a>
                </li>

                <img src="./imagenes/cerrar.svg" alt="cerrar" class="nav__close">
            </ul>

            <div class="nav__menu">
                <img src="./imagenes/menu.svg" alt="menu" class="nav_img">
            </div>
        </nav>

        <section class="hero__container container">
            <h1 class="hero__titulo">INGRESE LOS DATOS DE LA FIGURA PARA PODER HAYÁR LOS DATOS</h1>
            <p class="hero__parrafo">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Vero ut quasi consectetur provident exercitationem beatae assumenda soluta, repellendus esse, fuga qui repellat cumque atque? Exercitationem sed harum saepe tenetur vitae!</p>
        </section>

        
    </header>

    <main>
        <form class="contenedor">
            <fieldset class="datos__figura">
                <legend>Ingrese los datos de la figura</legend>
                <span class="subtitulo__fiura">Ingrese la medida que tiene de la figura</span>
                <input type="number" class="figura">
                <br>
                <input type="submit" class="figura">
            </fieldset>
            <fieldset class="area__figura">
                <legend>Area</legend>
                <span class="subtitulo__figura">Los resultados del área de la figura son</span>
                <input type="text" class="figura">
            </fieldset>
            <fieldset class="perimetro__figura">
                <legend>Perímetro</legend>
                <span class="subtitulo__figura">Los resultados del perímetro de la figura son</span>
                <input type="text" class="figura">
            </fieldset>
        </form>
    </main>

    
</body>
</html>