public class PanIntegral extends Ingrediente{
	Baguette baguette;

	public PanIntegral(Baguette baguette){
		this.baguette = baguette;
	}

	@Override
	public String getDescripcion(){
		return baguette.getDescripcion() + "Pan Integral \n";
	}

	@Override
	public int getCosto(){
		return baguette.getCosto() + 8;
	}
}