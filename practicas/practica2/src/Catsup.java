public class Catsup extends Ingrediente{
	Baguette baguette;

	public Catsup(Baguette baguette){
		this.baguette = baguette;
	}

	@Override
	public String getDescripcion(){
		return baguette.getDescripcion() + "Catsup \n";
	}

	@Override
	public int getCosto(){
		return baguette.getCosto() + 3;
	}
}