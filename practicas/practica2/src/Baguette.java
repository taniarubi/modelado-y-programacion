/**
 * Clase abstracta para el producto Baguette.
 */
public abstract class Baguette implements Producto {
	/* La descripción de la Baguette. */
	private String descripcion;
	/* El costo total de la Baguette. */
	private int costo;

	/**
	 * Regresa la descripción de la baguette.
	 * @return la descripción de la baguette.
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Regresa el costo total de la baguette.
	 * @return el costo total de la baguette. 
	 */
	public abstract int getCosto();
}
