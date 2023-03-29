package FigurasGeometricas;

public class Cuadrado extends Figura{

    private int lado;

    public Cuadrado(){
        
    }

    public Cuadrado(int lado){
        this.lado=lado;

    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public void calcularArea(){

        double area;

        area= lado*lado;

        System.out.println("El Area Del Cuadrado Es: "+area);

    }


    
}
