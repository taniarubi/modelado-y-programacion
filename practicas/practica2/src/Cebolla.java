public class Cebolla extends Ingrediente{
	Baguette baguette;

	public Cebolla(Baguette baguette){
		this.baguette = baguette;
	}

	@Override
	public String getDescripcion(){
		return baguette.getDescripcion() + "Cebolla  \n";
	}

	@Override
	public int getCosto(){
		return baguette.getCosto() + 4;
	}
}
	