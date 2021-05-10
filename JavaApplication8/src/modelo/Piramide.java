package modelo;

import java.util.*;

/**
 * 
 */
public class Piramide extends FiguraGeometrica3D {



    private double areaBase;
    private double perimetroBase;
    private double apotema;
    private double altura;

    public Piramide() {
        
    }

    public Piramide(double areaBase, double perimetroBase, double apotema, double altura) {
        this.areaBase = areaBase;
        this.perimetroBase = perimetroBase;
        this.apotema = apotema;
        this.altura = altura;
    }
    

    public double getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    public double getPerimetroBase() {
        return perimetroBase;
    }

    public void setPerimetroBase(double perimetroBase) {
        this.perimetroBase = perimetroBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getArea(){
    
    return ((perimetroBase*apotema)/2)+areaBase;
        
    }
    public double getVolumen(){
    return (areaBase*altura)/3;
        
    }
    
    
    @Override
    public String toString() {
        return "Piramide{" + "areaBase=" + areaBase + ", perimetroBase=" + perimetroBase + ", apotema=" + apotema + ", altura=" + altura + '}';
    }
    

}