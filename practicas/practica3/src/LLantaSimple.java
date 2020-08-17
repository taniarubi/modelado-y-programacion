public class LLantaSimple implements LLanta{
	
	String tipo = "";
	int costo = 10000;

	@Override
	public void crearLLanta(){
		tipo = "LLanta Simple";
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