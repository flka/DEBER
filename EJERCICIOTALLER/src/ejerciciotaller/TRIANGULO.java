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
public class TRIANGULO  extends FIGURA{
    private int division;

    public TRIANGULO() {
    }

    public TRIANGULO(int altura,int base) {
              this.setAltura(altura);
              this.setBase(base);
    }
       public void AREATRIANGULO(){
       double area=this.getAltura()* this.getBase()/2;
       System.out.println("EL AREA DEL TRIANGULO ES :"+area);
    }
    
    
    public TRIANGULO(int division) {
        this.division = division;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }
    
    
    
}
