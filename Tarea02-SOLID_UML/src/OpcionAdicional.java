public class OpcionAdicional {
    private String descripcion;
    private float precio;

    public OpcionAdicional(String descripcion, float precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}

