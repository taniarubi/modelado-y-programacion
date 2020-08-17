public class BlindajeTanque implements Blindaje{
	
	String tipo = "";
	int costo = 36000;
	int defensa = 95;

	@Override
	public void crearBlindaje(){
		tipo = "Blindaje Tanque";
	}

	@Override
	public String getTipo(){
		return tipo;
	}

	@Override
	public int getCosto(){
		return costo;
	}

	@Override
	public int getDefensa(){
		return defensa;
	}

}