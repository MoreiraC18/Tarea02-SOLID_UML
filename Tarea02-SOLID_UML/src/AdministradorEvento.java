public class AdministradorEvento extends Usuario{
    public AdministradorEvento(String nombre, String email) {
        super(nombre, email);
    }

    public void solucionarIncidente(Incidente i) {
        System.out.println("Administrador resolvió el incidente: " + i.getDescripcion());
    }
}
