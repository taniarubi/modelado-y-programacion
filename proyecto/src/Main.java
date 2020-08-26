import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola compañero! \nHay 3 ejércitos disponibles " + 
                           "para elegir: \n");
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

        switch(ejercito) {
            case 1:
                Soldado soldado1 = 
                    Factory.getSoldado("I-Juan", 12345, "INFANTERIA");
                Soldado soldado2 = 
                    Factory.getSoldado("I-Pedro", 12346, "INFANTERIA");
                Soldado soldado3 = 
                    Factory.getSoldado("I-Óscar", 12347, "INFANTERIA");
                Soldado soldado4 = 
                    Factory.getSoldado("I-Miguel", 12348, "INFANTERIA");
                Soldado soldado5 = 
                    Factory.getSoldado("I-Leo", 12349, "INFANTERIA");
                Soldado soldado6 = 
                    Factory.getSoldado("I-Alex", 12340, "INFANTERIA");

                Soldado soldado7 = 
                    Factory.getSoldado("A-Xolo", 23456, "ARTILLERIA");
                Soldado soldado8 = 
                    Factory.getSoldado("C-Cleto", 23457, "CABALLERIA");
                Soldado soldado9 = 
                    Factory.getSoldado("C-Bob", 23458, "CABALLERIA");

                Soldado soldado10 = 
                    Factory.getSoldado("C-Rojo", 23459, "CABALLERIA");  
                Soldado soldado11 = 
                    Factory.getSoldado("C-Tommy", 23450, "CABALLERIA");  
                Soldado soldado12 = 
                    Factory.getSoldado("C-Diego", 23451, "CABALLERIA");  
                Soldado soldado13 = 
                    Factory.getSoldado("C-Yeik", 23452, "CABALLERIA");  
                Soldado soldado14 = 
                    Factory.getSoldado("C-Marco", 23452, "CABALLERIA");  
                Soldado soldado15 = 
                    Factory.getSoldado("C-Jorge", 23453, "CABALLERIA");
                
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
                Soldado soldado16 = 
                    Factory.getSoldado("I-David", 34567, "INFANTERIA");
                Soldado soldado17 = 
                    Factory.getSoldado("I-Alan", 34568, "INFANTERIA");
                Soldado soldado18 = 
                    Factory.getSoldado("I-Abraham", 34569, "INFANTERIA");
                Soldado soldado19 = 
                    Factory.getSoldado("I-César", 34560, "INFANTERIA");
                Soldado soldado20 = 
                    Factory.getSoldado("I-Carlos", 34561, "INFANTERIA");
                Soldado soldado21 = 
                    Factory.getSoldado("I-Cristián", 34562, "INFANTERIA");

                Soldado soldado22 = 
                    Factory.getSoldado("A-Brayan", 34563, "ARTILLERIA");

                Soldado soldado23 = 
                    Factory.getSoldado("A-Santiago", 34564, "ARTILLERIA");

                Soldado soldado24 =
                    Factory.getSoldado("A-Sebastián", 34565, "ARTILLERIA");

                Soldado soldado25 = 
                    Factory.getSoldado("C-Jaime", 45678, "CABALLERIA");

                Soldado soldado26 = 
                    Factory.getSoldado("C-Benjamin", 45679, "CABALLERIA");

                Soldado soldado27 = 
                    Factory.getSoldado("C-Gilbert", 45670, "CABALLERIA");

                Soldado soldado28 = 
                    Factory.getSoldado("C-Johan", 45671, "CABALLERIA");

                Soldado soldado29 = 
                    Factory.getSoldado("C-Edgar", 45672, "CABALLERIA");

                Soldado soldado30 = 
                    Factory.getSoldado("C-Emilio", 45673, "CABALLERIA");

                System.out.println("\nEjército Default. Cuentas con el " + 
                                   "siguiente team: ");
                System.out.println("Pelotón 1:");
                System.out.println(soldado16.toString() + soldado17.toString() + 
                                   soldado18.toString() + soldado19.toString() + 
                                   soldado20.toString() + soldado21.toString());
                System.out.println("Pelotón 2:");
                System.out.println(soldado22.toString() + soldado23.toString() + 
                                   soldado24.toString());
                System.out.println("Pelotón 3:");
                System.out.println(soldado25.toString() + soldado26.toString() + 
                                   soldado27.toString() + soldado28.toString() + 
                                   soldado29.toString() + soldado30.toString());
                break;
            case 3:
                Soldado soldado31 = 
                    Factory.getSoldado("I-Joaquín", 56789, "INFANTERIA");

                Soldado soldado32 = 
                    Factory.getSoldado("I-Javier", 56780, "INFANTERIA");

                Soldado soldado33 = 
                    Factory.getSoldado("I-Joshua", 56782, "INFANTERIA");

                Soldado soldado34 = 
                    Factory.getSoldado("I-José Luis", 56783, "INFANTERIA");

                Soldado soldado35 = 
                    Factory.getSoldado("I-Víctor", 56784, "INFANTERIA");


                Soldado soldado36 = 
                    Factory.getSoldado("I-Iván", 56785, "INFANTERIA");

                Soldado soldado37 = 
                    Factory.getSoldado("I-Ángel", 56786, "INFANTERIA");

                Soldado soldado38 = 
                    Factory.getSoldado("I-León", 56787, "INFANTERIA");

                Soldado soldado39 = 
                    Factory.getSoldado("I-Hugo", 56788, "INFANTERIA");

                Soldado soldado40 = 
                    Factory.getSoldado("I-Joel", 67890, "INFANTERIA");


                Soldado soldado41 = 
                    Factory.getSoldado("C-Diego", 67891, "CABALLERIA");

                Soldado soldado42 = 
                    Factory.getSoldado("C-Arturo", 67892, "CABALLERIA");
                    
                Soldado soldado43 = 
                    Factory.getSoldado("C-Omar", 67893, "CABALLERIA");

                Soldado soldado44 = 
                    Factory.getSoldado("C-Emiliano", 67894, "CABALLERIA");

                Soldado soldado45 = 
                    Factory.getSoldado("C-Galindo", 67895, "CABALLERIA");
                    
                System.out.println("\nEjército Kamikaze. Cuentas con el " + 
                                   "siguiente team:");
                System.out.println("Pelotón 1:");
                System.out.println(soldado31.toString() + soldado32.toString() +
                                   soldado33.toString() + soldado34.toString() + 
                                   soldado35.toString());
                System.out.println("Pelotón 2:");
                System.out.println(soldado36.toString() + soldado37.toString() + 
                                   soldado38.toString() + soldado39.toString() + 
                                   soldado40.toString());
                System.out.println("Pelotón 3:");
                System.out.println(soldado41.toString() + soldado42.toString() + 
                                   soldado43.toString() + soldado44.toString() + 
                                   soldado45.toString());
                break; 
            default:
                System.out.println("Opción de pelotón inválida.");
                break;
        }
    }
}
