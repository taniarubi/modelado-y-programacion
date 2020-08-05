/**
 * Clase principal. 
 */
public class Main {
    public static void main(String[] args) {
        Sistema chat = new Sistema("El lavadero.");

        Usuario usuario1 = new Usuario("Fernando", "MX", chat);
        Usuario usuario2 = new Usuario("Álvaro", "ES", chat);

        System.out.println("\nParticipantes: ");
        for(Usuario usuario: chat.getUsuarios()) {
            System.out.println(usuario.getNombre());
        }

        usuario1.setMensaje("Hola amicos. ¿Cómo están?");
        System.out.print("\n");
        chat.notificar(usuario1); 

        usuario2.setMensaje("Me voy, no me extrañeis demasiado c:");
        System.out.print("\n");
        chat.notificar(usuario2);
        System.out.print("\n");
        chat.remover(usuario2);

        System.out.print("\n");
        Usuario usuario3 = new Usuario("James", "ENG", chat);

        System.out.println("\nParticipantes: ");
        for(Usuario usuario: chat.getUsuarios()) {
            System.out.println(usuario.getNombre());
        }

        usuario3.setMensaje("Hello guys!");
        System.out.print("\n");
        chat.notificar(usuario3);

        System.out.print("\n");
        chat.remover(usuario1);

        System.out.println("\nParticipantes: ");
        for(Usuario usuario: chat.getUsuarios()) {
            System.out.println(usuario.getNombre());
        }
    }
}
