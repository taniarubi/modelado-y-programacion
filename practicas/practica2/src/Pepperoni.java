public class Pepperoni extends Ingrediente{
	Baguette baguette;

	public Pepperoni(Baguette baguette){
		this.baguette = baguette;
	}

	@Override
	public String getDescripcion(){
		return baguette.getDescripcion() + "Pepperoni \n";
	}

	@Override
	public int getCosto(){
		return baguette.getCosto() + 17;
	}
}