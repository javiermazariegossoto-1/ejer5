public class ModuloTierra extends Componente {
    private int capacidadDescarga;
    private int energiaNecesaria;

    public ModuloTierra() {
        super();
        this.capacidadDescarga = 0;
        this.energiaNecesaria = 0;
    }

    public ModuloTierra(int id, String nombre, String estadoSalud, boolean activo, double costoConstruccion, int capacidadDescarga, int energiaNecesaria) {
        super(id, nombre, estadoSalud, activo, costoConstruccion);
        this.capacidadDescarga = capacidadDescarga;
        this.energiaNecesaria = energiaNecesaria;
    }


    @Override
    public void procesarCiclo() {
    }

    public int ciclosAcumulados() {
        return 0; 
    }

    public void setCapacidadDescarga(int newcapacidadDescarga) {
        this.capacidadDescarga = newcapacidadDescarga;
    }

    public int getCapacidadDescarga() {
        return this.capacidadDescarga;
    }

    public void setEnergiaNecesaria(int newenergiaNecesaria) {
        this.energiaNecesaria = newenergiaNecesaria;
    }

    public int getEnergiaNecesaria() {
        return this.energiaNecesaria;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCapacidad de Descarga: " + this.capacidadDescarga + 
               "\nEnergía Necesaria: " + this.energiaNecesaria;
    }
}