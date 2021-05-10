package modelo;

import java.util.*;
import java.lang.Math;

/**
 * 
 */
public class Triangulo extends FiguraGeometrica2D {

    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    
    public Triangulo() {
    }

    public Triangulo(double base, double altura, double lado1, double lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getArea(){
        return (base*altura)/2;
        
    }
    
    public double getPerimetro(){
        return base + lado1 + lado2 ;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + ", lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }

    @Override
    public void dibujar(Color unColor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    


}