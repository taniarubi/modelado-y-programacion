/**
 * Clase para la carrocería de camión.
 */
public class CarroceriaDeCamion implements Carroceria {
	/* El tipo de carrocería. */	
	private String tipo;
	/* El costo de la carrocería. */
	private int costo;

	/* Crea una carrocería con tipo y costo. */
	@Override
	public void crearCarroceria() {
		this.tipo = "Carroceria De Camion";
		this.costo = 45000;
	}

	/**
	 * Regresa el tipo de carrocería.
	 * @return el tipo de carrocería.
	 */
	@Override
	public String getTipo() {
		return tipo;
	}

	/**
	 * Regresa el costo de la carrocería.
	 * @return el costo de la carrocería.
	 */
	@Override
	public int getCosto() {
		return costo;
	}
}
