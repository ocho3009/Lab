/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Chris
 */
public class Figura {
    private boolean tipoFigura;
    private int nombreFigura;
    private Color color;
        

    public Figura(boolean tipoFigura, int nombreFigura, Color color) {
        this.tipoFigura = tipoFigura;
        this.nombreFigura = nombreFigura;
        this.color = color;
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

