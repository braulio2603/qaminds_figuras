package org.qaminds.test;

import org.testing.figuras.Circulo;
import org.testing.figuras.Rectangulo;
import org.testing.figuras.Triangulo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FiguraTest {

    @Test
    public void validarCalcularAreaCirculo(){

        double radio = 5;
        Circulo circulo = new Circulo(radio);
        double resultadoEsperado = Math.PI * radio * radio;
        Assert.assertEquals(circulo.calcularArea(), resultadoEsperado);

    }

    @Test
    public void validarCalcularAreaRectangulo(){


        int largo =54;
        int ancho =5454;

        Rectangulo rectangulo = new Rectangulo(largo, ancho);
        double resultadoEsperado = largo * ancho;
        Assert.assertEquals(rectangulo.calcularArea(), resultadoEsperado);
    }
    @Test
    public void validarCalcularAreaTriangulo(){

        int base =546;
        int altura=343;
        Triangulo triangulo = new Triangulo(base, altura);
        double resultadoEsperado = base * altura /2;
        Assert.assertEquals(triangulo.calcularArea(), resultadoEsperado);

    }


}
