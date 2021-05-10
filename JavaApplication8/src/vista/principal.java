/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.AdmFiguras;
import modelo.Color;
import modelo.Figura;
import java.util.Random;
import modelo.Cilindro;
import modelo.Circulo;
import modelo.Cono;
import modelo.Cuadrado;
import modelo.Cubo;
import modelo.FiguraGeometrica3D;
import modelo.Piramide;
import modelo.Rectangulo;
import modelo.Triangulo;
import java.util.*;
/**
 *
 * @author Chris
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        int valor = r.nextInt(21)+30;
        int nombreFigura = 0;
        int numColor;
        Color color = null;
        AdmFiguras admfiguras = new AdmFiguras();
        
        LinkedList<LinkedList> figuras = null;
        LinkedList<Cilindro> cilindro = null;
        LinkedList<Piramide> piramide = null;
        LinkedList<Cono> cono = null;
        LinkedList<Cubo> cubo = null;
        LinkedList<Triangulo> triangulo = null;
        LinkedList<Rectangulo> rectangulo = null;
        LinkedList<Cuadrado> cuadrado = null;
        LinkedList<Circulo> circulo = null;
        
        
        for(int i = 0; i < valor; i++){
            
            boolean tipoFigura =  r.nextBoolean();
            
            numColor = r.nextInt(5);
            switch(numColor){
                case 0:
                    color = Color.YELLOW;
                case 1:
                    color = Color.RED;
                case 2:
                    color = Color.BLUE;
                case 3:
                    color = Color.GREEN;
                case 4:
                    color = Color.WHITE;
            }
            
            if(tipoFigura == false){
                nombreFigura = r.nextInt(4);  
                double altura = r.nextDouble();
                switch(nombreFigura){
                    
                    case 0:
                        double areaBase = r.nextDouble();
                        double perimetroBase = r.nextDouble();
                        double apotema = r.nextDouble();
                        
                        Piramide piramides = new Piramide(areaBase, perimetroBase, apotema, altura,tipoFigura,nombreFigura,color);
                        piramide.add(piramides);
                        figuras.add(piramide);
                    case 1:
                        double radio = r.nextDouble();
                        Cilindro cilindros = new Cilindro(radio, altura,tipoFigura,nombreFigura,color);
                        figuras.add(cilindro);
                    case 2:
                        double radioC = r.nextDouble();
                        double generatriz = r.nextDouble();
                        Cono conos = new Cono(radioC, altura,generatriz,tipoFigura,nombreFigura,color);
                        cono.add(conos);
                        figuras.add(cono);
                    case 3:
                        Cubo cubos = new Cubo(altura,tipoFigura,nombreFigura,color);
                        cubo.add(cubos);
                        figuras.add(cubo);
                }
                
            }
            
            else{
                nombreFigura = r.nextInt(4)+4;
                double altura = r.nextDouble();
                switch(nombreFigura){
                    case 4:
                        double base = r.nextDouble();
                        double lado1 = r.nextDouble();
                        double lado2 = r.nextDouble();
                        Triangulo triangulos = new Triangulo(base,altura, lado1, lado2,tipoFigura,nombreFigura,color);
                        triangulo.add(triangulos);
                        figuras.add(triangulo);
                    case 5:;
                        Cuadrado cuadrados = new Cuadrado(altura,tipoFigura,nombreFigura,color);
                        cuadrado.add(cuadrados);
                        figuras.add(cuadrado);
                    case 6:
                        Circulo circulos = new Circulo(altura,tipoFigura,nombreFigura,color);
                        circulo.add(circulos);
                        figuras.add(circulo);
                    case 7:
                        double ancho = r.nextDouble();
                        Rectangulo rectangulos = new Rectangulo(ancho, altura,tipoFigura,nombreFigura,color);
                        rectangulo.add(rectangulos);
                        figuras.add(rectangulo);
                }
                    
            }
            //paso1
            admfiguras.setFiguras(figuras);
            Figura figura = null;
            
            admfiguras.agregarFigura(figura);
        }
        //paso2
        admfiguras.detalle();
        
        //paso3
        admfiguras.nombreFiguras(0);
        
        //paso4
        admfiguras.getCantidadFiguras(true);
        
        //paso5
        admfiguras.recuperaFiguras(2);
        
        //paso6
        admfiguras.recuperaFiguras(4);
        admfiguras.recuperaFiguras(1);
        
        
        //paso7
        int numero = r.nextInt(4)+4;
        admfiguras.dibujar(color, numero);
        
    }
      
}
