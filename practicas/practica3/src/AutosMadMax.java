import java.util.Scanner;

public class AutosMadMax{

	FactoryProducer fabrica = new FactoryProducer();
		
	AbstractFactory fabricaLLantas = fabrica.getFactory("LLANTA");
	AbstractFactory fabricaMotores = fabrica.getFactory("MOTOR");
	AbstractFactory fabricaCarrocerias = fabrica.getFactory("CARROCERIA");
	AbstractFactory fabricaBlindaje = fabrica.getFactory("BLINDAJE");
	AbstractFactory fabricaArmas = fabrica.getFactory("ARMA");

	public void menu(){
		System.out.println("\n***Bienvenido al menu de autos pre-fabricados***\n");
		System.out.println("1. Auto Simple: \n" + 
			"Llanta simple\n" + "Motor simple\n" + 
			"Carroceria casual\n" + "Blindaje casual \n" + "Arma sierra\n");

		System.out.println("2. Auto Deportivo: \n" + 
			"Llanta deportiva\n" + "Motor deportivo\n" + 
			"Carroceria deportiva\n" + "Blindaje simple \n" + "Arma Lanzallamas\n");

		System.out.println("3. Auto Tanque: \n" + 
			"Llanta Oruga de tanque\n" + "Motor diesel\n" + 
			"Carroceria camion\n" + "Blindaje tanque \n" + "Arma metralleta\n");
		System.out.println("************************************************");
		System.out.println("Por favor, escoge:\n");
	}

	public void autosPreDeterminados(double montoTotal){
		menu();
		try{
			int opc01 = (new Scanner(System.in)).nextInt();
			if(opc01 == 1){
				Auto autoNuevo = autoSimple();
				autoNuevo.muestraAuto();	

				montoTotal = montoTotal - autoNuevo.getCostoAuto();
				System.out.println("Tu saldo final es:\n"+montoTotal);
			}
			if(opc01 == 2){
				Auto autoNuevo = autoDeportivo();
				autoNuevo.muestraAuto();				
			
				montoTotal = montoTotal - autoNuevo.getCostoAuto();
				System.out.println("Tu saldo final es:\n"+montoTotal);
			}
			if (opc01==3) {
				Auto autoNuevo = autoTanque();
				autoNuevo.muestraAuto();

				montoTotal = montoTotal - autoNuevo.getCostoAuto();
				System.out.println("Tu saldo final es:\n"+montoTotal);
			}
		}catch(Exception e) {
			System.out.println("***Ha ocurrido un error de entrada:***\n"+e+"\nDebes ingresar un valor entero válido! >:c");
		}
	}

	public Auto autoSimple(){

		LLanta llantasNuevas = (LLanta)fabricaLLantas.getComponente("simple");
		llantasNuevas.crearLLanta();

		Motor motorNuevo = (Motor)fabricaMotores.getComponente("simple");
		motorNuevo.crearMotor();

		Carroceria carroceriaNueva = (Carroceria)fabricaCarrocerias.getComponente("casual");
		carroceriaNueva.crearCarroceria();

		Blindaje blindajeNuevo = (Blindaje)fabricaBlindaje.getComponente("simple");
		blindajeNuevo.crearBlindaje();

		Arma armaNueva = (Arma)fabricaArmas.getComponente("sierra");
		armaNueva.crearArma();
		return new Auto(llantasNuevas, motorNuevo, carroceriaNueva, blindajeNuevo, armaNueva);

	}

	public Auto autoDeportivo(){
		LLanta llantasNuevas = (LLanta)fabricaLLantas.getComponente("deportiva");
		llantasNuevas.crearLLanta();

		Motor motorNuevo = (Motor)fabricaMotores.getComponente("deportivo");
		motorNuevo.crearMotor();

		Carroceria carroceriaNueva = (Carroceria)fabricaCarrocerias.getComponente("deportiva");
		carroceriaNueva.crearCarroceria();

		Blindaje blindajeNuevo = (Blindaje)fabricaBlindaje.getComponente("simple");
		blindajeNuevo.crearBlindaje();

		Arma armaNueva = (Arma)fabricaArmas.getComponente("lanza llamas");
		armaNueva.crearArma();
		return new Auto(llantasNuevas, motorNuevo, carroceriaNueva, blindajeNuevo, armaNueva);
	}

	public Auto autoTanque(){
		LLanta llantasNuevas = (LLanta)fabricaLLantas.getComponente("oruga");
		llantasNuevas.crearLLanta();

		Motor motorNuevo = (Motor)fabricaMotores.getComponente("diesel");
		motorNuevo.crearMotor();

		Carroceria carroceriaNueva = (Carroceria)fabricaCarrocerias.getComponente("camion");
		carroceriaNueva.crearCarroceria();

		Blindaje blindajeNuevo = (Blindaje)fabricaBlindaje.getComponente("tanque");
		blindajeNuevo.crearBlindaje();

		Arma armaNueva = (Arma)fabricaArmas.getComponente("metralleta");
		armaNueva.crearArma();
		return new Auto(llantasNuevas, motorNuevo, carroceriaNueva, blindajeNuevo, armaNueva);
	}
}