package FigurasGeometricas;

public class Triangulo extends Figura{

    double base, altura;

    public Triangulo(){
        
    }

    public Triangulo(double base, double altura){
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

        area=base*altura;
        area=area*area;

        

        System.out.println("El Area Del Triangulo Es: "+area);
    }

    
    
}
