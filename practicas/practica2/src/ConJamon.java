/**
 * Clase para una baguette con jamón.
 */
public class ConJamon extends Baguette {
    /* La baguette en uso. */
    Baguette baguette;
	
    /**
     * Construye una baguette con jamón.
     * @param baguette la baguette en uso.
     */
    public ConJamon(Baguette baguette) {
	this.baguette = baguette;
    }

    /**
     * Regresa la descripción de la baguette con jamón.
     * @return la descripción de la baguette con jamón.
     */
    @Override
    public String getDescripcion() {
        return baguette.getDescripcion() + "Jamón $15 \n";
    }
	
    /**
     * Regresa el costo de la baguette con jamón. 
     * @return el costo de la baguette con jamón.
     */
    @Override
    public int getCosto() {
        return baguette.getCosto() + 15;
    }
}
