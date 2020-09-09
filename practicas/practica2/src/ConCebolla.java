/**
 * Clase para una baguette con cebolla.
 */
public class ConCebolla extends Baguette {
    /* La baguette en eso. */
    Baguette baguette;
	
    /**
     * Construye una baguette con cebolla. 
     * @param baguette la baguette en uso.
     */
    public ConCebolla(Baguette baguette) {
        this.baguette = baguette;
    }

    /**
     * Regresa la descripción de la baguette con cebolla.
     * @return la descripción de la baguette con cebolla.
     */
    @Override
    public String getDescripcion() {
	return baguette.getDescripcion() + "Cebolla $10 \n";
    }

    /**
     * Regresa el costo de la baguette con cebolla.
     * @return el costo de la baguette con cebolla.
     */
    @Override
    public int getCosto() {
	return baguette.getCosto() + 10;
    }
}
	
