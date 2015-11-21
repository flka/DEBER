/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotaller;

/**
 *
 * @author W ANADRADE M
 */
public class CUADRADO {
     private double lado;

    public CUADRADO() {
    }

    public CUADRADO(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
 
     
        public void AREACUADRADO(){
       double area=lado*lado;
       System.out.println("EL AREA DEL CUADRADO ES :"+area);
    }

}
