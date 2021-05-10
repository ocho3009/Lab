package Modelo;

import java.util.*;
import java.lang.Math;

/**
 * 
 */
public class Cono extends FiguraGeometrica3D {
    private double radio;
    private double altura;
    private double generatriz;

    public Cono() {
    }

    public Cono(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea(){
        return Math.PI*radio*generatriz +(Math.PI* Math.pow(radio, 2));
    }
    public double getVolumen(){
        return (1/3)*Math.PI*Math.pow(radio, 2)*altura;
    }
    @Override
    public String toString() {
        return "Cono{" + "radio=" + radio + ", altura=" + altura + '}';
    }
    


}