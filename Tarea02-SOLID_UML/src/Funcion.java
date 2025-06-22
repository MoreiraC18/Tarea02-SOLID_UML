import java.util.List;

public class Funcion {
    private String fechaHora;
    private String ubicacion;
    private List<Asiento> asientos;

    public Funcion(String fechaHora, String ubicacion, List<Asiento> asientos) {
        this.fechaHora = fechaHora;
        this.ubicacion = ubicacion;
        this.asientos = asientos;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public List<Asiento> getAsientosDisponibles() {
        // Simulación básica (aquí iría lógica real)
        return asientos;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public String getUbicacion() {
        return ubicacion;
    }
    
}
