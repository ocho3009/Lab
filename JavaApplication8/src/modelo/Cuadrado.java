package modelo;

import java.util.*;
import java.lang.Math;

/**
 * 
 */
public class Cuadrado extends FiguraGeometrica2D {

    private double lado;

    public Cuadrado(double lado, boolean tipoFigura, int nombreFigura, Color color) {
        super(tipoFigura, nombreFigura, color);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea(){
        return Math.pow(lado, 2);
        
    }
    
    public double getPerimetro(){
        return lado*4;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }

    @Override
    public void dibujar(Color unColor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}