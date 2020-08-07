public class Mayonesa extends Ingrediente{
	Baguette baguette;

	public Mayonesa(Baguette baguette){
		this.baguette = baguette;
	}

	@Override
	public String getDescripcion(){
		return baguette.getDescripcion() + "Mayonesa \n";
	}

	@Override
	public int getCosto(){
		return baguette.getCosto() + 2;
	}
}