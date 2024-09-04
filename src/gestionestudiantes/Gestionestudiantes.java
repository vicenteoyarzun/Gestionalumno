/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionestudiantes;
import java.util.Scanner;
public class Gestionestudiantes {
    public static void main(String[] args) {
        //crear un objeto o instancia de la clase scanner
         Scanner scanner = new Scanner(System.in);
         
         //Ingresar informacion
         System.out.println("Ingrese el nombre del estudiante");
         String nombre = scanner.nextLine();
         
         System.out.println("Ingrese codigo matricula del estudiante");
         String matricula = scanner.nextLine();
         
         System.out.println("Ingrese Nota final del estudiante");
         Double notaFinal  = scanner.nextDouble();
         
         //crear un nuevo objeto con cariables
         //NombreClase nombreObjeto = new NombreClase(argumentos constructor);
         Estudiante estudiante1 = new Estudiante(matricula, nombre, notaFinal);
         System.out.println("Informacion del estudiante");
         System.out.println(estudiante1.getInfo());
         //verificar si paso el curso
         if (estudiante1.haAprobado()){
             System.out.println("El estudiante aprobo con un: "+notaFinal);
         }else{
             System.out.println("El estudiante reprobo con un: "+notaFinal);
         }
    }
    
}
