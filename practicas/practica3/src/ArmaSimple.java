public class ArmaSimple implements Arma{
	
	String tipo = "";
	int costo = 0;
	int ataque = 0;

	@Override
	public void crearArma(){
		tipo = "Arma Simple";
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
	public int getAtaque(){
		return ataque;
	}

}