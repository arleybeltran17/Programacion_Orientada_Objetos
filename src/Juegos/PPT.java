package Juegos;

import java.util.Random;
import java.util.Scanner;

public class PPT implements Juegos {

    Scanner lectura= new Scanner(System.in);

    private String nombre;
    private int opcionjug,opcioncop;


    public PPT(){
        
    }


    


    public PPT(String nombre, int opcionjug, int opcioncop) {
    this.nombre = nombre;
    this.opcionjug = opcionjug;
    this.opcioncop = opcioncop;
}


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getOpcionjug() {
        return opcionjug;
    }


    public void setOpcionjug(int opcionjug) {
        this.opcionjug = opcionjug;
    }


    public int getOpcioncop() {
        return opcioncop;
    }


    public void setOpcioncop(int opcioncop) {
        this.opcioncop = opcioncop;
    }



    public void iniciar(){

       
   
       System.out.println("Ingrese El Nombre Del Jugador");
       nombre= lectura.next();

       System.out.println("El Nombre Del Jugador Es: "+nombre);
       

       
    }

  
    public void jugar(){
        
        System.out.println("Ingrese Su Eleccion \n 1.Piedra \n 2.Papel \n 3.Tijeras ");
        opcionjug=lectura.nextInt();

        Random generator=new Random();
        opcioncop= generator.nextInt(3);
        opcioncop+=1;


        switch(opcionjug){
            case 1:{
                System.out.println("Tu Eleccion Fue: Piedra");
            }
            break;

            case 2:{
                System.out.println("Tu Eleccion Fue: Papel");
            }
            break;

            case 3:{
                System.out.println("Tu Eleccion Fue: Tijeras");

            }
            break;

            default:{
                System.out.println("Error");

            }
            break;
        }

        switch(opcioncop){
            case 1:{
                System.out.println("La Eleccion De La Maquina Es: Piedra");
            }
            break;

            case 2:{
                System.out.println("La Eleccion De La Maquina Es: Papel");
            }
            break;

            case 3:{
                System.out.println("La Eleccion De La Maquina Es: Tijeras");

            }
            break;

            default:{
                System.out.println("Error");


            }
            break;
        }
        
    }

   
    public void finalizar() {

        if((opcionjug==1)&&(opcioncop==3)){
            System.out.println("Ganaste");
            
        } else if((opcionjug==2)&&(opcioncop==1)){
            System.out.println("Ganaste");
           
        }else if((opcionjug==3)&&(opcioncop==2)){
            System.out.println("Ganaste");
            
        }else if(opcionjug==opcioncop){
            System.out.println("Empate");

        }else if ((opcionjug==1)&&(opcioncop==2)){
            System.out.println("Pierdes");

        }else if ((opcionjug==2)&&(opcioncop==3)){
            System.out.println("Pierdes");

        }else if ((opcionjug==3)&&(opcioncop==1)){
            System.out.println("Pierdes");

        }else {
            System.out.println("Error");
        }
            
        

       

    
 }
 
}
