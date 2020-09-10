/**
 * Clase para adaptar el producto Pizzza.
 */
public class PizzaAdapter implements Producto {
    /* La pizza que vamos a adaptar. */
    private Pizza pizza;

    /**
     * Construye una pizza adaptada. 
     * @param pizza la pizza que vamos a adaptar.
     */
    public PizzaAdapter(Pizza pizza) {
	this.pizza = pizza;
    }

    /**
     * Regresa la descripción de la pizza. 
     * @return la descripción de la pizza.
     */
    @Override
    public String getDescripcion() {
	return pizza.getTipoQueso() + "\n" + pizza.getTipoCarne() + "\n" + pizza.getTipoMasa() + "\n";
    }
	
    /**
     * Regresa el costo de la pizza.
     * @return el costo de la pizza.
     */
    @Override
    public int getCosto() {
	return pizza.getCosto();
    }
}
