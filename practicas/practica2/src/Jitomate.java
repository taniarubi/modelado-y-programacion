public class Jitomate extends Ingrediente{
	Baguette baguette;

	public Jitomate(Baguette baguette){
		this.baguette = baguette;
	}

	@Override
	public String getDescripcion(){
		return baguette.getDescripcion() + "Jitomate \n";
	}

	@Override
	public int getCosto(){
		return baguette.getCosto() + 6;
	}
}