package org.testing.figuras;

public class Rectangulo extends Figura{

    private int largo;
    private int ancho;

    public Rectangulo(int largo, int ancho){
        this.largo = largo;
        this.ancho = ancho;
    }
    @Override
    public double calcularArea() {
        return largo * ancho;
    }
}
