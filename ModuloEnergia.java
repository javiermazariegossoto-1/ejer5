public class ModuloEnergia extends Componente {
    private int energiaGenerada;

    public ModuloEnergia() {
        super();
        this.energiaGenerada = 0;
    }

    public ModuloEnergia(int id, String nombre, String estadoSalud, boolean activo, double costoConstruccion, int energiaGenerada) {
        super(id, nombre, estadoSalud, activo, costoConstruccion);
        this.energiaGenerada = energiaGenerada;
    }

    //simula que se generó energía antes del ciclo
    @Override
    public void procesarCiclo() {
        this.energiaGenerada += 50; 
    }

    
    public int ciclosAcumulados() {
        return this.energiaGenerada / 50; 
    }

    public void setEnergiaGenerada(int newenergiaGenerada) {
        this.energiaGenerada = newenergiaGenerada;
    }

    public int getEnergiaGenerada() {
        return this.energiaGenerada;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEnergía Generada: " + this.energiaGenerada;
    }
}