import java.util.ArrayList;

public class AdministradorSistema extends Usuario {

    public AdministradorSistema(String nombre, String email) {
        super(nombre, email);
    }

    public Evento crearEvento() {
        return new EventoTeatro("Nuevo Evento", "Descripción", new ArrayList<>());
    }

    public Evento modificarEvento(Evento e) {
        System.out.println("Modificando evento: " + e.getTitulo());
        return e;
    }

    public Funcion configurarFuncion(Funcion f) {
        return f;
    }

    public Promocion definirPromocion() {
        return new Promocion();
    }

    public void configurarPoliticaCancelacion(PoliticaCancelacion p) {
        System.out.println("Política configurada: " + p.getDescripcion());
    }

    public void gestionarCategoriasAsientos() {
        System.out.println("Categorías de asientos actualizadas.");
    }
}
