package Principal;

import java.util.Scanner;

import Salud.Empleado;
import Salud.Persona;

public class Inicio {
    public static void main(String[] args) throws Exception {

        double peso,estatura;

        String cargo, departamento;
        int horastrabajadas,valorhora;

        

        Scanner lectura= new Scanner(System.in);

        Persona persona = new Persona();

        System.out.println("Ingrese El Cargo Del Empleado");
        cargo=lectura.next();

        System.out.println("Ingrese El Departamento Del Empleado");
        departamento=lectura.next();

        System.out.println("Ingrese Las Horas Trabajadas Por El Empleado");
        horastrabajadas=lectura.nextInt();

        System.out.println("Ingrese El Valor De Las Horas");
        valorhora=lectura.nextInt();

/* 
        System.out.println("Digite Su Peso");
        peso=lectura.nextDouble();

        System.out.println("Digite Su Estatura");
        estatura=lectura.nextDouble();

        

        persona.pedirdatos();
        persona.mostrarPersona();
        persona.mayorEdad();
        persona.calcularImc(peso, estatura);

*/


         


       Empleado E1= new Empleado(persona.getDocumento(), persona.getEdad(), persona.getNombre(),persona.getApellido(), persona.getSexo(), persona.getTipodoc(), cargo, departamento, valorhora, horastrabajadas);

        E1.mostrarDatos();
        E1.calcularHonoraios();

        
        

    }  
}

