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
        Color color;
        AdmFiguras admfiguras = new AdmFiguras();
        Figura figura;
        for(int i = 0; i < valor; i++){
            
            boolean tipoFigura =  r.nextBoolean();
            
            numColor = r.nextInt(4);
            switch(numColor){
                case 0:
                    color = Color.Amarillo;
                case 1:
                    color = Color.Azul;
                case 2:
                    color = Color.Rojo;
                case 3:
                    color = Color.Verde;
            }
            
            if(tipoFigura == false){
                nombreFigura = r.nextInt(4);  
                figura = new Figura2D(tipoFigura, nombreFigura, color);
            }
            
            else{
                nombreFigura = r.nextInt(4)+4;
                figura = new Figura3D(tipoFigura, nombreFigura, color);
            }
            //paso1
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
        admfiguras.dibujar(color);
        
    }
    
}
