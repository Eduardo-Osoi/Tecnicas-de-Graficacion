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
public class Linea {
    private int X1;
    private int Y1;
    private int X2;
    private int Y2;
    private int R;
    private int V;
    private int A;
    Punto p;
    public  Linea (int x1,int y1,int x2,int y2){
        
        X1 = x1;
        Y1 = y1;
        X2 = x2;
        Y2 = y2;
        R = 0;
        V = 0;
        R = 0;   
       
                
    }
     public void ColorLinea (int rojo,int verde,int azul){
        R = rojo;
        V = verde;
        A = azul;
        
    }
    
    public void dibujaLinea (Graphics g){
        Color nuevoColor = new Color  (R,V,A);
        g.setColor(nuevoColor);
        g.drawLine(X1, Y1, X2, Y2);
    }


    public void TrazaConPendiente (Graphics g){
    {
        double m=0;
        int cambio;
        if(X1==X2){
            if(Y1>Y2){
                cambio=Y1;
                Y1=Y2;
                Y2=cambio;           
            }
            for(int i=Y1;i<Y2;i++){
                p = new Punto(X1,i,R,V,A);
                p.dibujo(g);
            }
        }else{
            if(Y1==Y2){
                if(X1>X2){
                    cambio=X1;
                    X1=X2;
                    X2=cambio;
                }
                for(int i=X1;i<X2;i++){
                    p = new Punto(i,Y1,R,V,A);
                    p.dibujo(g);
                }
            }
            else{
               if(X2<X1){
                cambio=X1;
                X1=X2;
                X2=cambio;
                cambio=Y1;
                Y1=Y2;
                Y2=cambio;
            }
            m = (double)(Y2-Y1)/(double)(X2-X1);
            for(int i=X1;i<X2;i++){
                int y=(int)(m*(i-X1))+Y1;
                p = new Punto(i,y,R,V,A);
                p.dibujo(g);
            }
            if(Y2<Y1){
                cambio=X1;
                X1=X2;
                X2=cambio;
                cambio=Y1;
                Y1=Y2;
                Y2=cambio;
            }
            for(int i=Y1;i<Y2;i++){
                int x=(int)((i-Y1)/m)+X1;
                p= new Punto(x,i,R,V,A);
                p.dibujo(g);
            }
            }
           
        }
    }
    }
    
    public void trazaBrezenham(Graphics g){ 

        Punto punto; 

        int x,y,dx,dy,p,incE,incNE,stepx,stepy; 
        dx=(X2-X1); 
        dy=(Y2-Y1); 
        if(dy<0){ 
            dy=-dy; 
            stepy=-1; 
        }else{ 
            stepy=1; 
        } 
        if(dx<0){ 
            dx=-dx; 
            stepx=-1; 
        }else{ 
            stepx=1; 
        } 
        x=X1; 
        y=Y1; 
        if(dx>dy){ 
            p=2*dy-dx; 
            incE=2*dy; 
            incNE=2*(dy-dx); 
            while(x!=X2){ 
                x+=stepx; 
                if(p<0){ 
                    p+=incE; 
                }else{ 
                    y+=stepy; 
                    p+=incNE; 
                } 
                punto = new Punto(x,y,R,V,A); 
                punto.dibujo(g);
            } 
        }else{ 
            p=2*dx-dy;    
            incE=2*dx; 
            incNE=2*(dx-dy); 
            while(y!=Y2){ 
                y+=stepy; 
                if(p<0){ 
                    p+=incE; 
                }else{ 
                    x+=stepx; 
                    p+=incNE; 
                } 
                punto = new Punto(x,y,R,V,A); 
                punto.dibujo(g);
            } 
        } 
    } 
    
    public void TrazaDDA (Graphics g){
        Punto punto;
        int dx,dy,pasos;
        float xs,ys,x,y;
          dx =  X2 - X1 ;
        dy = Y2 - Y1 ;
        x = X1 ;
        y = Y1 ;
         if ((Math.abs(dx) > Math.abs(dy) )){
         pasos = Math.abs(dx) ;}
else
        pasos = Math.abs(dy) ;
        if (pasos == 0) {
      p = new Punto((int) x,(int) y,R,V,A); 
      p.dibujo(g);
 return ;}
         xs = dx/pasos ;
         ys = dy/pasos ;
        for (int i = 0; i <= pasos; i++) {
          p = new Punto((int)x,(int)y,R,V,A); 
          p.dibujo(g);
      x = x + xs ;
      y = y + ys ;
        }
    }
}
