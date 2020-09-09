/**
 * Clase para una baguette con pepperoni.
 */
public class ConPepperoni extends Baguette {
    /* La baguette en uso. */
    Baguette baguette;

    /**
     * Construye una baguette con pepperoni.
     * @param baguette la baguette en uso.
     */
    public ConPepperoni(Baguette baguette) {
	this.baguette = baguette;
    }

    /**
     * Regresa la descripción de la baguette con pepperoni.
     * @return la descripción de la baguette con pepperoni.
     */
    @Override
    public String getDescripcion() {
	return baguette.getDescripcion() + "Pepperoni $25 \n";
    }

    /**
     * Regresa el costo de la baguette con pepperoni.
     * @return el costo de la baguette con pepperoni.
     */
    @Override
    public int getCosto() {
	return baguette.getCosto() + 25;
    }
}
