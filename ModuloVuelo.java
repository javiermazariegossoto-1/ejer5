public class ModuloVuelo extends Componente {
    private String tipoInstrumento;
    private int datosRecolectados;
    private int energiaNecesaria;

    public ModuloVuelo() {
        super();
        this.tipoInstrumento = "";
        this.datosRecolectados = 0;
        this.energiaNecesaria = 0;
    }

    public ModuloVuelo(int id, String nombre, String estadoSalud, boolean activo, double costoConstruccion, String tipoInstrumento, int datosRecolectados, int energiaNecesaria) {
        super(id, nombre, estadoSalud, activo, costoConstruccion);
        this.tipoInstrumento = tipoInstrumento;
        this.datosRecolectados = datosRecolectados;
        this.energiaNecesaria = energiaNecesaria;
    }

    // en un ciclo de vuelo se aumenta en 10 los datos recolectados
    @Override
    public void procesarCiclo() {
        this.datosRecolectados += 10; 
    }

    public int ciclosAcumulados() {
        return this.datosRecolectados / 10;
    }

    public void setTipoInstrumento(String newtipoInstrumento) {
        this.tipoInstrumento = newtipoInstrumento;
    }

    public String getTipoInstrumento() {
        return this.tipoInstrumento;
    }

    public void setDatosRecolectados(int newdatosRecolectados) {
        this.datosRecolectados = newdatosRecolectados;
    }

    public int getDatosRecolectados() {
        return this.datosRecolectados;
    }

    public void setEnergiaNecesaria(int newenergiaNecesaria) {
        this.energiaNecesaria = newenergiaNecesaria;
    }

    public int getEnergiaNecesaria() {
        return this.energiaNecesaria;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo Instrumento: " + this.tipoInstrumento + 
               "\nDatos Recolectados: " + this.datosRecolectados + "\nEnergía Necesaria: " + this.energiaNecesaria;
    }
}