//Armas: arpones, lanzallamas, lanzas, sierra, metralleta
public class ArmaMetralleta implements Arma{
	
	String tipo = "";
	int costo = 5000;//Cambiar
	int ataque = 100;//Cambiar

	@Override
	public void crearArma(){
		tipo = "Arma Metralleta";
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