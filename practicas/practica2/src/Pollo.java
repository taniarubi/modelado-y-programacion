public class Pollo extends Ingrediente{
	Baguette baguette;

	public Pollo(Baguette baguette){
		this.baguette = baguette;
	}

	@Override
	public String getDescripcion(){
		return baguette.getDescripcion() + "Pollo \n";
	}

	@Override
	public int getCosto(){
		return baguette.getCosto() + 15;
	}
}