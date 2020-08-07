public class Pizza{

	String nombre;
	String tipoMasa;
	String tipoQueso;
	String tipoCarne;
	int costo;

	public Pizza(String nombre, String tipoMasa, String tipoQueso, String tipoCarne, int costo){
		this.nombre = nombre;
		this. tipoMasa = tipoMasa;
		this.tipoQueso = tipoQueso;
		this.tipoCarne = tipoCarne;
		this.costo = costo;

	}

	public String getNombre(){
		return nombre;
	}

	public String getTipoMasa(){
	return "- " + tipoMasa;
}

	public String getTipoQueso(){
		return "- " + tipoQueso;
	}

	public String getTipoCarne(){
		return "- " + tipoCarne;
	}

	public int getCosto(){
		return costo;
	}
}