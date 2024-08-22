/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roma.exam;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Tomas
 */
public class Persona{
    private String nombre;
    private final String apellidos;
    private int edad;
    private final double altura;
    private Reloj unReloj;

    public Persona(String nombre, String apellidos, int edad, double altura, Reloj unReloj) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.altura = altura;
        this.unReloj = null;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void comer(){
         System.out.println("Ya comi.");
    }
    
    public void hablar(){
         System.out.println("bla, bla, bla.");
    }
    
  
     public void asignarReloj(Reloj reloj) {
        this.unReloj = reloj;
    }

    public void decirHora(Reloj r) {
        if (unReloj != null) {
            System.out.println("La hora actual es: " + unReloj.getHora());
        } else {
            System.out.println("No hay reloj asignado.");
        }
    }
}
