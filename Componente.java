public class Componente {
    protected int id;
    protected String nombre;
    protected String estadoSalud;
    protected boolean activo;
    protected double costoConstruccion;

    public Componente() {
        this.id = 0;
        this.nombre = "";
        this.estadoSalud = "";
        this.activo = false;
        this.costoConstruccion = 0.0;
    }

    public Componente(int id, String nombre, String estadoSalud, boolean activo, double costoConstruccion) {
        this.id = id;
        this.nombre = nombre;
        this.estadoSalud = estadoSalud;
        this.activo = activo;
        this.costoConstruccion = costoConstruccion;
    }

    // metodo que usaran las clases hijas y se sobreescribira
    public void procesarCiclo() {
        
    }

    public void setId(int newid) {
        this.id = newid;
    }

    public int getId() {
        return this.id;
    }

    public void setNombre(String newnombre) {
        this.nombre = newnombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEstadoSalud(String newestadoSalud) {
        this.estadoSalud = newestadoSalud;
    }

    public String getEstadoSalud() {
        return this.estadoSalud;
    }

    public void setActivo(boolean newactivo) {
        this.activo = newactivo;
    }

    public boolean getActivo() {
        return this.activo;
    }

    public void setCostoConstruccion(double newcostoConstruccion) {
        this.costoConstruccion = newcostoConstruccion;
    }

    public double getCostoConstruccion() {
        return this.costoConstruccion;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "\nNombre: " + this.nombre + "\nEstado: " + this.estadoSalud + "\nActivo: " + this.activo + "\nCosto: " + this.costoConstruccion;
    }
}