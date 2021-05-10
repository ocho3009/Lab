/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Figura;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.LinkedList;
import java.util.*;
import modelo.Cilindro;
import modelo.Circulo;
import modelo.Color;
import modelo.Cono;
import modelo.Cuadrado;
import modelo.Cubo;
import modelo.FiguraGeometrica2D;
import modelo.FiguraGeometrica3D;
import modelo.Piramide;
import modelo.Rectangulo;
import modelo.Triangulo;

/**
 *
 * @author Chris
 */
public class AdmFiguras {
    LinkedList<Figura> figuras2D;
    LinkedList<Figura> figuras3D;
    LinkedList<LinkedList> figurasTodas;
    LinkedList<Figura> figuras;

    public void setFiguras(LinkedList<LinkedList> figuras) {
        this.figurasTodas = figuras;
    }
    
    
    
    public void agregarFigura(Figura figura){
        figuras.add(figura);
        System.out.println(figura.toString());
    }
    
    public void agregarFigura(FiguraGeometrica2D figura){
        figuras2D.add(figura);
        
    }
    
    public void agregarFigura(FiguraGeometrica3D figura){
        figuras2D.add(figura);
        
    }
    
    
     public void nombreFiguras(int identificador){
        int piramide = 0;
        int cilindro = 0;
        int cono = 0;
        int cubo = 0;
        int triangulo = 0;
        int cuadrado = 0;
        int circulo = 0;
        int rectangulo = 0;
        
        for(int i = 0; i < figuras.size(); i++){
            if(identificador != 1){
                switch(figuras.get(i).getNombreFigura()){
                    case 0:
                        piramide++;
                    case 1:
                        cilindro++;
                    case 2:
                        cono++;
                    case 3:
                        cubo++;
                }
            }
            if(identificador != 2){
                switch(figuras.get(i).getNombreFigura()){
                    case 4:
                        triangulo++;
                    case 5:
                        cuadrado++;
                    case 6:
                        circulo++;
                    case 7:
                        rectangulo++;
                }
            }
        }
        
        for(int j = 0; j < 8; j++){
            switch(j){
                case 0:
                    if(piramide != 0)
                        System.out.println("La coleccion contiene Piramides");
                    
                case 1:
                    if(cilindro != 0)
                        System.out.println("La coleccion contiene Cilindros");
                case 2:
                    if(cono != 0)
                        System.out.println("La coleccion contiene Conos");
                case 3:
                    if(cubo != 0)
                        System.out.println("La coleccion contiene Cubos");
                case 4:
                    if(triangulo != 0)
                        System.out.println("La coleccion contiene TrianguloS");
                case 5:
                    if(cuadrado != 0)
                        System.out.println("La coleccion contiene Cuadrados");
                case 6:
                    if(circulo != 0)
                        System.out.println("La coleccion contiene Circulos");
                case 7:
                    if(rectangulo != 0)
                        System.out.println("La coleccion contiene Rectangulos");
            }
        
        }     
    }
    
    public void cantidadFiguras(int identificador){
        int piramide = 0;
        int cilindro = 0;
        int cono = 0;
        int cubo = 0;
        int triangulo = 0;
        int cuadrado = 0;
        int circulo = 0;
        int rectangulo = 0;
        
        for(int i = 0; i < figuras.size(); i++){
            if(identificador != 1){
                switch(figuras.get(i).getNombreFigura()){
                    case 0:
                        piramide++;
                    case 1:
                        cilindro++;
                    case 2:
                        cono++;
                    case 3:
                        cubo++;
                }
            }
            if(identificador != 2){
                switch(figuras.get(i).getNombreFigura()){
                    case 4:
                        triangulo++;
                    case 5:
                        cuadrado++;
                    case 6:
                        circulo++;
                    case 7:
                        rectangulo++;
                }
            }
        }
        System.out.println("La cantidad de Piramides son "+ piramide+ "\n"+
                "La cantidad de Cilindros son "+ cilindro+ "\n"+
                "La cantidad de Conos son "+ cono+ "\n"+
                "La cantidad de Cubos son "+ cubo+ "\n"+
                "La cantidad de Triandulos son "+ triangulo+ "\n"+
                "La cantidad de Cuadrados son "+ cuadrado+ "\n"+
                "La cantidad de Circulos son "+ circulo+ "\n"+
                "La cantidad de Rectangulo son "+ rectangulo+ "\n");

        
        
    }
    
    public int getCantidadFiguras(boolean identificador){
        if(identificador == false){
            System.out.println("La figuras 2D son "+ figuras2D.size());
            return figuras2D.size();
        }
        else{
            System.out.println("La figuras 2D son "+ figuras3D.size());
            return figuras3D.size();
        }
    }
    
