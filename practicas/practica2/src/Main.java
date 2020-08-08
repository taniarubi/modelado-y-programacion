import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		/* La baguette. */
		Baguette baguette;
		/* Las pizzas del menú. */
		Pizza pizza1 = new Pizza("Pizza de Queso Chedar con Salchicha", 
								 "Queso Chedar", "Salchicha", "Masa gruesa", 
								 150);

		Producto pizza1adaptada = new PizzaAdapter(pizza1);

		Pizza pizza2 = new Pizza("Pizza de Queso Chedar con Jamón", 
								 "Queso Chedar", "Jamón", "Masa gruesa", 130);
								 
		Producto pizza2adaptada = new PizzaAdapter(pizza2);

		Pizza pizza3 = new Pizza("Pizza de Queso Chedar con Pollo", 
								 "Queso Chedar", "Pollo", "Masa delgada", 140);
								 
		Producto pizza3adaptada = new PizzaAdapter(pizza3);

		Pizza pizza4 = new Pizza("Pizza de Queso Manchego con Salchicha", 
								 "Queso Manchego", "Salchicha", "Masa delgada", 
								 120);

		Producto pizza4adaptada = new PizzaAdapter(pizza4);

		Pizza pizza5 = new Pizza("Pizza de Queso Manchego con Jamón", 
								 "Queso manchego", "Jamón", "Masa delgada", 110);
								 
		Producto pizza5adaptada = new PizzaAdapter(pizza5);

		System.out.println("¡Bienvenido a WaySub! \n" + "Indique el número del " + 
						   "producto que desea ordenar: \n" + "1 -> Baguette \n" + 
						   "2 -> Pizza");

		try {
			Scanner respuesta = new Scanner(System.in);
			int opcionProducto = respuesta.nextInt();

			switch(opcionProducto) {
				case 1:
					System.out.println("\nEscoja el tipo de pan para su " + 
					                   "baguette:\n" + "1 -> Pan Tradicional\n" + 
									   "2 -> Pan Integral\n" + 
									   "3 -> Pan libre de gluten\n");
					respuesta = new Scanner(System.in);
					int opcionPan = respuesta.nextInt();
					switch(opcionPan) {
						case 1: 
							baguette = new BaguettePanTradicional();
							System.out.println("Ingredientes: \n" + 
							                   baguette.getDescripcion() + "\n");
							System.out.println("Costo: $" + baguette.getCosto() + 
							                   "\n");
							break;
						case 2:
							baguette = new BaguettePanIntegral();
							System.out.println("Ingredientes: \n" + 
							                   baguette.getDescripcion() + "\n");
							System.out.println("Costo: $" + baguette.getCosto() + 
							                   "\n");
							break;
						case 3: 
							baguette = new BaguettePanLibreDeGluten();
							System.out.println("Ingredientes: \n" + 
							                   baguette.getDescripcion() + "\n");
							System.out.println("Costo: $" + baguette.getCosto() + 
							                   "\n");
							break; 
						default: 
							baguette = new BaguettePanTradicional();
							System.out.println("Ingredientes: \n" + 
							                   baguette.getDescripcion() + "\n");
							System.out.println("Costo: $" + baguette.getCosto() + 
							                   "\n");
					}

					int opcionIngrediente = 0; 

					do {
						System.out.println("Ahora puede elegir los ingredientes para " + 
									   "su Baguette.\n" + "Por favor, elija los " + 
									   "ingredientes:\n" + "1 -> Pollo\n" + 
									   "2 -> Pepperoni\n" + "3 -> Jamón\n" + 
									   "4 -> Lechuga\n" + "5 -> Jitomate\n" + 
									   "6 -> Cebolla\n" + "7 -> Mostaza\n" + 
									   "8 -> Catsup\n" + "9 -> Mayonesa\n" +
									   "10 -> Terminar de elegir ingredientes\n");

						respuesta = new Scanner(System.in);
						opcionIngrediente = respuesta.nextInt();

						switch(opcionIngrediente) {
							case 1: 
								baguette = new ConPollo(baguette);
								System.out.println("Ingredientes: \n" + 
							                   baguette.getDescripcion() + "\n");
								System.out.println("Costo: $" + 
								                   baguette.getCosto() + "\n");
								break; 
							case 2:
								baguette = new ConPepperoni(baguette);
								System.out.println("Ingredientes: \n" + 
							                   baguette.getDescripcion() + "\n");
								System.out.println("Costo: $" + 
								                   baguette.getCosto() + "\n");
								break; 
							case 3:
								baguette = new ConJamon(baguette);
								System.out.println("Ingredientes: \n" + 
							                   baguette.getDescripcion() + "\n");
								System.out.println("Costo: $" + 
								                   baguette.getCosto() + "\n");
								break; 
							case 4:
								baguette = new ConLechuga(baguette);
								System.out.println("Ingredientes: \n" + 
							                   baguette.getDescripcion() + "\n");
								System.out.println("Costo: $" + 
								                   baguette.getCosto() + "\n");
								break;
							case 5:
								baguette = new ConJitomate(baguette);
								System.out.println("Ingredientes: \n" + 
							                   baguette.getDescripcion() + "\n");
								System.out.println("Costo: $" + 
								                   baguette.getCosto() + "\n");
								break; 
							case 6:
								baguette = new ConCebolla(baguette);
								System.out.println("Ingredientes: \n" + 
							                   baguette.getDescripcion() + "\n");
								System.out.println("Costo: $" + 
								                   baguette.getCosto() + "\n");
								break;
							case 7: 
								baguette = new ConMostaza(baguette);
								System.out.println("Ingredientes: \n" + 
							                   baguette.getDescripcion() + "\n");
								System.out.println("Costo: $" + 
								                   baguette.getCosto() + "\n");
								break;
							case 8:
								baguette = new ConCatsup(baguette);
								System.out.println("Ingredientes: \n" + 
							                   baguette.getDescripcion() + "\n");
								System.out.println("Costo: $" + 
								                   baguette.getCosto() + "\n");
								break; 
							case 9:
								baguette = new ConMayonesa(baguette);
								System.out.println("Ingredientes: \n" + 
							                   baguette.getDescripcion() + "\n");
								System.out.println("Costo: $" + 
								                   baguette.getCosto() + "\n");
								break;
							case 10:
								opcionIngrediente = 150;
								break;
							default:
								System.out.println("Ingrediente inválido. Por " + 
												   "favor, intente de nuevo.");
								break; 
						}
					} while((opcionIngrediente >= 1) && (opcionIngrediente <= 10));

					System.out.println("\nUsted pagará $" + baguette.getCosto() + 
									   " por una baguette con los siguientes " + 
									   "ingredientes: \n" + 
									   baguette.getDescripcion());

					System.out.println("\nGracias por su compra. Bonito día c:");
					break;
				case 2:
					System.out.println("\n¿Cuál es la pizza que le gustaría " + 
									   "comprar?\n");
					System.out.println("1 -> Pizza Chedar-Salchicha \n" + 
									   "2 -> Pizza Chedar-Jamón\n" + 
									   "3 -> Pizza Chedar-Pollo\n" + 
									   "4 -> Pizza Manchego-Salchica\n" + 
									   "5 -> Pizza Manchego-Jamón\n");
					
					respuesta = new Scanner(System.in);
					int opcionPizza = respuesta.nextInt();

					switch(opcionPizza) {
						case 1:
							System.out.println("\nUsted pagará $" + 
											   pizza1adaptada.getCosto() + 
											   " por una " + pizza1.getNombre() +
											   " con la siguiente descripción:\n" + 
											   pizza1adaptada.getDescripcion());
							break;
							
						case 2:
							System.out.println("\nUsted pagará $" + 
											   pizza2adaptada.getCosto() + 
											   " por una " + pizza2.getNombre() + 
											   " con la siguiente descripción\n" +
											   pizza2adaptada.getDescripcion());
							break;

						case 3:
							System.out.println("\nUsted pagará $" + 
											   pizza3adaptada.getCosto() + 
											   " por una " + pizza3.getNombre() + 
											   " con la siguiente descripción\n" +
											   pizza3adaptada.getDescripcion());
							break;

						case 4:
							System.out.println("\nUsted pagará $" + 
											   pizza4adaptada.getCosto() + 
											   " por una " + pizza4.getNombre() + 
											   " con la siguiente descripción\n" +
											   pizza4adaptada.getDescripcion());
							break;

						case 5:
							System.out.println("\nUsted pagará $" + 
											   pizza5adaptada.getCosto() + 
											   " por una " + pizza5.getNombre() + 
											   " con la siguiente descripción\n" +
											   pizza5adaptada.getDescripcion());
							break;

						default:
							System.out.println("Opción inválida de pizza." + 
							                   "Por favor, intente de nuevo.");
					}

					System.out.println("\nGracias por su compra. Bonito día c:");
					break;
				default:
					System.out.println("Opción inválida de producto. Por favor, " + 
					                   "intente de nuevo. \n");
			}

		} catch(Exception e) {
			System.out.println("Error de entrada. Por favor, introduce una " + 
			                   "opción válida para el producto.");
		}
	}
}
