public class MotorDeportivo implements Motor{
	
	String tipo = "";
	int costo = 50000;
	int velocidad = 200;

	@Override
	public void crearMotor(){
		tipo = "Motor Deportivo";
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