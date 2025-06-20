public class SoporteCliente extends Usuario {
    public SoporteCliente(String nombre, String email) {
        super(nombre, email);
    }

    public void resolverIncidente(Incidente i) {
        System.out.println("Incidente resuelto: " + i.getDescripcion());
    }

    public void escalarIncidente(Incidente i, AdministradorEvento d) {
        d.solucionarIncidente(i);
    }
}
