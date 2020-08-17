public class BlindajeSimple implements Blindaje{
	
	String tipo = "";
	int costo = 20000;
	int defensa = 50;

	@Override
	public void crearBlindaje(){
		tipo = "Blindaje Simple";
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