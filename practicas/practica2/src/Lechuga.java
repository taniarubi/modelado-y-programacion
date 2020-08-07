public class Lechuga extends Ingrediente{
	Baguette baguette;

	public Lechuga(Baguette baguette){
		this.baguette = baguette;
	}

	@Override
	public String getDescripcion(){
		return baguette.getDescripcion() + "Lechuga \n";
	}

	@Override
	public int getCosto(){
		return baguette.getCosto() + 5;
	}
}