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
import modelo.Color;

/**
 *
 * @author Chris
 */
public class AdmFiguras {
    LinkedList<Figura> figuras2D;
    LinkedList<Figura> figuras3D;
    LinkedList<Figura> figuras;
    
    public void agregarFigura(Figura figura){
        figuras.add(figura);
        if(figura.isTipoFigura() == false)
            figuras2D.add(figura);
        else
            figuras3D.add(figura);
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
        LinkedList<Figura> lista = new LinkedList<>();
        for(int i = 0; i < figuras.size(); i++){
            if(figuras.get(i).getNombreFigura() == identificador){
                lista.add(figuras.get(i));
                //detalle
            }
        }
        
    }
    
    public void detalle(){
         for(int i = 0; i < figuras.size(); i++){
             Figura figura = figuras.get(i);
             
         }
    }

    public void dibujar(Color unColor){
        for(int i = 0; i < figuras2D.size(); i++)
            figuras2D.get(i).dibujar();
    }
    
    
}
