import java.util.Scanner;

public class Main {
    public static void partida(Enemigo enemigo) {
        while(enemigo.getPuntos() >= 0) {
            System.out.println("\n Este es el estado del juego:\n");
            System.out.println("HP del enemigo: " + enemigo.getPuntos());
            System.out.println("La distancia de cada uno de los pelotones " + 
                               "respecto al enemigo es: ");
            System.out.println("Pelotón 1:");
            System.out.println("Pelotón 2:");
            System.out.println("Pelotón 3:");
        }
    }

    public static void main(String[] args) {
        /* Creamos nuestro juego. */
        Sistema juego = new Sistema("Nivel Final");
        /* Creamos nuestro usuario. */
        Usuario usuario = new Usuario("Pata", juego);
        /* Creamos a nuestro enemigo. */
        Enemigo enemigo = new Enemigo("Hércules");
        /* Creamos a los soldados. */
        Soldado soldado1;
        Soldado soldado2;
        Soldado soldado3;
        Soldado soldado4;
        Soldado soldado5;
        Soldado soldado6;
        Soldado soldado7;
        Soldado soldado8;
        Soldado soldado9;
        Soldado soldado10;
        Soldado soldado11;
        Soldado soldado12;
        Soldado soldado13;
        Soldado soldado14;
        Soldado soldado15;
        /* Creamos a los comandantes. */
        //Comandante comandante1;
        //Comandante comandante2;
        //Comandante comandante3;

        System.out.println("¡Hola " + usuario.getNombre() + "! \nHay 3 " + 
                           "ejércitos disponibles para elegir: \n");
        System.out.println("1. Explorador: Se conforma de 3 pelotones.\n" + 
                           "Pelotón 1: tiene 6 soldados de infantería.\n" + 
                           "Pelotón 2: tiene 1 artillero y 2 soldados de " + 
                           "caballería.\n" + 
                           "Pelotón 3: tiene 6 soldados de caballería.\n");
        System.out.println("2. Default: Se conforma de 3 pelotones.\n" + 
                           "Pelotón 1: tiene 6 soldados de infantería.\n" + 
                           "Pelotón 2: tiene 3 artilleros.\n" + 
                           "Pelotón 3: tiene 6 soldados de caballería.\n");
        System.out.println("3. Kamikaze: Se conforma de 3 pelotones.\n" + 
                           "Pelotón 1: tiene 5 soldados de infantería.\n" + 
                           "Pelotón 2: tiene 5 soldados de infantería.\n" + 
                           "Pelotón 3: tiene 5 soldados de caballería.\n");
        System.out.println("Por favor, elige con cuál ejército quieres " + 
                           "iniciar tu partida.");

        Scanner s = new Scanner(System.in);
        int ejercito = s.nextInt();    
        
        AbstractFactory factory = new Factory();

        switch(ejercito) {
            case 1:
                soldado1 = factory.getSoldado("Juan", 12345, Factory.INFANTERIA);
                soldado2 = factory.getSoldado("Pedro", 12346, Factory.INFANTERIA);
                soldado3 = factory.getSoldado("Óscar", 12347, Factory.INFANTERIA);
                soldado4 = factory.getSoldado("Miguel", 12348, Factory.INFANTERIA);
                soldado5 = factory.getSoldado("Leo", 12349, Factory.INFANTERIA);
                soldado6 = factory.getSoldado("Alex", 12340, Factory.INFANTERIA);

                soldado7 = factory.getSoldado("Rojo", 23459, Factory.CABALLERIA);
                soldado8 = factory.getSoldado("Cleto", 23457, Factory.CABALLERIA);
                soldado9 = factory.getSoldado("Bob", 23458, Factory.CABALLERIA);

                soldado10 = factory.getSoldado("Pascal", 23408, Factory.CABALLERIA);
                soldado11 = factory.getSoldado("Tommy", 23450, Factory.CABALLERIA);  
                soldado12 = factory.getSoldado("Diego", 23451, Factory.CABALLERIA);  
                soldado13 = factory.getSoldado("Yeik", 23452, Factory.CABALLERIA);  
                soldado14 = factory.getSoldado("Marco", 23452, Factory.CABALLERIA);  
                soldado15 = factory.getSoldado("Jorge", 23453, Factory.CABALLERIA);

                System.out.println("\nEjército Explorador. Cuentas con el " + 
                                   "siguiente team:");
                System.out.println("Pelotón 1:");
                System.out.println(soldado1.toString() + soldado2.toString() + 
                                   soldado3.toString() + soldado4.toString() + 
                                   soldado5.toString() + soldado6.toString());
                System.out.println("Pelotón 2:");
                System.out.println(soldado7.toString() + soldado8.toString() +
                                   soldado9.toString());
                System.out.println("Pelotón 3:");
                System.out.println(soldado10.toString() + soldado11.toString() + 
                                   soldado12.toString() + soldado13.toString() + 
                                   soldado14.toString() + soldado15.toString());
                break;
            case 2:
                soldado1 = factory.getSoldado("David", 34567, Factory.INFANTERIA);
                soldado2 = factory.getSoldado("Alan", 34568, Factory.INFANTERIA);
                soldado3 = factory.getSoldado("Abraham", 34569, Factory.INFANTERIA);
                soldado4 = factory.getSoldado("César", 34560, Factory.INFANTERIA);
                soldado5 = factory.getSoldado("Carlos", 34561, Factory.INFANTERIA);
                soldado6 = factory.getSoldado("Cristian", 34562, Factory.INFANTERIA);

                soldado7 = factory.getSoldado("Brayan", 34563, Factory.ARTILLERIA);
                soldado8 = factory.getSoldado("Santiago", 34564, Factory.ARTILLERIA);
                soldado9 = factory.getSoldado("Sebastián", 34565, Factory.ARTILLERIA);
                
                soldado10 = factory.getSoldado("Jaime", 45678, Factory.CABALLERIA);
                soldado11 = factory.getSoldado("Benjamin", 45679, Factory.CABALLERIA);
                soldado12 = factory.getSoldado("Gilbert", 45670, Factory.CABALLERIA);
                soldado13 = factory.getSoldado("Johan", 45671, Factory.CABALLERIA);
                soldado14 = factory.getSoldado("Edgar", 45672, Factory.CABALLERIA);
                soldado15 = factory.getSoldado("Emilio", 45673, Factory.CABALLERIA);

                System.out.println("\nEjército Default. Cuentas con el " + 
                                   "siguiente team: ");
                System.out.println("Pelotón 1:");
                System.out.println(soldado1.toString() + soldado2.toString() + 
                                   soldado3.toString() + soldado4.toString() + 
                                   soldado5.toString() + soldado6.toString());
                System.out.println("Pelotón 2:");
                System.out.println(soldado7.toString() + soldado8.toString() + 
                                   soldado9.toString());
                System.out.println("Pelotón 3:");
                System.out.println(soldado10.toString() + soldado11.toString() + 
                                   soldado12.toString() + soldado13.toString() + 
                                   soldado14.toString() + soldado15.toString());
                break;
            case 3:
                soldado1 = factory.getSoldado("Joaquín", 56789, Factory.INFANTERIA);
                soldado2 = factory.getSoldado("Javier", 56780, Factory.INFANTERIA);
                soldado3 = factory.getSoldado("Joshua", 56782, Factory.INFANTERIA);
                soldado4 = factory.getSoldado("Heliud", 56783, Factory.INFANTERIA);
                soldado5 = factory.getSoldado("Víctor", 56784, Factory.INFANTERIA);

                soldado6 = factory.getSoldado("Iván", 56785, Factory.INFANTERIA);
                soldado7 = factory.getSoldado("Ángel", 56786, Factory.INFANTERIA);
                soldado8 = factory.getSoldado("León", 56787, Factory.INFANTERIA);
                soldado9 = factory.getSoldado("Hugo", 56788, Factory.INFANTERIA);
                soldado10 = factory.getSoldado("Joel", 67890, Factory.INFANTERIA);

                soldado11 = factory.getSoldado("Diego", 67891, Factory.CABALLERIA);
                soldado12 = factory.getSoldado("Arturo", 67892, Factory.CABALLERIA);
                soldado13 = factory.getSoldado("Omar", 67893, Factory.CABALLERIA);
                soldado14 = factory.getSoldado("Emiliano", 67894, Factory.CABALLERIA);
                soldado15 = factory.getSoldado("Galindo", 67895, Factory.CABALLERIA);
                    
                System.out.println("\nEjército Kamikaze. Cuentas con el " + 
                                   "siguiente team:");
                System.out.println("Pelotón 1:");
                System.out.println(soldado1.toString() + soldado2.toString() +
                                   soldado3.toString() + soldado4.toString() + 
                                   soldado5.toString());
                System.out.println("Pelotón 2:");
                System.out.println(soldado6.toString() + soldado7.toString() + 
                                   soldado8.toString() + soldado9.toString() + 
                                   soldado10.toString());
                System.out.println("Pelotón 3:");
                System.out.println(soldado11.toString() + soldado12.toString() + 
                                   soldado13.toString() + soldado14.toString() + 
                                   soldado15.toString());
                break; 
            default:
                System.out.println("Opción de pelotón inválida.");
                break;
        }
    }
}
