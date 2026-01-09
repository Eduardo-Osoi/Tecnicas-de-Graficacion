/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgraficacion;
import java.awt.*;
/**
 *
 * @author Jose Eduardo Madrigal Osorio
 * 
 */
public class Punto {
    private int X;
    private int Y;
    private int Rojo;
    private int Verde;
    private int Azul;
    
    public Punto (int x, int y,int r,int v,int a){
        
        X = x;
        Y = y;
        Rojo = r;
        Verde = v;
        Azul = a;
        
    } 
    
    public void dibujo (Graphics g){
        Color nuevoColor = new Color (Rojo,Verde,Azul);
        g.setColor(nuevoColor);
        g.drawLine(X, Y, X, Y);
    }
}
