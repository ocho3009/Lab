package modelo;

import java.util.*;
import java.lang.Math;


/**
 * 
 */
public class Rectangulo extends FiguraGeometrica2D {
    
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho, boolean tipoFigura, int nombreFigura, Color color) {
        super(tipoFigura, nombreFigura, color);
        this.largo = largo;
        this.ancho = ancho;
    }

    

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }


    public double getArea(){
        return largo *ancho;
        
    }
    
    public double getPerimetro(){
        return (largo*2) + (ancho*2) ;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "largo=" + largo + ", ancho=" + ancho + '}';
    }

    @Override
    public void dibujar(Color unColor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}