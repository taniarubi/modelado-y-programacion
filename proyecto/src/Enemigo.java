/**
 * Clase para los enemigos.
 */
public class Enemigo {
    /* El nombre del enemigo. */
    private String nombre;
    /* Los puntos de vida del enemigo. */
    private int puntos = 1000;
    
    /**
     * Crea un enemigo con nombre y puntos de vida.
     * @param nombre el nombre del enemigo.
     */
    public Enemigo(String nombre) {
        this.nombre = nombre;
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
     * @param daño el daño inflijido al enemigo por un soldado.
     */
    public void recibeAtaque(int daño) {
        if((this.puntos - daño) < 0) {
            this.puntos = 0;
            System.out.println("HP del enemigo: " + this.puntos);
        } else {
        this.puntos -= daño;      
        System.out.println("HP del enemigo: " + this.puntos);
        }
    }
}
