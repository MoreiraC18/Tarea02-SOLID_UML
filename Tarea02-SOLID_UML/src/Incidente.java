public class Incidente {
    private String descripcion;
    private String estado;
    private Usuario reportadoPor;
    private Usuario asignadoA;

    public Incidente(String descripcion, Usuario reportadoPor) {
        this.descripcion = descripcion;
        this.reportadoPor = reportadoPor;
        this.estado = "Nuevo";
        this.asignadoA = null;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public Usuario getReportadoPor() {
        return reportadoPor;
    }

    public Usuario getAsignadoA() {
        return asignadoA;
    }

    public void setAsignadoA(Usuario asignadoA) {
        this.asignadoA = asignadoA;
    }

    public void cambiarEstado(String estado) {
        this.estado = estado;
        System.out.println("Estado del incidente actualizado a: " + estado);
    }
}
