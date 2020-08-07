public class Jamon extends Ingrediente{
	Baguette baguette;

	public Jamon(Baguette baguette){
		this.baguette = baguette;
	}

	@Override
	public String getDescripcion(){
		return baguette.getDescripcion() + "Jamon \n";
	}

	@Override
	public int getCosto(){
		return baguette.getCosto() + 11;
	}
}