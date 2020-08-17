public class LLantaOruga implements LLanta{
	
	String tipo = "";
	int costo = 25000;

	@Override
	public void crearLLanta(){
		tipo = "LLanta Oruga de Tanque";
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