/**
 * Clase para una baguette con lechuga. 
 */
public class ConLechuga extends Baguette {
	/* La baguette en uso. */
	Baguette baguette;

	/**
	 * Construye una baguette con lechuga. 
	 * @param baguette la baguette en uso.
	 */
	public ConLechuga(Baguette baguette) {
		this.baguette = baguette;
	}

	/**
	 * Regresa la descripción de la baguette con lechuga.
	 * @return la descripción de la baguette con lechuga.
	 */
	@Override
	public String getDescripcion() {
		return baguette.getDescripcion() + "Lechuga $10 \n";
	}

	/**
	 * Regresa el costo de la baguette con lechuga.
	 * @return el costo de la baguette con lechuga.
	 */
	@Override
	public int getCosto() {
		return baguette.getCosto() + 10;
	}
}
