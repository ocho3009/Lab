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
    
    public void nombreFigu(){
        for(int i = 0; i < figuras.size(); i++)
            System.out.println("La figura "+ i+1 +" se llama "+ figuras.get(i).getNombreFigura());
        
    }
    
    public void tipoFig(){
        int piramide = 0;
        int cilindro = 0;
        int cono = 0;
        int cubo = 0;
        int triangulo = 0;
        int cuadrado = 0;
        int circulo = 0;
        int rectangulo = 0;
        
        for(int i = 0; i < figuras.size(); i++){
            switch(figuras.get(i).getNombreFigura()){
                case 0:
                    piramide++;
                case 1:
                    cilindro++;
                case 2:
                    cono++;
                case 3:
                    cubo++;
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
        System.out.println("La cantidad de Piramides son "+ piramide+ "\n"+
                "La cantidad de Cilindros son "+ cilindro+ "\n"+
                "La cantidad de Conos son "+ cono+ "\n"+
                "La cantidad de Cubos son "+ cubo+ "\n"+
                "La cantidad de Triandulos son "+ triangulo+ "\n"+
                "La cantidad de Cuadrados son "+ cuadrado+ "\n"+
                "La cantidad de Circulos son "+ circulo+ "\n"+
                "La cantidad de Rectangulo son "+ rectangulo+ "\n");

        
        
    }
    
    public void cantidadCat(){
        
        System.out.println("La figuras 2D son "+ figuras2D.size());
        System.out.println("La figuras 2D son "+ figuras3D.size());    
    }
    
    public LinkedList<Figura> recupera(int identificador){
        LinkedList<Figura> lista = new LinkedList<>();
        for(int i = 0; i < figuras.size(); i++){
            if(figuras.get(i).getNombreFigura() == identificador)
                lista.add(figuras.get(i));
        }
        return lista;
    }
    
    public void detalle(){
         for(int i = 0; i < figuras.size(); i++){
             Figura figura = figuras.get(i);
             
         }
    }

    
    
    
}
