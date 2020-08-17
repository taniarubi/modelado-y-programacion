/**
 * Clase para las llantas deportivas.
 */
public class LLantaDeportiva implements LLanta {
	/* El tipo de llanta. */
	private String tipo;
	/* El costo de la llanta. */
	private int costo;

	/* Crea una llanta con tipo y costo. */
	@Override
	public void crearLLanta() {
		this.tipo = "Llanta Deportiva";
		this.costo = 1500; 
	}

	/**
	 * Regresa el tipo de llanta. 
	 * @return el tipo de llanta.
	 */
	@Override
	public String getTipo() {
		return tipo;
	}

	/**
	 * Regresa el costo de la llanta. 
	 * @return el costo de la llanta.
	 */
	@Override
	public int getCosto() {
		return costo;
	}
}
