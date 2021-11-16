/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;
import java.util.Scanner;
/**
 *
 * @author Chiva
 */
public class Datos {
    String Nombre;
    String Apellido;
    int Edad;
    String Hobbie;
    String EditorCodigo;
    String SistemaOp;
    
public void leeDatos(){
    Scanner teclado=new Scanner(System.in);
    System.out.println("Ingresar Nombre: ");
    Nombre=teclado.nextLine();
    System.out.println("Ingresar Apellido: ");
    Apellido=teclado.nextLine();
    System.out.println("Ingresar Edad: ");
    Edad=teclado.nextInt();
    System.out.println("Ingresar Hobbie: ");
    Hobbie=teclado.nextLine();
    System.out.println("Ingresar Editor de Código Favorito: ");
    EditorCodigo=teclado.nextLine();
    System.out.println("Ingresar Sistema Operativo Utilizado: ");
    SistemaOp=teclado.next();
}

    public static void main(String[] args){
    Datos ob1=new Datos ();
    ob1.leeDatos();
    ob1.mostrarDatos();
}
    public void mostrarDatos() {
System.out.println("El nombre es: "+Nombre);
System.out.println("El apellido es: "+Apellido);
System.out.println("La edad es: "+Edad);
System.out.println("El Hobbie es: "+Hobbie);
System.out.println("El Editor de Código Favorito es: "+EditorCodigo);
System.out.println("El Sistema Operativo Utilizado es: "+SistemaOp);
}
}


