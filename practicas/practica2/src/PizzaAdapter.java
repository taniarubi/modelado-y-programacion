public class PizzaAdapter implements Producto{
	
	public Pizza pizza;

	public PizzaAdapter(Pizza pizza){
		this.pizza = pizza;
	}

	@Override
	public String getDescripcion(){
		return pizza.getTipoMasa() + "\n" + pizza.getTipoQueso() + "\n" + pizza.getTipoCarne() + "\n";
	}

	@Override
	public int getCosto(){
		return pizza.getCosto();
	}
}