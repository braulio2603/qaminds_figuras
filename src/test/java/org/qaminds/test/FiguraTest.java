package org.qaminds.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.figuras.Circulo;
import org.testing.figuras.Rectangulo;
import org.testing.figuras.Triangulo;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FiguraTest {

    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        driver.manage().window().maximize();
    }

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
    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
