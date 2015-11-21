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
public class EJERCICIOTALLER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CUADRADO AREA1 =new CUADRADO (2);
        AREA1.AREACUADRADO();
        RECTANGULO AREA2 =new RECTANGULO (2,3);
        AREA2.AREARECTANGULO();
         TRIANGULO AREA3 =new TRIANGULO (2,3);
        AREA3.AREATRIANGULO();
           CIRCULO AREA4 =new CIRCULO (20);
        AREA4.AREACIRCULO();
    }
    
}
