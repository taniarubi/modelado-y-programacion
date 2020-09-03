import java.util.Scanner;

public class Main {
    public static void partida(Enemigo enemigo, Comandante c1, Comandante c2, 
                               Comandante c3) {
        while(enemigo.getPuntos() >= 0) {
            System.out.println("\nEste es el estado del juego:\n");
            System.out.println("HP del enemigo: " + enemigo.getPuntos());
            System.out.println("La distancia de cada uno de los pelotones " + 
                               "con respecto al enemigo es: ");
            System.out.println("Pelotón 1:");
            System.out.println(c1.getDistancia());
            System.out.println("Pelotón 2:");
            System.out.println(c2.getDistancia());
            System.out.println("Pelotón 3:");
            System.out.println(c3.getDistancia());
            
            System.out.println("\nAhora que ya conoces el panorama, ¿cuál " + 
                               "acción te gustaría realizar?\n" + 
                               "1. Atacar\n2. Mover\n3. Reportar\n" + 
                               "Recuerda que cada una de las acciones se " + 
                               "realizará en cada uno de tus tres pelotones.");

            Scanner sc = new Scanner(System.in);
            int accion = sc.nextInt();

            switch(accion) {
                case 1:
                    c1.atacar();
                    c2.atacar();
                    c3.atacar();
                    break;
                case 2:
                    c1.mover();
                    c2.mover();
                    c3.mover();
                    break;
                case 3:
                    c1.reportar();
                    c2.reportar();
                    c3.reportar();
                    break;
            }
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
        Comandante comandante1;
        Comandante comandante2;
        Comandante comandante3;

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
                /* El comandante corresponde al primer soldado. */
                comandante1 = new Comandante("Juan", 12345);
                /* Agregamos los soldados subordinados del comandante. */
                comandante1.agregarSoldado(soldado1); // Es subordinado de sí mismo.
                comandante1.agregarSoldado(soldado2);
                comandante1.agregarSoldado(soldado3);
                comandante1.agregarSoldado(soldado4);
                comandante1.agregarSoldado(soldado5);
                comandante1.agregarSoldado(soldado6);

                soldado7 = factory.getSoldado("Rojo", 23459, Factory.CABALLERIA);
                soldado8 = factory.getSoldado("Cleto", 23457, Factory.CABALLERIA);
                soldado9 = factory.getSoldado("Bob", 23458, Factory.CABALLERIA);
                /* El comandante corresponde al séptimo soldado. */
                comandante2 = new Comandante("Rojo", 23459);
                /* Agregamos los soldados subordinados del comandante. */
                comandante2.agregarSoldado(soldado7); // Es subordinado de sí mismo.
                comandante2.agregarSoldado(soldado8);
                comandante2.agregarSoldado(soldado9);

                soldado10 = factory.getSoldado("Pascal", 23408, Factory.CABALLERIA);
                soldado11 = factory.getSoldado("Tommy", 23450, Factory.CABALLERIA);  
                soldado12 = factory.getSoldado("Diego", 23451, Factory.CABALLERIA);  
                soldado13 = factory.getSoldado("Yeik", 23452, Factory.CABALLERIA);  
                soldado14 = factory.getSoldado("Marco", 23452, Factory.CABALLERIA);  
                soldado15 = factory.getSoldado("Jorge", 23453, Factory.CABALLERIA);
                /* El comandante corresponde al décimo soldado. */
                comandante3 = new Comandante("Pascal", 23408);
                /* Agregamos los soldados subordinados del comandante. */
                comandante3.agregarSoldado(soldado10); // Es subordinado de sí mismo.
                comandante3.agregarSoldado(soldado11);
                comandante3.agregarSoldado(soldado12);
                comandante3.agregarSoldado(soldado13);
                comandante3.agregarSoldado(soldado14);
                comandante3.agregarSoldado(soldado15);

                System.out.println("\nEjército Explorador. Cuentas con el " + 
                                   "siguiente team:");
                System.out.println("Pelotón 1:");
                System.out.println(soldado1.reportar() + soldado2.reportar() +
                                   soldado3.reportar() + soldado4.reportar() + 
                                   soldado5.reportar() + soldado6.reportar());
                System.out.println("Pelotón 2:");
                System.out.println(soldado7.reportar() + soldado8.reportar() +
                                   soldado9.reportar());
                System.out.println("Pelotón 3:");
                System.out.println(soldado10.reportar() + soldado11.reportar() + 
                                   soldado12.reportar() + soldado13.reportar() + 
                                   soldado14.reportar() + soldado15.reportar());

                partida(enemigo, comandante1, comandante2, comandante3);
                break;
            case 2:
                soldado1 = factory.getSoldado("David", 34567, Factory.INFANTERIA);
                soldado2 = factory.getSoldado("Alan", 34568, Factory.INFANTERIA);
                soldado3 = factory.getSoldado("Abraham", 34569, Factory.INFANTERIA);
                soldado4 = factory.getSoldado("César", 34560, Factory.INFANTERIA);
                soldado5 = factory.getSoldado("Carlos", 34561, Factory.INFANTERIA);
                soldado6 = factory.getSoldado("Cristian", 34562, Factory.INFANTERIA);
                /* El comandante corresponde al primer soldado. */
                comandante1 = new Comandante("David", 34567);
                /* Agregamos los soldados subordinados del comandante. */
                comandante1.agregarSoldado(soldado1); // Es subordinado de sí mismo.
                comandante1.agregarSoldado(soldado2);
                comandante1.agregarSoldado(soldado3);
                comandante1.agregarSoldado(soldado4);
                comandante1.agregarSoldado(soldado5);
                comandante1.agregarSoldado(soldado6);

                soldado7 = factory.getSoldado("Brayan", 34563, Factory.ARTILLERIA);
                soldado8 = factory.getSoldado("Santiago", 34564, Factory.ARTILLERIA);
                soldado9 = factory.getSoldado("Sebastián", 34565, Factory.ARTILLERIA);
                /* El comandante corresponde al séptimo soldado. */
                comandante2 = new Comandante("Brayan", 34563);
                /* Agregamos los soldados subordinados del comandante. */
                comandante2.agregarSoldado(soldado7); // Es subordinado de sí mismo.
                comandante2.agregarSoldado(soldado8);
                comandante2.agregarSoldado(soldado9);
                
                soldado10 = factory.getSoldado("Jaime", 45678, Factory.CABALLERIA);
                soldado11 = factory.getSoldado("Benjamin", 45679, Factory.CABALLERIA);
                soldado12 = factory.getSoldado("Gilbert", 45670, Factory.CABALLERIA);
                soldado13 = factory.getSoldado("Johan", 45671, Factory.CABALLERIA);
                soldado14 = factory.getSoldado("Edgar", 45672, Factory.CABALLERIA);
                soldado15 = factory.getSoldado("Emilio", 45673, Factory.CABALLERIA);
                /* El comandante corresponde al décimo soldado. */
                comandante3 = new Comandante("Jaime", 45678);
                /* Agregamos los soldados subordinados del comandante. */
                comandante3.agregarSoldado(soldado10); // Es subordinado de sí mismo.
                comandante3.agregarSoldado(soldado11);
                comandante3.agregarSoldado(soldado12);
                comandante3.agregarSoldado(soldado13);
                comandante3.agregarSoldado(soldado14);
                comandante3.agregarSoldado(soldado15);

                System.out.println("\nEjército Default. Cuentas con el " + 
                                   "siguiente team: ");
                System.out.println("Pelotón 1:");
                System.out.println(soldado1.reportar() + soldado2.reportar() + 
                                   soldado3.reportar() + soldado4.reportar() + 
                                   soldado5.reportar() + soldado6.reportar());
                System.out.println("Pelotón 2:");
                System.out.println(soldado7.reportar() + soldado8.reportar() + 
                                   soldado9.reportar());
                System.out.println("Pelotón 3:");
                System.out.println(soldado10.reportar() + soldado11.reportar() + 
                                   soldado12.reportar() + soldado13.reportar() + 
                                   soldado14.reportar() + soldado15.reportar());

                System.out.println(soldado14.atacar());
                partida(enemigo, comandante1, comandante2, comandante3);
                break;
            case 3:
                soldado1 = factory.getSoldado("Joaquín", 56789, Factory.INFANTERIA);
                soldado2 = factory.getSoldado("Javier", 56780, Factory.INFANTERIA);
                soldado3 = factory.getSoldado("Joshua", 56782, Factory.INFANTERIA);
                soldado4 = factory.getSoldado("Heliud", 56783, Factory.INFANTERIA);
                soldado5 = factory.getSoldado("Víctor", 56784, Factory.INFANTERIA);
                /* El comandante corresponde al primer soldado. */
                comandante1 = new Comandante("Joaquín", 56789);
                /* Agregamos los soldados subordinados del comandante. */
                comandante1.agregarSoldado(soldado1); // Es subordinado de sí mismo.
                comandante1.agregarSoldado(soldado2);
                comandante1.agregarSoldado(soldado3);
                comandante1.agregarSoldado(soldado4);
                comandante1.agregarSoldado(soldado5);

                soldado6 = factory.getSoldado("Iván", 56785, Factory.INFANTERIA);
                soldado7 = factory.getSoldado("Ángel", 56786, Factory.INFANTERIA);
                soldado8 = factory.getSoldado("León", 56787, Factory.INFANTERIA);
                soldado9 = factory.getSoldado("Hugo", 56788, Factory.INFANTERIA);
                soldado10 = factory.getSoldado("Joel", 67890, Factory.INFANTERIA);
                /* El comandante corresponde al sexto soldado. */
                comandante2 = new Comandante("Iván", 56785);
                /* Agregamos los soldados subordinados del comandante. */
                comandante2.agregarSoldado(soldado6); // Es subordinado de sí mismo.
                comandante2.agregarSoldado(soldado7);
                comandante2.agregarSoldado(soldado8);
                comandante2.agregarSoldado(soldado9);
                comandante2.agregarSoldado(soldado10);

                soldado11 = factory.getSoldado("Diego", 67891, Factory.CABALLERIA);
                soldado12 = factory.getSoldado("Arturo", 67892, Factory.CABALLERIA);
                soldado13 = factory.getSoldado("Omar", 67893, Factory.CABALLERIA);
                soldado14 = factory.getSoldado("Emiliano", 67894, Factory.CABALLERIA);
                soldado15 = factory.getSoldado("Galindo", 67895, Factory.CABALLERIA);
                /* El comandante corresponde al undécimo soldado. */
                comandante3 = new Comandante("David", 34567);
                /* Agregamos los soldados subordinados del comandante. */
                comandante3.agregarSoldado(soldado11); // Es subordinado de sí mismo.
                comandante3.agregarSoldado(soldado12);
                comandante3.agregarSoldado(soldado13);
                comandante3.agregarSoldado(soldado14);
                comandante3.agregarSoldado(soldado15);
                    
                System.out.println("\nEjército Kamikaze. Cuentas con el " + 
                                   "siguiente team:");
                System.out.println("Pelotón 1:");
                System.out.println(soldado1.reportar() + soldado2.reportar() +
                                   soldado3.reportar() + soldado4.reportar() + 
                                   soldado5.reportar());
                System.out.println("Pelotón 2:");
                System.out.println(soldado6.reportar() + soldado7.reportar() + 
                                   soldado8.reportar() + soldado9.reportar() + 
                                   soldado10.reportar());
                System.out.println("Pelotón 3:");
                System.out.println(soldado11.reportar() + soldado12.reportar() + 
                                   soldado13.reportar() + soldado14.reportar() + 
                                   soldado15.reportar());

                partida(enemigo, comandante1, comandante2, comandante3);
                break; 
            default:
                System.out.println("Opción de pelotón inválida.");
                break;
        }
    }
}
