public class MotorDiesel implements Motor{
	
	String tipo = "";
	int costo = 40000;
	int velocidad = 150;

	@Override
	public void crearMotor(){
		tipo = "Motor Diesel";
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