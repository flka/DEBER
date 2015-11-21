
package ejerciciotaller;


public class CIRCULO {
    
     private double pi;
     private int radio;

    public CIRCULO() {
    }

    public CIRCULO(double pi) {
        this.pi = pi;
    }

    public CIRCULO(double pi, int radio) {
        this.pi = pi;
        this.radio = radio;
    }

    public CIRCULO(int radio) {
        this.radio = radio;
    }
     
    

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
     
       public void AREACIRCULO(){
       double area=3.1416*(radio*radio);
       System.out.println("EL AREA DEL CIRCULO ES :"+area);
    }

}
