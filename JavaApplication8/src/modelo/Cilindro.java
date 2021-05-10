package modelo;


import java.util.*;
import java.lang.Math;

/**
 * 
 */
public class Cilindro extends FiguraGeometrica3D {

    private double radio;
    private double altura;

    public Cilindro(double radio, double altura, boolean tipoFigura, int nombreFigura, Color color) {
        super(tipoFigura, nombreFigura, color);
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
        return 2*Math.PI*radio*(altura + radio);
        
    }
    
    public double getVolumen(){
        return Math.PI*(Math.pow(radio, 2))*altura;
    }
    
    
    @Override
    public String toString() {
        return "Cilindro{" + "radio=" + radio + ", altura=" + altura + '}';
    }

    
    
    

}