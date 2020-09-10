import java.util.Scanner;

/**
 * Clase principal. Se crearon tres métodos para generar autos predeterminados, 
 * además de un método principal que contiene todo el menú para la simulación.
 */
public class Main {
    static FactoryProducer fabrica = new FactoryProducer();
    static AbstractFactory fabricaLLantas = fabrica.getFactory("LLANTA");
    static AbstractFactory fabricaMotores = fabrica.getFactory("MOTOR");
    static AbstractFactory fabricaCarrocerias = fabrica.getFactory("CARROCERIA");
    static AbstractFactory fabricaBlindaje = fabrica.getFactory("BLINDAJE");
    static AbstractFactory fabricaArmas = fabrica.getFactory("ARMA");	

    /* Método que crea un auto predeterminado básico. */
    public static Auto autoSimple() {
        LLanta llantasNuevas = (LLanta)fabricaLLantas.getComponente("simple");
        llantasNuevas.crearLLanta();

        Motor motorNuevo = (Motor)fabricaMotores.getComponente("diesel");
        motorNuevo.crearMotor();

	Carroceria carroceriaNueva = 
	    (Carroceria)fabricaCarrocerias.getComponente("casual");
	carroceriaNueva.crearCarroceria();

	Blindaje blindajeNuevo = 
	    (Blindaje)fabricaBlindaje.getComponente("simple");
	blindajeNuevo.crearBlindaje();

	Arma armaNueva = (Arma)fabricaArmas.getComponente("sierra");
	armaNueva.crearArma();
	
	return new Auto(llantasNuevas, motorNuevo, carroceriaNueva, 
		        blindajeNuevo, armaNueva);
	}

	/* Método que crea un auto predeterminado deportivo. */
	public static Auto autoDeportivo() {
	    LLanta llantasNuevas = (LLanta)fabricaLLantas.getComponente("deportiva");
	    llantasNuevas.crearLLanta();

	    Motor motorNuevo = (Motor)fabricaMotores.getComponente("deportivo");
	    motorNuevo.crearMotor();

	    Carroceria carroceriaNueva = 
	        (Carroceria)fabricaCarrocerias.getComponente("deportiva");
	    carroceriaNueva.crearCarroceria();

	    Blindaje blindajeNuevo = 
		(Blindaje)fabricaBlindaje.getComponente("simple");
	    blindajeNuevo.crearBlindaje();

	    Arma armaNueva = (Arma)fabricaArmas.getComponente("lanza llamas");
	    armaNueva.crearArma();
	   
	    return new Auto(llantasNuevas, motorNuevo, carroceriaNueva, 
			    blindajeNuevo, armaNueva);
	}

	/* Método que crea un auto predeterminado tanque. */
	public static Auto autoTanque() {
	    LLanta llantasNuevas = (LLanta)fabricaLLantas.getComponente("oruga");
	    llantasNuevas.crearLLanta();

	    Motor motorNuevo = (Motor)fabricaMotores.getComponente("diesel");
	    motorNuevo.crearMotor();

	    Carroceria carroceriaNueva = 
		(Carroceria)fabricaCarrocerias.getComponente("camion");
	    carroceriaNueva.crearCarroceria();

	    Blindaje blindajeNuevo = 
		(Blindaje)fabricaBlindaje.getComponente("tanque");
	    blindajeNuevo.crearBlindaje();

	    Arma armaNueva = (Arma)fabricaArmas.getComponente("metralleta");
	    armaNueva.crearArma();
		
	    return new Auto(llantasNuevas, motorNuevo, carroceriaNueva, 
		            blindajeNuevo, armaNueva);
	}

