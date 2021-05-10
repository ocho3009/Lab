package modelo;


import java.util.*;

/**
 * 
 */
public abstract class FiguraGeometrica3D extends Figura{
    private double perimetro;

    public FiguraGeometrica3D(boolean tipoFigura, int nombreFigura, Color color) {
        super(tipoFigura, nombreFigura, color);
    }

    

    

    public abstract double getArea();
    public abstract double getVolumen();
    public abstract String toString();

}