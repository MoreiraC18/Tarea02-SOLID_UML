import java.util.List;
public class EventoMicroTeatro implements Evento {
    private String titulo;
    private String descripcion;
    private List<Funcion> funciones;

    public EventoMicroTeatro(String titulo, String descripcion, List<Funcion> funciones) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.funciones = funciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }
}
