public abstract class Baguette implements Producto{

	String descripcion = "";
	int costo = 0;

	public String getDescripcion(){
		return descripcion;
	}

	public abstract int getCosto();
	
}