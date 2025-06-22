import java.util.List;

public class Ticket {
    private List<Asiento> asientos;
    private Funcion funcion;
    private Usuario usuario;
    private List<OpcionAdicional> opcionesAdicionales;

    public Ticket(List<Asiento> asientos, Funcion funcion, Usuario usuario) {
        this.asientos = asientos;
        this.funcion = funcion;
        this.usuario = usuario;
    }

    public float getPrecioTotal() {
        float total = 0;
        for (Asiento a : asientos) {
            total += a.getPrecio();
        }
        if (opcionesAdicionales != null) {
            for (OpcionAdicional o : opcionesAdicionales) {
                total += o.getPrecio();
            }
        }
        return total;
    }

    public void cancelar() {
        for (Asiento a : asientos) {
            a.liberar();
        }
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<OpcionAdicional> getOpcionesAdicionales() {
        return opcionesAdicionales;
    }
    
}
