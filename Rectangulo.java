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
public class Rectangulo {
    
   private int X;
   private int Y;
   private int Alto;
   private int Ancho;
   private int R;
   private int V;
   private int A;
   
   public Rectangulo (int x,int y,int alto,int ancho){
        X = x;
        Y = y;
        Alto = alto;
        Ancho = ancho;
        R = 0;
        V = 0;
        R = 0;     
   }
   
 public void Cambiacolor (int rojo,int verde,int azul){
        R = rojo;
        V = verde;
        A = azul;
        
    } 
   
 public void DibujaRectangulo (Graphics g){
     
     Linea L;
     L = new Linea (X,Y,X+Ancho,Y);
     L.ColorLinea(R, V, A);
     L.dibujaLinea(g);
     L = new Linea(X+Ancho,Y,X+Ancho,Y+Alto);
      L.ColorLinea(R, V, A);
     L.dibujaLinea(g);
     L = new Linea (X,Y,X,Y+Alto);
     L.ColorLinea(R, V, A);
     L.dibujaLinea(g);
     L = new Linea(X,Y+Alto,X+Ancho,Y+Alto);
      L.ColorLinea(R, V, A);
     L.dibujaLinea(g);
     
 }
   
 public void dibujaRelleno (Graphics g){
     
     Linea L;
     for (int i = 0;i<Alto;i++){
         L = new Linea (X,Y+i,X+Ancho,Y+i);
         L.ColorLinea(R, V, A);
         L.dibujaLinea(g);
     }
 }

}
