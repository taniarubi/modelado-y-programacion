import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		//Se crean las 5 pizzas fijas
		Pizza pizzaCheddarSalchicha = new Pizza("Pizza de Queso Cheddar con Salchicha", "Masa Delgada", "Queso Cheddar", "Salchicha", 155);
		Producto pizzaCheddarSalchichaAdaptada = new PizzaAdapter(pizzaCheddarSalchicha);

		Pizza pizzaCheddarJamon = new Pizza("Pizza de Queso Cheddar con Jamon", "Masa Gruesa", "Queso Cheddar", "Jamon", 140);
		Producto pizzaCheddarJamonAdaptada = new PizzaAdapter(pizzaCheddarJamon);

		Pizza pizzaCheddarPollo = new Pizza("Pizza de Queso Cheddar con Pollo", "Masa Gruesa", "Queso Cheddar", "Pollo", 165);
		Producto pizzaCheddarPolloAdaptada = new PizzaAdapter(pizzaCheddarPollo);

		Pizza pizzaManchegoSalchicha = new Pizza("Pizza de Queso Manchego con Salchicha", "Masa Gruesa", "Queso Manchego", "Salchicha", 160);
		Producto pizzaManchegoSalchichaAdaptada = new PizzaAdapter(pizzaManchegoSalchicha);

		Pizza pizzaManchegoPollo = new Pizza("Pizza de Queso Manchego con Pollo", "Masa delgada", "Queso Manchego", "Pollo", 150);
		Producto pizzaManchegoPolloAdaptada = new PizzaAdapter(pizzaManchegoPollo);

		// Se crea una Baguette "Base"
		Baguette baguette = new BaguetteBasica();


		System.out.println("¡Bienvenido a WaySub!\n"
							+ "A continuación elija el número del Producto que desea ordenar:\n" 
							+ "1 -> Pizza\n"
							+ "2 -> Baguette");

		try {
			Scanner respuesta01 = new Scanner(System.in);
			int opc01 = respuesta01.nextInt();

			while(opc01 > 2){
				System.out.println("1 Opción inválida.\nIntente nuevamente."); 
				System.out.println("A continuación elija el número del Producto que desea ordenar:\n" 
								+ "1 -> Pizza\n"
								+ "2 -> Baguette");				
				respuesta01 = new Scanner(System.in);
				opc01 = respuesta01.nextInt();	

			}

			while(opc01 == 1 || opc01 == 2){
				if(opc01 == 1){
					System.out.println("¿Qué tipo de pizza le gustaría Ordenar?\n"
										+ "Por favor elija el número de la Pizza que le gustaría Ordenar:\n"
										+ "1 -> Pizza de Queso Cheddar con Salchicha\n"
										+ "2 -> Pizza de Queso Cheddar con Jamon\n"
										+ "3 -> Pizza de Queso Cheddar con Pollo\n"
										+ "4 -> Pizza de Queso Manchego con Salchicha\n"
										+ "5 -> Pizza de Queso Manchego con Pollo");

					Scanner respuesta02 = new Scanner(System.in);
					int opc02 = respuesta02.nextInt();
					
					switch(opc02){
						case 1:
						System.out.println(pizzaCheddarSalchicha.getNombre() + "\n\n"
							+ pizzaCheddarSalchichaAdaptada.getDescripcion()
							+ "\n\nTotal: $" + pizzaCheddarSalchichaAdaptada.getCosto()
							+ "\n\n¡Gracias por su compra! \n\n ¡Vuelva Pronto!");
							System.exit(0);
						break;

						case 2:
						System.out.println(pizzaCheddarJamon.getNombre() + "\n\n"
							+ pizzaCheddarSalchichaAdaptada.getDescripcion()
							+ "\n\nTotal: $" + pizzaCheddarJamonAdaptada.getCosto()
							+ "\n\n¡Gracias por su compra! \n\n ¡Vuelva Pronto!");
							System.exit(0);
						break;

						case 3: 
						System.out.println(pizzaCheddarPollo.getNombre() + "\n\n"
							+ pizzaCheddarPolloAdaptada.getDescripcion()
							+ "\n\nTotal: $" + pizzaCheddarPolloAdaptada.getCosto()
							+ "\n\n¡Gracias por su compra! \n\n ¡Vuelva Pronto!");
							System.exit(0);
						break;

						case 4:
						System.out.println(pizzaManchegoSalchicha.getNombre() + "\n\n"
							+ pizzaManchegoSalchichaAdaptada.getDescripcion()
							+ "\n\nTotal: $" + pizzaManchegoSalchichaAdaptada.getCosto()
							+ "\n\n¡Gracias por su compra! \n\n ¡Vuelva Pronto!");
							System.exit(0);
						break;

						case 5:
						System.out.println(pizzaManchegoPollo.getNombre() + "\n\n"
							+ pizzaManchegoPolloAdaptada.getDescripcion()
							+ "\n\nTotal: $" + pizzaManchegoPolloAdaptada.getCosto()
							+ "\n\n¡Gracias por su compra! \n\n¡Vuelva Pronto!");
							System.exit(0);
						break;
					}
				} 
				if(opc01 == 2){
					System.out.println("¿Qué tipo de Pan le gustaría para su Baguette?\n"
										+ "Por favor elija el tipo de Pan:\n"
										+ "1 -> Pan de Ajo\n"
										+ "2 -> Pan de Avena\n"
										+ "3 -> Pan Integral\n");

					Scanner respuesta03 = new Scanner(System.in);
					int opc03 = respuesta03.nextInt();

					while(opc03 == 1 || opc03 == 2 || opc03 == 3){
						switch(opc03){
							case 1:
							baguette = new PanAjo(baguette);
							break;

							case 2:
							baguette = new PanAvena(baguette);
							break;

							case 3: 
							baguette = new PanIntegral(baguette);
							break;
						
						}
					//}

					//HASTA AQUÍ FUNCIONA BIEN SI ELIGEN UN TIPO DE PAN CORRECTO, SI NO ELIGEN UN TIPO CORRECTO SE CIERRA =( 

					System.out.println("Ahora puede elegir los ingredientes para su Baguette.\n"
										+ "Por favor elija los ingredientes:\n"
										+ "1 -> Mayonesa\n"
										+ "2 -> Catsup\n"
										+ "3 -> Mostaza\n"
										+ "4 -> Cebolla\n"
										+ "5 -> Jitomate\n"
										+ "6 -> Lechuga\n"
										+ "7 -> Jamón\n"
										+ "8 -> Pepperoni\n"
										+ "9 -> Pollo\n"
										+ "10 -> Terminar");

					Scanner respuesta04 = new Scanner(System.in);
					int opc04 = respuesta04.nextInt();

					while(opc04 == 1 || opc04 == 2 || opc04 == 3 || opc04 == 4 || opc04 == 5 || opc04 == 6 || opc04 == 7 || opc04 == 8 || opc04 == 9 || opc04 == 10){

						switch(opc04){ 
							case 1:
							baguette = new Mayonesa(baguette);
							break;

							case 2:
							baguette = new Catsup(baguette);
							break;

							case 3:
							baguette = new Mostaza(baguette);
							break;

							case 4:
							baguette = new Cebolla(baguette);
							break;

							case 5:
							baguette = new Jitomate(baguette);
							break;

							case 6:
							baguette = new Lechuga(baguette);
							break;

							case 7:
							baguette = new Jamon(baguette);
							break;

							case 8:
							baguette = new Pepperoni(baguette);
							break;

							case 9:
							baguette = new Pollo(baguette);
							break;

							case 10:
							System.out.println("\n\nSu Baguette:\n\n"
								+ baguette.getDescripcion()
								+ "\n\nTotal: $" + baguette.getCosto()
								+ "\n\n¡Gracias por su compra! \n\n¡Vuelva Pronto!"); //AQUÍ DEBERIA DEJAR DE AGREGAR INGREDIENTES PARA IMPRIMIR EL TICKET
								System.exit(0);
							break;
						}

						System.out.println("Ahora puede elegir los ingredientes para su Baguette.\n"
										+ "Por favor elija los ingredientes:\n"
										+ "1 -> Mayonesa\n"
										+ "2 -> Catsup\n"
										+ "3 -> Mostaza\n"
										+ "4 -> Cebolla\n"
										+ "5 -> Jitomate\n"
										+ "6 -> Lechuga\n"
										+ "7 -> Jamón\n"
										+ "8 -> Pepperoni\n"
										+ "9 -> Pollo\n"
										+ "10 -> Terminar");
						respuesta04 = new Scanner(System.in);
						opc04 = respuesta04.nextInt();
					}
				}
				
				}
			}

		}catch(Exception e) {
			System.out.println("***Ha ocurrido un error de entrada:***\n"+e+"\nDebes ingresar un valor entero válido! >:c");
		}

	}
}