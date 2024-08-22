   

package roma.exam;

/**
 *
 * @author Tomas
 */
public class Exam {

    public static void main(String[] args) {
     
        Reloj rolex =new Reloj("15:00","31-08-2024","235L", 2334677);
        FIT cont= new FIT("15:00","31-08-2024","235L", 2334677);
        Persona pepito = new Persona("Pedro","lopez",34,1.70, rolex);
        pepito.asignarReloj(rolex);
        pepito.decirHora(rolex);
        System.out.println("El dia es "+ rolex.getDia());
        rolex.incrementarDia();
        System.out.println("Mañana es "+ rolex.getDia());
        pepito.hablar();
        pepito.comer();
        cont.cuentaPasos(4, 6);
    }
}
