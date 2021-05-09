/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Chris
 */
public abstract class Figura {
    private double area;
    private boolean tipoFigura;
    private int nombreFigura;
    private Color color;
    private double perimetro;

    public Figura(boolean tipoFigura, int nombreFigura, Color color) {
        this.tipoFigura = tipoFigura;
        this.nombreFigura = nombreFigura;
        this.color = color;
    }
    

    public abstract double getArea();

    public void setArea(double area) {
        this.area = area;
    }

    public abstract double getPerimetro();

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public boolean isTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(boolean tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    public int getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(int nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    
    
}

