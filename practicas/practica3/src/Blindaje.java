/**
 * Interfaz para los blindajes.
 */
public interface Blindaje {
	/* Crea un blindaje con tipo, costo y defensa. */
	public void crearBlindaje();

	/**
	 * Regresa el tipo de blindaje.
	 * @return el tipo de blindaje.
	 */
	public String getTipo();

	/**
	 * Regresa el costo del blindaje.
	 * @return el costo del blindaje.
	 */
	public int getCosto();

	/**
	 * Regresa la defensa del blindaje.
	 * @return la defensa del blindaje.
	 */
	public int getDefensa();
}
