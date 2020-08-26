/**
 * Clase para los soldados de infantería.
 */
public class DeInfanteria extends Soldado {
    /* El nombre del soldado. */
    private String nombre;
    /* El ID del soldado. */
    private long id;
    /* Los puntos de vida del soldado. */
    private int puntos = 150;

    /**
     * Construye un soldado de infantería con nombre, ID y puntos de vida.
     * @param nombre el nombre del soldado.
     * @param id el ID del soldado.
     * @param puntos los puntos de vida del soldado.
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
     * Regresa un mensaje con el reporte del soldado.
     * @return un mensaje con el reporte del soldado.
     */
    @Override
    public void getReporte() {
        System.out.println("¡Soldado de infantería reportándose.!");
    }

    /**
     * Regresa la descripción del soldado.
     * @return la descripción del soldado. 
     */
    @Override
	public String toString() {
        return "Nombre: " + this.getNombre() + 
               ", HP: " + this.getPuntos() + "\n";
	}
}
