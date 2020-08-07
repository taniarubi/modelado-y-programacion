public class Mostaza extends Ingrediente{
	Baguette baguette;

	public Mostaza(Baguette baguette){
		this.baguette = baguette;
	}

	@Override
	public String getDescripcion(){
		return baguette.getDescripcion() + "Mostaza \n";
	}

	@Override
	public int getCosto(){
		return baguette.getCosto() + 2;
	}
}