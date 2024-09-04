/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionestudiantes;
public class Estudiante {
    //Atributos
    private String matricula;
    private String nombre;
    private Double notaFinal;
    
    //constructor

    public Estudiante(String matricula, String nombre, Double notaFinal) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.notaFinal = notaFinal;
    }
    public String getInfo(){
        return "Nombre del estudiante= "+nombre+ " Numero de matricula= "+matricula+ " Nota final= "+notaFinal;
    }
    //metodo disponibilidad
    public Boolean haAprobado(){
        return notaFinal>=4.0;
    }
}
