package roma.exam;


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

    public String getApellidos() {
        return apellidos;
    }

    public double getAltura() {
        return altura;
    }

    public Persona(String nombre, String apellidos, int edad, double altura) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.altura = altura;
    }

    
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

    public void decirHora() {
        if (unReloj != null) {
            System.out.println("La hora actual es: " + unReloj.getHora());
        } else {
            System.out.println("No hay reloj asignado.");
        }
    }

    public Reloj getUnReloj() {
        return unReloj;
    }

    public void setUnReloj(Reloj unReloj) {
        this.unReloj = unReloj;
    }
}
