/**
 * Clase abstracta para los soldados.
 */
public abstract class Soldado {

    /**
     * Regresa el nombre del soldado.
     * @return el nombre del soldado.
     */
    public abstract String getNombre();

    /**
     * Regresa el ID del soldado.
     * @return el ID del soldado.
     */
    public abstract long getID();

    /**
     * Regresa los puntos de vida del soldado.
     * @return los puntos de vida del soldado.
     */
    public abstract int getPuntos();

    /**
     * Regresa un mensaje con el reporte del soldado.
     * @return un mensaje con el reporte del soldado.
     */
    public abstract void getReporte();

    /**
     * Regresa la descripción del soldado.
     * @return la descripción del soldado.
     */
    public abstract String toString();
}
