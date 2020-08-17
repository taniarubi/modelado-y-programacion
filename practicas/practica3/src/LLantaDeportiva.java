public class LLantaDeportiva implements LLanta{
	
	String tipo = "";
	int costo = 15000;

	@Override
	public void crearLLanta(){
		tipo = "LLanta deportiva";
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