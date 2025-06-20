import java.util.List;

public class Cliente extends Usuario {
    public Cliente(String nombre, String email) {
        super(nombre, email);
    }

    public List<Evento> verEventos() {
        return null;
    }

    public void seleccionarFuncion(Funcion f) {
        System.out.println("Función seleccionada: ...");
    }

    public Reservacion reservarAsiento(Asiento a) {
        return null;

    }

    public Ticket comprarTicket(Reservacion r) {
        return null;
    }

    public Incidente reportarIncidente(String desc) {
        return new Incidente(desc, this);
    }
}
