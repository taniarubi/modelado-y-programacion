/**
 * Clase para las llantas Oruga de Tanque.
 */
public class LLantaOruga implements LLanta {
	/* El tipo de llanta. */
	String tipo;
	/* El costo de la llanta. */
	int costo;

	/* Crea una llanta con tipo y costo. */
	@Override
	public void crearLLanta() {
		this.tipo = "Llanta Oruga de Tanque";
		this.costo = 2500;
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
