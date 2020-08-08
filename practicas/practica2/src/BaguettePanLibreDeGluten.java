/**
 * Clase para una Baguette con pan libre de glúten (hecho con harina de avena).
 */
public class BaguettePanLibreDeGluten extends Baguette {
    /* La descripción de la Baguette. */
    private String descripcion;
    /* El costo del pan libre de glúten. */
    private int costo; 

    /**
     * Construye una baguette con pan libre de glúten.
     */
    public BaguettePanLibreDeGluten() {
        this.descripcion = "Pan libre de glúten $10 \n";
        this.costo = 10;
    }

    /**
     * Regresa la descripción de la baguette con pan libre de glúten.
     * @return la descripción de la baguette con pan libre de glúten.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Regresa el costo de la baguette con pan libre de glúten.
     * @return el costo de la baguette con pan libre de glúten.
     */
    public int getCosto() {
        return costo;
    }
}
