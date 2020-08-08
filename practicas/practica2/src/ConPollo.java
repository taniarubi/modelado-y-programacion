/**
 * Clase para una baguette con pollo.
 */
public class ConPollo extends Baguette {
	/* La baguette en uso. */
	Baguette baguette;

	/**
	 * Construye una baguette con pollo.
	 * @param baguette la baguette en uso.
	 */
	public ConPollo(Baguette baguette) {
		this.baguette = baguette;
	}

	/**
	 * Regresa la descripción de la baguette con pollo.
	 * @return la descripción de la baguette con pollo.
	 */
	@Override
	public String getDescripcion() {
		return baguette.getDescripcion() + "Pollo $20 \n";
	}

	/**
	 * Regresa el costo de la baguette con pollo.
	 * @return regresa el costo de la baguette con pollo.
	 */
	@Override
	public int getCosto() {
		return baguette.getCosto() + 20;
	}
}
