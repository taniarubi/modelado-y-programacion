import java.util.Scanner;

public class Main{
	//Mensajes predefinidos de error.
	public static  String MENSAJE_ERROR_MENU_1 = "1 Opción inválida.\nIntente nuevamente."; 
	public static String MENSAJE_ERROR_ENTRADA1 = "***Ha ocurrido un error de entrada:***\n";
	public static String MENSAJE_ERROR_ENTRADA2 = "\nDebes ingresar un valor entero válido! >:c";

	/**
	Método principal, donde muestra los menús y crea los autos que el usuario pide.
	*/
	public static void main(String[] args) {
		double montoTotal = 200000; //Monto total que tiene el usuario al inicio.
		AutosMadMax predefinido = new AutosMadMax();

		FactoryProducer fabrica = new FactoryProducer();

		AbstractFactory fabricaLLantas = fabrica.getFactory("LLANTA");
		AbstractFactory fabricaMotores = fabrica.getFactory("MOTOR");
		AbstractFactory fabricaCarrocerias = fabrica.getFactory("CARROCERIA");
		AbstractFactory fabricaBlindaje = fabrica.getFactory("BLINDAJE");
		AbstractFactory fabricaArmas = fabrica.getFactory("ARMA");		

		System.out.println("¡Bienvenido!\nTienes para gastar a lo loco: "+montoTotal);
		mensajeMenuInicial();

		try {
			int opc01 = (new Scanner(System.in)).nextInt();

			while(opc01 > 2 || opc01 < 1){
				System.out.println(MENSAJE_ERROR_MENU_1); 
				mensajeMenuInicial();
				opc01 = (new Scanner(System.in)).nextInt();
			}
			if (opc01 == 1){
				
				LLanta llantasNuevas = (LLanta)fabricaLLantas.getComponente(opcionLlanta());
				llantasNuevas.crearLLanta();

				Motor motorNuevo = (Motor)fabricaMotores.getComponente(opcionMotor());
				motorNuevo.crearMotor();

				Carroceria carroceriaNueva = (Carroceria)fabricaCarrocerias.getComponente(opcionCarroceria());
				carroceriaNueva.crearCarroceria();

				Blindaje blindajeNuevo = (Blindaje)fabricaBlindaje.getComponente(opcionBlindaje());
				blindajeNuevo.crearBlindaje();

				Arma armaNueva = (Arma)fabricaArmas.getComponente(opcionArmas());
				armaNueva.crearArma();

				Auto nuevoAuto = new Auto(llantasNuevas, motorNuevo, carroceriaNueva, blindajeNuevo, armaNueva);
				nuevoAuto.muestraAuto();
				montoTotal = montoTotal - nuevoAuto.getCostoAuto();
				System.out.println("Tu saldo final es:\n**"+montoTotal+"**");
			}
			if (opc01 == 2) {
				predefinido.autosPreDeterminados(montoTotal);
				mensajeSalida();
			}
		}catch(Exception e) {
			System.out.println("***Ha ocurrido un error de entrada:***\n"+e+"\nDebes ingresar un valor entero válido! >:c");
		}
	}

/** ----------------------Métodos de mensajes al usuario.---------------------- */

	public static void mensajeMenuInicial(){
		System.out.println(
		"¿Que desea hacer?\n"+
		"1.Crear un nuevo auto\n"+
		"2.Obtener un auto pre-determinado:");
	}

	public static void mensajeSalida(){
		System.out.println("\n¡Gracias por su compra!\n" + "¡vuelva pronto!");
	}

	public static void mensajeBlindaje(){
		System.out.println("¿Que tipo de blindaje quiere?\n"+
			"1.Simple\n"+
			"2.Reforzado\n"+
			"3.Tanque\n");	
	}

	public static void mensajeCarroceria(){
		System.out.println("¿Que tipo de carroceria quiere?\n"+
			"1.Casual\n"+
			"2.Camion\n"+
			"3.Deportiva\n");
	}


	public static void mensajeLlanta(){
		System.out.println("¿Que tipo de llantas quiere?\n"+
			"1.Simple\n"+
			"2.Deportiva\n"+
			"3.Offroad\n"+
			"4.Oruga\n");
	}

	public static void mensajeMotor(){
		System.out.println("¿Que tipo de motor quiere?\n"+
			"1.Deportivo\n"+
			"2.Diesel\n"+
			"3.Simple\n");
	}

