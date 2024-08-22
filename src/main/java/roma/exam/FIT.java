
package roma.exam;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Tomas
 */
public class FIT extends Reloj{

    public FIT(String hora, String dia, String modelo, long numSerie) {
        super(hora, dia, modelo, numSerie);
    }

    public void cuentaPasos(int x, int y) {
       
        int pasos = Math.abs(x - y); 
        System.out.println("Pasos contados: " + pasos);
    }

    public void frecuenciaAleatoria() {
        
        double frecuencia = Math.random() * 100; 
        System.out.println("Frecuencia aleatoria calculada: " + frecuencia + " Hz");
    }
}
