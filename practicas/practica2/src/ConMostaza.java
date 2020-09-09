/**
 * Clase para una baguette con mostaza.
 */
public class ConMostaza extends Baguette {
    /* La mostaza en uso. */
    Baguette baguette;
	
    /**
     * Construye una baguette con mostaza.
     * @param baguette la baguette en uso.
     */
    public ConMostaza(Baguette baguette) {
	this.baguette = baguette;
    }

    /**
     * Regresa la descripción de la baguette con mostaza. 
     * @return la descripción de la baguette con mostaza.
     */
    @Override
    public String getDescripcion() {
	return baguette.getDescripcion() + "Mostaza $10 \n";
    }

    /**
     * Regresa el costo de la baguette con mostaza. 
     * @return el costo de la baguette con mostaza.
     */
    @Override
    public int getCosto() {
	return baguette.getCosto() + 10;
    }
}
