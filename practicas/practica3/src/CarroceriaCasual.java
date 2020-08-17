/**
 * Clase para las carrocerías casuales.
 */
public class CarroceriaCasual implements Carroceria {
	/* El tipo de carrocería. */
	private String tipo;
	private int costo;

	/* Crea una carrocería con tipo y costo. */
	@Override
	public void crearCarroceria(){
		this.tipo = "Carrocería Casual";
		this.costo = 35000;
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
	 * Regresa el costo de carrocería.
	 * @return el costo de carrocería.
	 */
	@Override
	public int getCosto() {
		return costo;
	}
}
