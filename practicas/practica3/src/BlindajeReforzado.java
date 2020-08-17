public class BlindajeReforzado implements Blindaje{
	
	String tipo = "";
	int costo = 28000;
	int defensa = 80;

	@Override
	public void crearBlindaje(){
		tipo = "Blindaje Reforzado";
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