import java.util.List;

public class Reservacion {
    private Usuario usuario;
    private List<Asiento> asientos;
    private String fechaExpiracion;


    public Reservacion(Usuario usuario, List<Asiento> asientos) {
        this.usuario = usuario;
        this.asientos = asientos;
    }

    public Ticket confirmarCompra() {
        return new Ticket(asientos, null, usuario); // Función nula por simplicidad
    }

    public void liberar() {
        for (Asiento a : asientos) {
            a.liberar();
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }
}
