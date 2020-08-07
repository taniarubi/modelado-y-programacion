public class PanAvena extends Ingrediente{
	Baguette baguette;

	public PanAvena(Baguette baguette){
		this.baguette = baguette;
	}

	@Override
	public String getDescripcion(){
		return baguette.getDescripcion() + "Pan de Avena \n";
	}

	@Override
	public int getCosto(){
		return baguette.getCosto() + 9;
	}
}