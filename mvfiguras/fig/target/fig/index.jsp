<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="es">
    /* -heptágono
    Es una figura que cuenta con siete lados iguales y siete vértices.
    Perímetro: P=L*7
    Area: A=(P*ap)/2
    
    -trapezoides asimétricos
    Es una figura que no tiene lados paralelos ni eje de simetría.La suma de susángulos interiores será de 360°.
    Area= A=(B+b/2)h
    perímetro = P=L+L+L+L
    
    -obtusangulo
    Es un triángulo el cual tiene la característica de que uno de sus ángulos es mayor a 90°
    perímetro= P= L+L+L
    Area= A = (b*h)/2 */
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Figuras Geométricas</title>
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
                    <a href="#" class="nav__links">Inicio</a>
                </li>
                <li class="nav__items">
                    <a href="../webapp/views/figura.jsp" class="nav__links">Figuras</a>
                </li>

                <img src="./imagenes/cerrar.svg" alt="cerrar" class="nav__close">
            </ul>

            <div class="nav__menu">
                <img src="./imagenes/menu.svg" alt="menu" class="nav_img">
            </div>
        </nav>

        <section class="hero__container container">
            <h1 class="hero__titulo">Convertidor de area y perímetro</h1>
            <p class="hero__parrafo">En ésta página podras hacer los cálculos de area y perímetro de las figuras que necesites o por su defecto que tengamos en esta página</p>
            <a href="../webapp/views/figura.jsp" class="cta">Empezar</a>
        </section>
    </header>

    <main>
        <section class="container__about">
            <h2 class="subtitle">¿Para qué me servirá?</h2>
            <p class="about">En ésta página podrás a demás de conocer figuras que no recuerdes o no hallas visto, saber las carácterísticas de dichas figuras y cómo llegar a calcular el área y perímetro de éstas figuras.</p>
        </section>

        <section class="figura">
            <div class="figura__container container">
                <img src="./imagenes/flechaIzquierda.svg" class="figura__flecha" alt="Anterior" id="before">

                <section class="figura__body figura__body--show" data-id="1">
                    <div class="figura__texts">
                        <h2 class="subtitle">HEPTÁGONO</h2>
                        <p class="figura__review">Es una figura que cuenta con siete lados iguales y siete vértices.</p>
                        <a href="../webapp/views/heptagono.jsp" class="cta">Empezar</a>
                    </div>

                    <figure class="figura__picture">
                        <img src="./imagenes/heptagno.png" alt="Heptágono" class="figura__img">
                    </figure>
                </section>

                <section class="figura__body" data-id="2">
                    <div class="figura__texts">
                        <h2 class="subtitle">TRAPEZOIDES ASIMÉTRICOS</h2>
                        <p class="figura__review">Es una figura que no tiene lados paralelos ni eje de simetría.La suma de susángulos interiores será de 360°.</p>
                        <a href="../webapp/views/trapezoide.jsp" class="cta">Empezar</a>
                    </div>

                    <figure class="figura__picture">
                        <img src="./imagenes/trapezoide.png" alt="Trapezoide asimétrico" class="figura__img">
                    </figure>
                </section>

                <section class="figura__body" data-id="3">
                    <div class="figura__texts">
                        <h2 class="subtitle">TRIÁNGULO OBTUSÁNGULO</h2>
                        <p class="figura__review">Es un triángulo el cual tiene la característica de que uno de sus ángulos es mayor a 90°.</p>
                        <a href="../webapp/views/triangulo.jsp" class="cta">Empezar</a>
                    </div>

                    <figure class="figura__picture">
                        <img src="./imagenes/obtusangulo.png" alt="Triángulo obtusángulo" class="figura__img">
                    </figure>
                </section>

                <img src="./imagenes/flechaDerecha.svg" class="figura__flecha" alt="Siguiente" id="next">
            </div>
        </section>
    </main>

    <script src="./js/slider.js"></script>
</body>
</html>
