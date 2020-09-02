/**
 * Interfaz para los soldados.
 */
public interface Soldado {
    /**
     * Regresa el nombre del soldado.
     * @return el nombre del soldado.
     */
    public String getNombre();

    /**
     * Regresa el ID del soldado.
     * @return el ID del soldado.
     */
    public long getID();

    /**
     * Regresa los puntos de vida del soldado.
     * @return los puntos de vida del soldado.
     */
    public int getPuntos();

    /**
     * Regresa la distancia entre el enemigo y el soldado.
     * @return la distancia entre el enemigo y el soldado.
     */
    public int getDistancia();

    /**
     * Regresa el daño producido al enemigo.
     * @return el daño producido al enemigo. 
     */
    public int getDaño();

    /**
     * El soldado ataca al enemigo.
     */
    public void atacar();

    /**
     * El soldado se mueve en dirección al enemigo.
     */
    public void mover();

    /**
     * Regresa un mensaje con el reporte del soldado.
     */
    public void reportar();

    /**
     * Regresa la descripción del soldado.
     * @return la descripción del soldado.
     */
    public String toString();
}
