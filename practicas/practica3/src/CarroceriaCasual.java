public class CarroceriaCasual implements Carroceria{
	
	String tipo = "";
	int costo = 35000;

	@Override
	public void crearCarroceria(){
		tipo = "Carroceria Casual";
	}

	@Override
	public String getTipo(){
		return tipo;
	}

	@Override
	public int getCosto(){
		return costo;
	}

}