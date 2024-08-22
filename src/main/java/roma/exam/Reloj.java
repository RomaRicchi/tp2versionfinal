/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roma.exam;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Reloj {
    private LocalTime hora;
    private LocalDate dia;
    private String modelo;
    private long numSerie;

    public Reloj(String hora, String dia, String modelo, long numSerie) {
        this.hora = LocalTime.parse(hora, DateTimeFormatter.ofPattern("HH:mm"));
        this.dia = LocalDate.parse(dia, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.modelo = modelo;
        this.numSerie = numSerie;
    }

    public String getHora() {
        return hora.format(DateTimeFormatter.ofPattern("HH:mm"));
    }

    public String getDia() {
        
        return dia.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        
    }

    public void incrementarDia() {
        dia = dia.plusDays(1);
        System.out.println("Día incrementado " + getDia());
    }

    public void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Pantalla limpiada");
    }

               
    public void incrementarHora(){
        hora = hora.plusHours(1);
        if(hora.getHour()==0){
            incrementarDia();
        }
    }         

    @Override
    public String toString() {
        return "Reloj{" + "dia=" + dia + '}';
    }
            
    
   
}
