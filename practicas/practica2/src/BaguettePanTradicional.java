/**
 * Clase para una Baguette con pan tradicional (hecho con harina blanca de 
 * trigo). 
 */
public class BaguettePanTradicional extends Baguette {
	/* La descripción de la Baguette. */
	private String descripcion; 
	/* El costo del pan tradicional. */
	private int costo;

	/* Construye una baguette con pan tradicional. */
	public BaguettePanTradicional() {
		this.descripcion = "Pan tradicional $5 \n";
		this.costo = 5;
	}

	/**
	 * Regresa la descripción de la Baguette con pan tradicional.
	 * @return la descripción de la Baguette con pan tradicional.
	 */
	@Override
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Regresa el costo de la baguette con pan tradicional.
	 * @return el costo de la Baguette con pan tradicional.
	 */
	@Override
	public int getCosto() {
		return costo;
	}
}