    public void recuperaFiguras(int identificador){
        switch(identificador){
            case 0:
                System.out.println("Piramide");
            case 1: 
                System.out.println("Cilindro");
            case 2:
                System.out.println("Cono");
            case 3:
                System.out.println("Cubo");
            case 4:
                System.out.println("Triangulo");
            case 5:
                System.out.println("Cuadrado");
            case 6:
                System.out.println("Circulo");
            case 7:
                System.out.println("Rectangulo");
            
        }
        LinkedList<Cilindro> cilindro = null;
        LinkedList<Piramide> piramide = null;
        LinkedList<Cono> cono = null;
        LinkedList<Cubo> cubo = null;
        LinkedList<Triangulo> triangulo = null;
        LinkedList<Rectangulo> rectangulo = null;
        LinkedList<Cuadrado> cuadrado = null;
        LinkedList<Circulo> circulo = null;
        for(int i = 0; i < figurasTodas.size(); i++){
            for(int k = 0; k < figurasTodas.get(i).size(); k++){
                switch(identificador){
                    case 0:
                        System.out.println("Piramide");
                        piramide.add((Piramide) figurasTodas.get(i).get(k));
                    case 1: 
                        System.out.println("Cilindro");
                        cilindro.add((Cilindro) figurasTodas.get(i).get(k));
                    case 2:
                        System.out.println("Cono");
                        cono.add((Cono) figurasTodas.get(i).get(k));
                    case 3:
                        System.out.println("Cubo");
                        cubo.add((Cubo) figurasTodas.get(i).get(k));
                    case 4:
                        System.out.println("Triangulo");
                        triangulo.add((Triangulo) figurasTodas.get(i).get(k));
                    case 5:
                        System.out.println("Cuadrado");
                        rectangulo.add((Rectangulo) figurasTodas.get(i).get(k));
                    case 6:
                        System.out.println("Circulo");
                        cuadrado.add((Cuadrado) figurasTodas.get(i).get(k));
                    case 7:
                        System.out.println("Rectangulo");
                        circulo.add((Circulo) figurasTodas.get(i).get(k));
                }
                }    
            }
            int h = 0;
            switch(identificador){
            case 0:
                for(h = 0; h < piramide.size(); h++)
                    System.out.println(piramide.get(h).toString());
            case 1: 
                for(h = 0; h < cilindro.size(); h++)
                    System.out.println(cilindro.get(h).toString());
            case 2:
                for(h = 0; h < cono.size(); h++)
                    System.out.println(cono.get(h).toString());
            case 3:
                for(h = 0; h < cubo.size(); h++)
                    System.out.println(cubo.get(h).toString());
                
            case 4:
                for(h = 0; h < triangulo.size(); h++)
                    System.out.println(triangulo.get(h).toString());
                
            case 5:
                for(h = 0; h < cuadrado.size(); h++)
                    System.out.println(cuadrado.get(h).toString());
            case 6:
                for(h = 0; h < circulo.size(); h++)
                    System.out.println(circulo.get(h).toString());
            case 7:
                for(h = 0; h < rectangulo.size(); h++)
                    System.out.println(rectangulo.get(h).toString());
            
        }
         
        
        
    }
    
    public void detalle(){
         for(int i = 0; i < figurasTodas.size(); i++){
            for(int k = 0; k < figurasTodas.get(i).size(); k++){
                figurasTodas.get(i).get(k).toString();
            }
        }
    }
    
    public void dibujar(Color unColor, int identificador){
        switch(identificador){
            case 4:
                System.out.println("Triangulo");
            case 5:
                System.out.println("Cuadrado");
            case 6:
                System.out.println("Circulo");
            case 7:
                System.out.println("Rectangulo");
            
        }
        LinkedList<Triangulo> triangulo = null;
        LinkedList<Rectangulo> rectangulo = null;
        LinkedList<Cuadrado> cuadrado = null;
        LinkedList<Circulo> circulo = null;
        for(int i = 0; i < figurasTodas.size(); i++){
            for(int k = 0; k < figurasTodas.get(i).size(); k++){
                switch(identificador){
                    case 4:
                        System.out.println("Triangulo");
                        triangulo.add((Triangulo) figurasTodas.get(i).get(k));
                    case 5:
                        System.out.println("Cuadrado");
                        rectangulo.add((Rectangulo) figurasTodas.get(i).get(k));
                    case 6:
                        System.out.println("Circulo");
                        cuadrado.add((Cuadrado) figurasTodas.get(i).get(k));
                    case 7:
                        System.out.println("Rectangulo");
                        circulo.add((Circulo) figurasTodas.get(i).get(k));
}
                }    
            }
            int h = 0;
            switch(identificador){
                
            case 4:
                for(h = 0; h < triangulo.size(); h++)
                    triangulo.get(h).dibujar(unColor);
                
            case 5:
                for(h = 0; h < cuadrado.size(); h++)
                    cuadrado.get(h).dibujar(unColor);
            case 6:
                for(h = 0; h < circulo.size(); h++)
                    circulo.get(h).dibujar(unColor);
            case 7:
                for(h = 0; h < rectangulo.size(); h++)
                    rectangulo.get(h).dibujar(unColor);
            
        }
         
        
    
    
    }
}








        