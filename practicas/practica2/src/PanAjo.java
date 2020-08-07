public class PanAjo extends Ingrediente{
	Baguette baguette;

	public PanAjo(Baguette baguette){
		this.baguette = baguette;
	}

	@Override
	public String getDescripcion(){
		return baguette.getDescripcion() + "Pan de Ajo \n";
	}

	@Override
	public int getCosto(){
		return baguette.getCosto() + 10;
	}
}