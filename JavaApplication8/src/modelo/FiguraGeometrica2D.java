package modelo;

import java.util.*;

/**
 * 
 */
public abstract class FiguraGeometrica2D extends Figura {
    private double volumen;

    public FiguraGeometrica2D(boolean tipoFigura, int nombreFigura, Color color) {
        super(tipoFigura, nombreFigura, color);
    }

    /**
     *
     */
    
    public abstract double getArea();
    public abstract double getPerimetro();
    public abstract void dibujar(Color unColor);
    public abstract String toString();
}