	/* Método principal. */
	public static void main(String[] args) {
	    /* El monto total que tiene el usuario. */
	    double montoTotal = 2000000;	

	    System.out.println("¡Bienvenido! \n " + "Su monto inicial de dinero " + 
			       "para formar su auto es de " + montoTotal);
		
	    System.out.println("\nPor favor, indique qué opción desea realizar: \n" +
			       "1 -> Crear un nuevo auto \n" + 
			       "2 -> Obtener un auto pre-determinado.");

	    int respuesta = (new Scanner(System.in)).nextInt();
		
            switch(respuesta) {
                case 1:
		    /* Creamos las llantas. */
		    System.out.println("¿Qué tipo de llantas desea?\n" +
				       "1.Simple\n" + "2.Deportiva\n"+
				       "3.Offroad\n" + "4.Oruga\n");
				
		    String tipoLlanta;
		    int opcion = (new Scanner(System.in)).nextInt();

		    switch(opcion) {
		        case 1: 
			    tipoLlanta = "simple";
			    break;
			case 2:
			    tipoLlanta = "deportiva";
			    break;
			case 3:
			    tipoLlanta = "offroad";
			    break;
			case 4:
			    tipoLlanta = "oruga";
			    break;
			default:
			    tipoLlanta = "simple";
			    break;
		    }
			    
	            LLanta llantasNuevas = 
	                (LLanta)fabricaLLantas.getComponente(tipoLlanta);
		    llantasNuevas.crearLLanta();

		    /* Creamos el motor. */
		    System.out.println("¿Qué tipo de motor desea? \n" + 
				       "1 -> Deportivo\n"+ "2 -> Diesel\n" +
	                               "3 -> Turbo\n");
									   
		    String tipoMotor;
		    int opcion2 = (new Scanner(System.in)).nextInt();

		    switch(opcion2) {
		        case 1: 
			    tipoMotor = "deportivo";
			    break;
			case 2:
			    tipoMotor = "diesel";
			    break;
			case 3:
			    tipoMotor = "turbo";
			    break;
			default:
			    tipoMotor = "diesel";
			    break;
		    }
			    
                    Motor motorNuevo = 
		        (Motor)fabricaMotores.getComponente(tipoMotor);
		    motorNuevo.crearMotor();

		    /* Creamos la carrocería.  */
		    System.out.println("¿Qué tipo de carrocería desea?\n" +
					"1 -> Casual\n" + "2 -> De Camión\n" +
					"3 -> Deportiva\n");
									   
		    String tipoCarraceria;
		    int opcion3 = (new Scanner(System.in)).nextInt();
						
		    switch(opcion3) {
		        case 1: 
			    tipoCarraceria = "casual";
			    break;
			case 2:
			    tipoCarraceria = "camion";
			    break;
			case 3:
			    tipoCarraceria = "deportiva";
			    break;
			default:
			    tipoCarraceria = "casual";
			    break;
		    }
			    
                    Carroceria carroceriaNueva = 
		        (Carroceria)fabricaCarrocerias.getComponente(tipoCarraceria);
		    carroceriaNueva.crearCarroceria();

		    /* Creamos el blindaje. */
		    System.out.println("¿Qué tipo de blindaje deseea?\n" +
				       "1 -> Simple\n" + "2 -> Reforzado\n" + 
				       "3 -> Tanque\n");

		    String tipoBlindaje;
		    int opcion4 = (new Scanner(System.in)).nextInt();
					
		    switch(opcion4) {
		        case 1: 
			    tipoBlindaje = "simple";
			    break;
			case 2:
			    tipoBlindaje = "reforzado";
			    break;	
			case 3:
			    tipoBlindaje = "tanque";
			    break;
			default:
			    tipoBlindaje = "simple";
			    break; 
		    }

                    Blindaje blindajeNuevo = 
		        (Blindaje)fabricaBlindaje.getComponente(tipoBlindaje);
		    blindajeNuevo.crearBlindaje();

		    /* Creamos el arma. */
		    System.out.println("¿Qué tipo de arma deseea?\n" +
				       "1 -> Arpones\n" + "2 -> Lanza llamas\n" +
				       "3 -> Cañones\n" + "4 -> Sierra\n" + 
				       "5 -> Metralleta\n");
	
		    String tipoArma;
		    int opcion5 = (new Scanner(System.in)).nextInt();

		    switch(opcion5) {
		        case 1: 
			    tipoArma = "arpones";
			    break;
			case 2:
			    tipoArma = "lanza llamas";
			    break;
			case 3:
			    tipoArma = "cañones";
			    break;
			case 4:
			    tipoArma = "sierra";
			    break;
			case 5:
			    tipoArma = "metralleta";
			    break;
			default:
			    tipoArma = "arpones";
			    break;
		    }

                    Arma armaNueva =  
	                (Arma)fabricaArmas.getComponente(tipoArma);
		    armaNueva.crearArma();

		    /* Creamos el auto. */
		    Auto nuevoAuto = new Auto(llantasNuevas, motorNuevo, 
					      carroceriaNueva, blindajeNuevo, 
					      armaNueva);
		    nuevoAuto.muestraAuto();
		    montoTotal = montoTotal - nuevoAuto.getCostoAuto();
		    System.out.println("\nTu saldo, después de tu creación, es: $ " + 
				       montoTotal);
		    System.out.println("\nGracias por su compra!");
		    break;
		    
		case 2:
		    System.out.println("\nEstos son los autos predeterminados con " + 
				       "los que contamos:\n");
		    System.out.println("1. Auto Simple:\n" + "Llanta simple, motor " + 
				       "simple, carroceria casual, blindaje casual, " + 
				       "arma sierra\n");
		    System.out.println("2. Auto Deportivo:\n" + "Llanta deportiva, " + 
				       "motor deportivo, carroceria deportiva, " + 
				       "blindaje simple, arma Lanzallamas\n");
		    System.out.println("3. Auto Tanque:\n" + "Llanta Oruga de tanque, " + 
				       "motor diesel, carroceria camion, " + 
				       "blindaje tanque, arma metralleta\n");
		    System.out.println("\nSeleccione uno:\n");
		    int opcionx = (new Scanner(System.in)).nextInt();

		    switch(opcionx) {
		        case 1:
			    Auto autoNuevo = autoSimple();
			    autoNuevo.muestraAuto();	
		
			    montoTotal = montoTotal - autoNuevo.getCostoAuto();
			    System.out.println("\nTu saldo, después de tu creación, " + 
						   "es: $ " + montoTotal);
			    break;
			case 2:
			    Auto autoNuevo2 = autoDeportivo();
			    autoNuevo2.muestraAuto();				
					
			    montoTotal = montoTotal - autoNuevo2.getCostoAuto();
			    System.out.println("\nTu saldo, después de tu creación, " + 
					       "es: $ " + montoTotal);
			    break; 
			case 3:
			    Auto autoNuevo3 = autoTanque();
			    autoNuevo3.muestraAuto();
		
			    montoTotal = montoTotal - autoNuevo3.getCostoAuto();
			    System.out.println("\nTu saldo, después de tu creación, " + 
					       "es: $ " + montoTotal);
			    break;
			default:
			    Auto autoNuevo4 = autoSimple();
			    autoNuevo4.muestraAuto();	
		
			    montoTotal = montoTotal - autoNuevo4.getCostoAuto();
			    System.out.println("\nTu saldo, después de tu creación, " + 
					       "es: $ " + montoTotal);
			    break;
		    }
				
		    System.out.println("\nGracias por su compra!");
		    break;
		default:
		    System.out.println("Opción no válida. Intente de nuevo.");
		    break; 
	    }
	}
}
