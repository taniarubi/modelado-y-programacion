public class ArmaArpon implements Arma{
	
	String tipo = "";
	int costo = 1500;//Cambiar
	int ataque = 30;//Cambiar

	@Override
	public void crearArma(){
		tipo = "Arma Arpones";
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

