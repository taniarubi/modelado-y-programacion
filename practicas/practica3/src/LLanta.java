/**
 * Interfaz para las llantas.
 */
public interface LLanta {

    /* Crea una llanta con tipo y costo. */
    public void crearLLanta();

    /**
     * Regresa el tipo de llanta.
     * @return el tipo de llanta.
     */
    public String getTipo();

    /**
     * Regresa el costo de la llanta.
     * @return el costo de la llanta.
     */
    public int getCosto();
}
