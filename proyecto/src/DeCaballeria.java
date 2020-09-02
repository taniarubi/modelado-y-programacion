/**
 * Clase para los soldados de caballería.
 */
public class DeCaballeria implements Soldado {
    /* El nombre del soldado. */
    private String nombre;
    /* El ID del soldado. */
    private long id;
    /* Los puntos de vida del soldado. */
    private int puntos = 180;
    /* La distancia entre el enemigo y el soldado. */
    private int distancia = 45;
    /* El daño que inflige al enemigo. */
    private int daño = 5; 

    /**
     * Construye un soldado de caballería con nombre, ID y puntos de vida.
     * @param param nombre el nombre del soldado.
     * @param id el ID del soldado.
     */
    public DeCaballeria(String nombre, long id) {
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
     * Regresa el daño inflijido al enemigo.
     * @return el daño inflijido al enemigo.
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
        System.out.println(nombre + " ataca al enemigo!");
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
        System.out.println("¡Soldado de caballería reportándose!");
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
               "- Tipo: Caballería" + "\n";
	}
}
