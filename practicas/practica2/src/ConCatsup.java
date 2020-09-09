/**
 * Clase para una baguette con catsup.
 */
public class ConCatsup extends Baguette {
    /* La baguette en uso. */
    Baguette baguette;
	
    /**
     * Construye una baguette con catsup.
     * @param baguette la baguette en uso.
     */
    public ConCatsup(Baguette baguette) {
        this.baguette = baguette;
    }

    /**
     * Regresa la descripción de la Baguette con catsup.
     * @return la descripción de la Baguette con catsup.
     */
    @Override
    public String getDescripcion() {
        return baguette.getDescripcion() + "Catsup $10 \n";
    }
	
    /**
     * Regresa el costo de la Baguette con catsup.
     * @return el costo de la Baguette con catsup.
     */
    @Override
    public int getCosto() {
	return baguette.getCosto() + 10;
    }
}