	public static void mensajeArmas(){
		System.out.println("¿Que tipo de arma quiere?\n"+
			"1.Arpones\n"+
			"2.Lanza llamas\n"+
			"3.Lanzas\n" +
			"4.Sierra\n" + 
			"5.Metralleta\n");
	}

/** ----------------------Métodos que simulan mini menús para no saturar tanto Main---------------------- */

	public static String opcionBlindaje(){
		mensajeBlindaje();
		String respuesta = "";
		try{
			int opc02 = (new Scanner(System.in)).nextInt();
			while(opc02 > 3){
				System.out.println(MENSAJE_ERROR_MENU_1); 
				mensajeBlindaje();
				opc02 = (new Scanner(System.in)).nextInt();
			}

			switch (opc02) {
				case 1: 
				respuesta = "simple";
				break;
				case 2:
				respuesta = "reforzado";
				break;	
				case 3:
				respuesta = "tanque";
				break;
			}
			
		}catch (Exception e) {
			System.out.println(MENSAJE_ERROR_ENTRADA1 +e+MENSAJE_ERROR_ENTRADA2);
			System.exit(0);
		}
		return respuesta;
	}

	public static String opcionCarroceria(){
		mensajeCarroceria();
		String respuesta = "";
		try{
			int opc02 = (new Scanner(System.in)).nextInt();
			while(opc02 > 3){
				System.out.println(MENSAJE_ERROR_MENU_1); 
				mensajeCarroceria();
				opc02 = (new Scanner(System.in)).nextInt();
			}
			switch (opc02) {
				case 1: 
				respuesta = "casual";
				break;
				case 2:
				respuesta = "camion";
				break;
				case 3:
				respuesta = "deportiva";
				break;
			}
		}catch (Exception e) {
			System.out.println(MENSAJE_ERROR_ENTRADA1 +e+MENSAJE_ERROR_ENTRADA2);
			System.exit(0);
		}
		return respuesta;
	}

	public static String opcionLlanta(){
		mensajeLlanta();
		String respuesta = "";
		try{
			int opc02 = (new Scanner(System.in)).nextInt();
			while(opc02 > 4){
				System.out.println(MENSAJE_ERROR_MENU_1); 
				mensajeLlanta();
				opc02 = (new Scanner(System.in)).nextInt();
			}
			switch (opc02) {
				case 1: 
				respuesta = "simple";
				break;
				case 2:
				respuesta = "deportiva";
				break;
				case 3:
				respuesta = "offroad";
				break;
				case 4:
				respuesta = "oruga";
				break;
			}
		}catch (Exception e) {
			System.out.println(MENSAJE_ERROR_ENTRADA1 +e+MENSAJE_ERROR_ENTRADA2);
			System.exit(0);
		}
		return respuesta;
	}
	
	public static String opcionMotor(){	
		mensajeMotor();
		String respuesta = "";
		try{
			int opc02 = (new Scanner(System.in)).nextInt();
			while(opc02 > 3){
				System.out.println(MENSAJE_ERROR_MENU_1); 
				mensajeMotor();
				opc02 = (new Scanner(System.in)).nextInt();
			}
			switch (opc02) {
				case 1: 
				respuesta = "deportivo";
				break;
				case 2:
				respuesta = "diesel";
				break;
				case 3:
				respuesta = "simple";
				break;
			}
		}catch (Exception e) {
			System.out.println(MENSAJE_ERROR_ENTRADA1 +e+MENSAJE_ERROR_ENTRADA2);
			System.exit(0);
		}
		return respuesta;
	}

	public static String opcionArmas(){
		mensajeArmas();
		String respuesta = "";
		try{
			int opc02 = (new Scanner(System.in)).nextInt();
			while(opc02 > 5){
				System.out.println(MENSAJE_ERROR_MENU_1); 
				mensajeBlindaje();
				opc02 = (new Scanner(System.in)).nextInt();
			}
			switch (opc02) {
				case 1: 
				respuesta = "arpones";
				break;
				case 2:
				respuesta = "lanza llamas";
				break;
				case 3:
				respuesta = "lanza";
				break;
				case 4:
				respuesta = "sierra";
				break;
				case 5:
				respuesta = "metralleta";
				break;
			}
		}catch (Exception e) {
			System.out.println(MENSAJE_ERROR_ENTRADA1 +e+MENSAJE_ERROR_ENTRADA2);
			System.exit(0);
		}
		return respuesta;
	}
}
