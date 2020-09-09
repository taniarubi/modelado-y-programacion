/**
 * Clase para una baguette con mayonesa.
 */
public class ConMayonesa extends Baguette {
    /* La baguette en uso. */
    Baguette baguette;
	
    /**
     * Construye una baguette con mayonesa. 
     * @param baguette la baguette en uso.
     */
    public ConMayonesa(Baguette baguette) {
	this.baguette = baguette;
    }

    /**
     * Regresa la descripción de la baguette con mayonesa. 
     * @return la descripción de la baguette con mayonesa.
     */
    @Override
    public String getDescripcion() {
	return baguette.getDescripcion() + "Mayonesa $10 \n";
    }
	
    /**
     * Regresa el costo de la baguette con mayonesa. 
     * @return el costo de la baguette con mayonesa.
     */
    @Override
    public int getCosto() {
	return baguette.getCosto() + 10;
    }
}
