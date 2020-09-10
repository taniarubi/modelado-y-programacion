/**
 * Clase para el producto Pizza.
 */
public class Pizza {
    /* El nombre de la pizza. */
    private String nombre;
    /* El tipo de queso para la pizza. */
    private String tipoQueso;
    /* El tipo de carne para la pizza. */
    private String tipoCarne;
    /* El tipo de masa para la pizza. */
    private String tipoMasa;
    /* El costo final de la pizza. */
    private int costo;

    /**
     * Construye una pizza personalizada. 
     * @param nombre el nombre de la pizza.
     * @param tipoMasa el tipo de masa de la pizza.
     * @param tipoQueso el tipo de queso de la pizza.
     * @param tipoCarne el tipo de carne de la pizza.
     * @param costo el costo de la pizza.
     */
    public Pizza(String nombre, String tipoQueso, String tipoCarne, String tipoMasa, int costo) {
	this.nombre = nombre;
	this.tipoQueso = tipoQueso;
	this.tipoCarne = tipoCarne; 
	this.tipoMasa = tipoMasa;
	this.costo = costo;
    }
	
    /**
     * Regresa el nombre de la pizza.
     * @return el nombre de la pizza.
     */
    public String getNombre() {
	return nombre;
    }
	
    /**
     * Regresa el tipo de queso de la pizza.
     * @return el tipo de queso de la pizza.
     */
    public String getTipoQueso() {
	return tipoQueso;
    }
	
    /**
     * Regresa el tipo de carne de la pizza.
     * @return el tipo de carne de la pizza. 
     */
    public String getTipoCarne() {
	return tipoCarne;
    }

    /**
     * Regresa el tipo de masa de la pizza.
     * @return el tipo de masa de la pizza.
     */
    public String getTipoMasa() {
	return tipoMasa;
    }

    /**
     * Regresa el costo de la pizza.
     * @return el costo de la pizza.
     */
    public int getCosto() {
	return costo;
    }
}
