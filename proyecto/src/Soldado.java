/**
 * Interfaz para los soldados.
 */
public interface Soldado {
    /**
     * Regresa la distancia del soldado con respecto a la del enemigo.
     * @return ls distancia del soldado con respecto a la del enemigo.
     */
    public String getDistancia();

    /**
     * El soldado ataca al enemigo. Si el soldado logra atacar, regresa el daño
     * ocasionado al enemigo; en caso contrario, regresa 0.
     * @return el daño causado al enemigo.
     */
    public int atacar();

    /**
     * El soldado se mueve en dirección al enemigo.
     */
    public void mover();

    /**
     * Regresa un mensaje con el reporte del soldado.
     * @return un mensaje con el reporte del soldado.
     */
    public String reportar();
}
