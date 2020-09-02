/**
 * Clase para los enemigos.
 */
public class Enemigo {
    /* El nombre del enemigo. */
    private String nombre;
    /* Los puntos de vida del enemigo. */
    private int puntos = 500;
    
    /**
     * Crea un enemigo con nombre y puntos de vida.
     * @param nombre el nombre del enemigo.
     */
    public Enemigo(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Regresa el nombre del enemigo.
     * @return el nombre del enemigo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Regresa los puntos de vida del enemigo.
     * @return los puntos de vida del enemigo.
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * Recibe el ataque de un soldado.
     */
    public void recibeAtaque() {
        System.out.println("");
    }
}
