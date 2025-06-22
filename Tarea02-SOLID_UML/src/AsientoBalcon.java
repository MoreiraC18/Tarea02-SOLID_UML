public class AsientoBalcon implements Asiento {
    private float precio;

    public AsientoBalcon(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void reservar() {
        System.out.println("Asiento Balcón reservado.");
    }

    public void liberar() {
        System.out.println("Asiento Balcón liberado.");
    }
}