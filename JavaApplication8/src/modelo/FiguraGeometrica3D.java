package Modelo;

import java.util.*;

/**
 * 
 */
public abstract class FiguraGeometrica3D extends FiguraGeometrica{

    public FiguraGeometrica3D() {
    }

    public abstract double getArea();
    public abstract double getVolumen();
    public abstract String toString();

}