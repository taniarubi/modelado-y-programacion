/**
 * Clase para el blindaje de tanque. 
 */
public class BlindajeDeTanque implements Blindaje {
	/* El tipo de blindaje. */
	private String tipo;
	/* El costo del blindaje. */
	private int costo;
	/* La defensa del blindaje. */
	private int defensa;

	/* Crea un blindaje con tipo, costo y defensa. */
	@Override
	public void crearBlindaje() {
		this.tipo = "Blindaje Tanque";
		this.costo = 36500;
		this.defensa = 95;
	}

	/**
	 * Regresa el tipo de blindaje.
	 * @return el tipo de blindaje. 
	 */
	@Override
	public String getTipo() {
		return tipo;
	}

	/**
	 * Regresa el costo del blindaje. 
	 * @return el costo del blindaje.
	 */
	@Override
	public int getCosto() {
		return costo;
	}

	/**
	 * Regresa la defensa del blindaje. 
	 * @return la defensa del blindaje. 
	 */
	@Override
	public int getDefensa() {
		return defensa;
	}
}
