package Modelo;

import java.util.*;
import java.lang.Math;

/**
 * 
 */
public class Circulo extends FiguraGeometrica2D {
    
    private double radio;
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea(){
        return Math.PI*(Math.pow(radio, 2));
        
    }
    
    public double getPerimetro(){
        return Math.PI*2*radio;
    }

    
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public void dibujar(Color unColor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}