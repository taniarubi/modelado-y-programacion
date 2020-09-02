/**
 * Clase para los soldados de infantería.
 */
public class DeInfanteria implements Soldado {
    /* El nombre del soldado. */
    private String nombre;
    /* El ID del soldado. */
    private long id;
    /* Los puntos de vida del soldado. */
    private int puntos = 150;
    /* La distancia entre el enemigo y el soldado. */
    private int distancia = 35;
    /* El daño que inflige al enemigo. */
    private int daño = 7;

    /**
     * Construye un soldado de infantería con nombre, ID y puntos de vida.
     * @param nombre el nombre del soldado.
     * @param id el ID del soldado.
     */
    public DeInfanteria(String nombre, long id) {
        this.nombre = nombre;
        this.id = id;
    }

    /**
     * Regresa el nombre del soldado. 
     * @return el nombre del soldado.
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     * Regresa el ID del soldado.
     * @return el ID del soldado.
     */
    @Override
    public long getID() {
        return id;
    }

    /**
     * Regresa los puntos de vida del soldado.
     * @return los puntos de vida del soldado.
     */
    @Override
    public int getPuntos() {
        return puntos;
    }

    /**
     * Regresa la distancia entre el enemigo y el soldado.
     * @return la distancia entre el enemigo y el soldado.
     */
    @Override
    public int getDistancia() {
        return distancia;
    }

    /**
     * Regresa el daño infligido al enemigo. 
     * @return el daño infligido al enemigo.
     */
    @Override
    public int getDaño() {
        return daño;
    }

    /**
     * El soldado ataca al enemigo.
     */
    @Override
    public void atacar() {
        System.out.println(getNombre() + " ataca al enemigo!");
    }

    /**
     * El soldado se mueve en dirección al enemigo.
     */
    @Override
    public void mover() {
        this.distancia -= 5;
    }

    /**
     * Regresa un mensaje con el reporte del soldado.
     */
    @Override
    public void reportar() {
        System.out.println("¡Soldado de infantería reportándose.!");
    }

    /**
     * Regresa la descripción del soldado.
     * @return la descripción del soldado. 
     */
    @Override
	public String toString() {
        return "Nombre: " + this.getNombre() + "\n" +
               "- ID: " + this.getID() + "\n" +
               "- HP: " + this.getPuntos() + "\n" + 
               "- Distancia: " + this.getDistancia() + "\n" + 
               "- Daño: " + this.getDaño() + "\n" + 
               "- Tipo: Infantería" + "\n";
	}
}
