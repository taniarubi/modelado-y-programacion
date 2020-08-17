public class Auto{

	LLanta llanta;
	Motor motor;
	Carroceria carroceria;
	Blindaje blindaje;
	Arma arma;
	int costo;

	public Auto(LLanta llanta, Motor motor, Carroceria carroceria, Blindaje blindaje, Arma arma){
		this.llanta = llanta;
		this.motor = motor;
		this.carroceria = carroceria;
		this.blindaje = blindaje;
		this.arma = arma;
	}

	public int getCostoAuto(){
		costo = llanta.getCosto() + motor.getCosto() + carroceria.getCosto() + blindaje.getCosto() + arma.getCosto();
		return costo;
	}


	public void muestraAuto(){
		System.out.println("**El auto construido es el siguiente:** \n" +
							llanta.getTipo() + "\n" +
							motor.getTipo() + "\n" +
							carroceria.getTipo() + "\n" +
							blindaje.getTipo() + "\n" +
							arma.getTipo() + "\n");

		System.out.println("**Con las siguientes caracteristicas: **\n" +
							"Ataque: " + arma.getAtaque() + "\n" +
							"Defensa: " + blindaje.getDefensa() + "\n" +
							"Velocidad: " + motor.getVelocidad() + "km/h \n" +
							"Costo: $" + getCostoAuto());
			}
}