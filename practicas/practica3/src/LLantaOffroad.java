public class LLantaOffroad implements LLanta{
	
	String tipo = "";
	int costo = 20000;

	@Override
	public void crearLLanta(){
		tipo = "LLanta Off-Road";
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