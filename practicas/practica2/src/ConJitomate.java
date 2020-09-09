/**
 * Clase para una baguette con jitomate. 
 */
public class ConJitomate extends Baguette {
    /* La baguette en uso. */
    Baguette baguette;

    /**
     * Construye una baguette con jitomate.
     * @param baguette la baguette en uso.
     */
    public ConJitomate(Baguette baguette) {
	this.baguette = baguette;
    }
	
    /**
     * Regresa la descripción de la baguette con jitomate.
     * @return la descripción de la baguette con jitomate.
     */
    @Override
    public String getDescripcion() {
	return baguette.getDescripcion() + "Jitomate $10 \n";
    }
	
    /**
     * Regresa el costo de la baguette con jitomate.
     * @return el costo de la baguette con jitomate.
     */
    @Override
    public int getCosto() {
	return baguette.getCosto() + 10;
    }
}
