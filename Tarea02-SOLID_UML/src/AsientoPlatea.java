public class AsientoPlatea implements Asiento {
    private float precio;

    public AsientoPlatea(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void reservar() {
        System.out.println("Asiento Platea reservado.");
    }

    public void liberar() {
        System.out.println("Asiento Platea liberado.");
    }
    
}