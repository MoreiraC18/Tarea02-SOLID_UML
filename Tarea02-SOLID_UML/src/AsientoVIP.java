public class AsientoVIP implements Asiento {
    private float precio;

    public AsientoVIP(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void reservar() {
        System.out.println("Asiento VIP reservado.");
    }

    public void liberar() {
        System.out.println("Asiento VIP liberado.");
    }
}
