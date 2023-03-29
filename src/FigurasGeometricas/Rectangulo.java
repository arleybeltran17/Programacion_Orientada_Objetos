package FigurasGeometricas;

public class Rectangulo extends Figura {

    private double base,altura;

    public Rectangulo(){
        
    }

    public Rectangulo(double base, double altura){

        this.base=base;
        this.altura=altura;

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void calcularArea(){
        double area;

        area= base*altura;

        System.out.println("El Area Del Rectangulo Es: "+area);
    }

    
    
}
