package Salud;

import java.util.Scanner;

public class Empleado extends Persona {

    private String cargo, departamento;
    private int valorhora, horastrabajadas;

    public Empleado(){

    }

    public Empleado(int documento,int edad, String nombre, String apellido, String sexo, String tipodoc, String cargo, String departamento, int valorhora, int horastrabajadas){
        super(documento, edad, nombre, apellido, sexo, tipodoc);
        this.cargo=cargo;
        this.departamento=departamento;
        this.horastrabajadas=horastrabajadas;
        this.valorhora=valorhora;


    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getValorhora() {
        return valorhora;
    }

    public void setValorhora(int valorhora) {
        this.valorhora = valorhora;
    }

    public int getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public void pedirDatos(){

        Scanner lectura= new Scanner(System.in);

        System.out.println("Ingrese El Cargo Del Empleado");
        cargo=lectura.next();

        System.out.println("Ingrese El Departamento Del Empleado");
        departamento=lectura.next();

        System.out.println("Ingrese El Valor De La Hora");
        valorhora=lectura.nextInt();

        System.out.println("Ingrese Las Horas Trabajadas");
        horastrabajadas=lectura.nextInt();

    }

    public void mostrarDatos(){

        System.out.println("Tipo De Documento: "+getTipodoc());
        System.out.println("Documento: "+getDocumento());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Cargo: "+cargo);
        System.out.println("Departamento: "+departamento);
        System.out.println("Valor hora: "+valorhora);
        System.out.println("Horas Trabajadas: "+horastrabajadas);

            

    }

    public void calcularHonoraios(){

        double total,reteica;
        

        total= valorhora*horastrabajadas;
        reteica=(0.996-total);

        total=(total-reteica);

        System.out.println("El Total A Pagar Es: "+total);
        
    }

    


    
}
