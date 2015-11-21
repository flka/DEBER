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
public class RECTANGULO extends FIGURA {
     
    public RECTANGULO() {
        
 
    }
        public RECTANGULO(int altura,int base) {
              this.setAltura(altura);
              this.setBase(base);
    }
       public void AREARECTANGULO(){
       double area=this.getAltura()* this.getBase();
       System.out.println("EL AREA DEL RECTANGULO ES :"+area);
    }

    
 

    
}
