package FigurasGeometricas;

public class Circulo extends Figura{

    private double radio;

    public Circulo(){
        
    }

    public Circulo(double radio){
        this.radio=radio;

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void calcularArea(){
        double area;

        area= (radio*radio)*3.14;

        System.out.println("El Area Del Circulo Es"+area);
    }
    
}
