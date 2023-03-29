package FigurasGeometricas;

import java.util.Scanner;

public class Ejecucion {

    
    
    public static void main(String[] args) {
        
        int decision,otro=1;

        double radio,area,base,altura;
        int lado;

        Scanner lectura=new Scanner(System.in);

        while(otro==1){
        System.out.println("Seleccione La Figura De La Cual Quiere Sacar El Area, 1= Circulo, 2= Cuadrado, 3=Triangulo, 4= Rectangulo");
        decision=lectura.nextInt();

        switch(decision){
            case 1:{
                System.out.println("Eligio Circulo");

                System.out.println("Ingrese El Radio Del Circulo");
                radio=lectura.nextDouble();

                 Circulo C1=new Circulo(radio);
                 
                 C1.calcularArea();                        
            }
            break;

            case 2:{
                System.out.println("Eligio Cuadrado");

                System.out.println("Ingrese El Valor Del Lado Del Cuadrado");
                lado=lectura.nextInt();
                Cuadrado Cu1=new Cuadrado(lado);  
                
                Cu1.calcularArea();
                
            }
            break;

            case 3:{
                System.out.println("Eligio Triangulo ");

                System.out.println("Ingrese La Base Del Triangulo");
                base=lectura.nextDouble();

                System.out.println("Ingrese La Altura Del Triangulo");
                altura=lectura.nextDouble();

                Triangulo Tr1=new Triangulo(base,altura);
                Tr1.calcularArea();
            }
            break;

            case 4:{
                System.out.println("Rectangulo");

                System.out.println("Ingrese La Base Del Triangulo");
                base=lectura.nextDouble();

                System.out.println("Ingrese La Altura Del Triangulo");
                altura=lectura.nextDouble();

                Rectangulo Rc =new Rectangulo(base,altura);

                Rc.calcularArea();
            }

            

        }

        System.out.println("Desea Calcular Otro Area?, 1=Si, 2=No");
            otro=lectura.nextInt();

    }
    
 }
}