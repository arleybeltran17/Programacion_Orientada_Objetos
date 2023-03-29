package Salud;

import java.util.Scanner;

public class Persona {
     private int documento,edad;
     private String nombre,apellido,sexo,tipodoc;


     public Persona(){
      
     }

    
     public Persona(int documento, int edad, String nombre, String apellido, String sexo, String tipodoc) {
      this.documento = documento;
      this.edad = edad;
      this.nombre = nombre;
      this.apellido = apellido;
      this.sexo = sexo;
      this.tipodoc = tipodoc;
   }

   public int getDocumento() {
      return documento;
   }



   public void setDocumento(int documento) {
      this.documento = documento;
   }



   public int getEdad() {
      return edad;
   }



   public void setEdad(int edad) {
      this.edad = edad;
   }



   public String getNombre() {
      return nombre;
   }



   public void setNombre(String nombre) {
      this.nombre = nombre;
   }



   public String getApellido() {
      return apellido;
   }



   public void setApellido(String apellido) {
      this.apellido = apellido;
   }



   public String getSexo() {
      return sexo;
   }



   public void setSexo(String sexo) {
      this.sexo = sexo;
   }



   public String getTipodoc() {
      return tipodoc;
   }



   public void setTipodoc(String tipodoc) {
      this.tipodoc = tipodoc;
   }



   public void pedirdatos(){

        Scanner captura = new Scanner (System.in);

        System.out.println(" Ingrese El Tipo de documento");
        tipodoc=captura.next();

        System.out.println("Ingrese El Numero De Documento");
        documento=captura.nextInt();

        System.out.println("Ingrese Nombre ");
        nombre=captura.next();

        System.out.println("Ingrese Su Apellido");
        apellido=captura.next();

        System.out.println("Ingrese Su Edad");
        edad=captura.nextInt();

        System.out.println("Ingrese Su Genero");
        sexo=captura.next();


        captura.close();

     }

     public double calcularImc(double peso, double estatura){

        double Imc;

        Imc= peso /(estatura*estatura);

        

        if(Imc<=20){
         System.out.println("Peso Por Debajo De Lo Ideal");

        }else if(Imc>20&&Imc<26){
         System.out.println("Se Encuentra En El Peso Ideal");

        }else if(Imc>25){
         System.out.println("Tienes Sobrepeso");

        }else{
         System.out.println("Error");
        }

        System.out.println("Su Imc Es De: "+Imc);
        
        return Imc;


     }

     public void mostrarPersona(){
        System.out.println("El Tipo De Documento Es: "+tipodoc);
        System.out.println("El Numero De Documento Es: "+documento);
        System.out.println("Su Nombre Es: "+nombre);
        System.out.println("Su Apellido Es: "+apellido);
        System.out.println("Su Edad Es: "+edad );
        System.out.println("Su genero es: "+sexo );

     }

     public void mayorEdad(){


        if(edad<=17){
         System.out.println("Eres Menor De Edad");

        }else{
         System.out.println("Eres Mayor De Edad");
        }
        
     }

     
}