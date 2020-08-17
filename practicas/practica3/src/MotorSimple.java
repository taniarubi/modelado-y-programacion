public class MotorSimple implements Motor{
	
	String tipo = "";
	int costo = 30000;
	int velocidad = 120;

	@Override
	public void crearMotor(){
		tipo = "Motor Simple";
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
	public int getVelocidad(){
		return velocidad;
	}
}