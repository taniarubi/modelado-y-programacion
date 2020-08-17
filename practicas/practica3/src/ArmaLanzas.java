public class ArmaLanzas implements Arma{
		
	String tipo = "";
	int costo = 1000;//Cambiar
	int ataque = 20;//Cambiar

	@Override
	public void crearArma(){
		tipo = "Arma Lanzas";
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