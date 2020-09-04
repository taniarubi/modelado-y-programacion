/**
 * Interfaz para el observador. 
 */
public interface Observador {
    /**
     * Los comandantes envían a sus soldados subordinados la acción que deben 
     * realizar.
     * @param accion la acción que deben realizar los soldados subordinados del
     * comandante.
     * @param enemigo el enemigo que será afectado por la acción.
     */
    public void actualizar(int accion, Enemigo enemigo);
}
