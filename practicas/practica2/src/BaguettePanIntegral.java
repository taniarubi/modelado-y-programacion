/**
 * Clase para una Baguette con pan integral (hecho con harina integral de 
 * trigo).
 */
public class BaguettePanIntegral extends Baguette {
    /* La descripción de la Baguette. */
    private String descripcion;
    /* El costo del pan integral. */
    private int costo;

    /* Construye una baguette con pan integral. */
    public BaguettePanIntegral() {
        this.descripcion = "Pan integral $8 \n";
        this.costo = 8;
    }

    /**
     * Regresa la descripción de la baguette.
     * @return regresa la descripción de la baguette.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Regresa el costo de la baguette con pan integral. 
     * @return el costo de la baguette con pan integral.
     */
    public int getCosto() {
        return costo;
    }
}
