/**
 * Interfaz para las armas. 
 */
public interface Arma {
	/* Crea un arma con tipo, costo y ataque. */
	public void crearArma();

	/**
	 * Regresa el tipo de arma. 
	 * @return el tipo de arma.
	 */
	public String getTipo();

	/**
	 * Regresa el costo del arma.
	 * @return el costo del arma.
	 */
	public int getCosto();

	/**
	 * Regresa el ataque del arma. 
	 * @return el ataque del arma.
	 */
	public int getAtaque();
}
