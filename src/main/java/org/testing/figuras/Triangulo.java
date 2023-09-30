package org.testing.figuras;

public class Triangulo extends Figura{

    private int base;
    private int altura;

    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = base;
    }
    @Override
    public double calcularArea() {
        return base * altura /2;
    }
}
