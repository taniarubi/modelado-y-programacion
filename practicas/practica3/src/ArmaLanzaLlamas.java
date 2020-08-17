public class ArmaLanzaLlamas implements Arma{
	
	String tipo = "";
	int costo = 3500;//Cambiar
	int ataque = 65;//Cambiar

	@Override
	public void crearArma(){
		tipo = "Arma Lanzallamas";
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