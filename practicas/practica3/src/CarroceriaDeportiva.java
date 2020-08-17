public class CarroceriaDeportiva implements Carroceria{
	
	String tipo = "";
	int costo = 55000;

	@Override
	public void crearCarroceria(){
		tipo = "Carroceria Deportiva";
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