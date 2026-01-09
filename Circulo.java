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
public class Circulo {
    private int X_C;
    private int Y_C;
    private int RA;
    private int R;
    private int V;
    private int A;
    
    public Circulo (int x,int y,int radio){
        
        X_C=x;
        Y_C=y;
        RA=radio;
        R=0;
        V=0;
        A=0;
    }
    
    public void Cambiacolor (int rojo,int verde,int azul){
        R = rojo;
        V = verde;
        A = azul;
    }
    
    public void DibujaCirculo (Graphics g){
        Punto p;
        int x;
        int y;
        int pp;
        x=0;
        y=RA;
        pp = 3-(2*RA);
        while (x<=y){
            p = new Punto (X_C+x,Y_C+y,R,V,A);
            p.dibujo(g);
            p = new Punto (X_C-x,Y_C+y,R,V,A);
            p.dibujo(g);
            p = new Punto (X_C+x,Y_C-y,R,V,A);
            p.dibujo(g);
            p = new Punto (X_C-x,Y_C-y,R,V,A);
            p.dibujo(g);
            p = new Punto (X_C+y,Y_C+x,R,V,A);
            p.dibujo(g);
            p = new Punto (X_C-y,Y_C+x,R,V,A);
            p.dibujo(g);
            p = new Punto (X_C+y,Y_C-x,R,V,A);
            p.dibujo(g);
            p = new Punto (X_C-y,Y_C-x,R,V,A);
            p.dibujo(g);
            if (pp<0){
                pp = pp+4*x+6;
            }
            else {
                pp= pp+4*(x-y)+10;
                y--; }
            x++;
        }  
    }
    
   
      public void RellenarCirculo (Graphics g){
        Linea l;
        int x=0;
        int y=RA;
        int pp=3-2*RA;
        while(x<=y){
            l= new Linea(X_C+x,Y_C+y,X_C-x,Y_C+y);
            l.ColorLinea(R,V,A);
            l.dibujaLinea(g);
            l= new Linea(X_C+x,Y_C-y,X_C-x,Y_C-y);
            l.ColorLinea(R,V,A);
            l.dibujaLinea(g);       
            l= new Linea(X_C+y,Y_C+x,X_C-y,Y_C+x);
            l.ColorLinea(R,V,A);
            l.dibujaLinea(g);
            l= new Linea(X_C+y,Y_C-x,X_C-y,Y_C-x);
            l.ColorLinea(R,V,A);
            l.dibujaLinea(g);
            if(pp<0){
                pp+=4*x+6;
            }else{
                pp+=4*(x-y)+10;
                y--;
            }
            x++;
        }
       
          
 }
}

    

