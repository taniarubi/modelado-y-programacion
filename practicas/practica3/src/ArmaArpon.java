/**
 * Clase para el arma arpón.
 */
public class ArmaArpon implements Arma {
	/* El tipo de arma. */
	private String tipo;
	/* El costo del arma. */
	private int costo;
	/* El ataque del arma. */
	private int ataque;

	/* Crea un arma con tipo, costo y ataque. */
	@Override
	public void crearArma() {
		this.tipo = "Arma Arpones";
		this.costo = 2500;
		this.ataque = 35;
	}

	/**
	 * Regresa el tipo de arma. 
	 * @return el tipo de arma.
	 */
	@Override
	public String getTipo() {
		return tipo;
	}

	/**
	 * Regresa el costo del arma.
	 * @return el costo del arma.
	 */
	@Override
	public int getCosto() {
		return costo;
	}

	/**
	 * Regresa el ataque del arma. 
	 * @return el ataque del arma.
	 */
	@Override
	public int getAtaque() {
		return ataque;
	}	
}
