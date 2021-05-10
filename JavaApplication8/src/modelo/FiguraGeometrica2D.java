package modelo;

import java.util.*;

/**
 * 
 */
public abstract class FiguraGeometrica2D extends FiguraGeometrica {

    public FiguraGeometrica2D(){
    }
    public abstract double getArea();
    public abstract double getPerimetro();
    public abstract void dibujar(Color unColor);
    public abstract String toString();
}