package modelo;

import java.util.*;
import java.lang.Math;

/**
 * 
 */
public class Cubo extends FiguraGeometrica3D {

    public double arista;

    public Cubo(double arista, boolean tipoFigura, int nombreFigura, Color color) {
        super(tipoFigura, nombreFigura, color);
        this.arista = arista;
    }

    
    
    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }
    
    public double getArea(){
    
    return 6*Math.pow(arista, 2);
        
    }
    public double getVolumen(){
    return Math.pow(arista, 3);
        
    }
    
    @Override
    public String toString() {
        return "Cubo{" + "arista=" + arista + '}';
    }



}