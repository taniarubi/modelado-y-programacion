public class ArmaSierra implements Arma{
	
	String tipo = "";
	int costo = 2500;//Cambiar
	int ataque = 50;//Cambiar

	@Override
	public void crearArma(){
		tipo = "Arma Sierra";
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