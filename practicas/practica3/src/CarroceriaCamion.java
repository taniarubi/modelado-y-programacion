public class CarroceriaCamion implements Carroceria{
	
	String tipo = "";
	int costo = 45000;

	@Override
	public void crearCarroceria(){
		tipo = "Carroceria Camion";
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