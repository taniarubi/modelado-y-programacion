/**
 * Interfaz para la carrocería.
 */
public interface Carroceria {
	/* Crea una carrocería con tipo y costo. */
	public void crearCarroceria();

	/**
	 * Regresa el tipo de carrocería.
	 * @return el tipo de carrocería.
	 */
	public String getTipo();

	/**
	 * Regresa el costo de la carrocería.
	 * @return el costo de la carrocería.
	 */
	public int getCosto();
}
