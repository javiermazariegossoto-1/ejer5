import java.util.ArrayList;

public class Quetzal {
    private ArrayList<Componente> listaComponentes;

    public Quetzal() {
        this.listaComponentes = new ArrayList<Componente>();
    }

    // agrega cada tipo de modulo a la lista
    public void agregarComponente(Componente c) throws Exception {
        for (Componente comp : listaComponentes) {
            if (comp.getId() == c.getId()) {
                throw new Exception("Ya existe un componente con el ID especificado.");
            }
        }
        this.listaComponentes.add(c); 
    }

    // calcula y retorna la suma de la capacidad de descarga de todos los módulos de tierra presentes
    public int totalDescargado() {
        int total = 0; 
        for (Componente comp : listaComponentes) { // itera en cada modulo de la lista de ocmponentes
            if (comp instanceof ModuloTierra) { // Evalua el tipo de componente
                total += ((ModuloTierra) comp).getCapacidadDescarga();
            }
        }
        return total; // Retorna el acumulador con el resultado total calculado
    }

    //lista los modulos como texto para observar los módulos que se tienen
    public String listarModulos() {
        String cadena = ""; 
        for (Componente comp : listaComponentes) { // recorre cada objeto en el ArrayList
            cadena += comp.toString() + "\n-------------------\n";
        }
        return cadena;
    }

    // Recorre la lista de componentes para buscar en que tenga la id solicitada
    public Componente buscarModulo(int id) throws Exception {
        for (Componente comp : listaComponentes) { // Inicia un bucle para evaluar cada componente contenido en la colección
            if (comp.getId() == id) { // Compara si el identificador del componente iterado es idéntico al ID buscado
                return comp; // Retorna inmediatamente el componente en cuanto la condición es verdadera
            }
        }
        throw new Exception("Módulo no encontrado."); 
    }

    // Suma el costo de construcción individual de todos los módulos almacenados para obtener el presupuesto
    public double consultarCosto() {
        double costoTotal = 0; 
        for (Componente comp : listaComponentes) { // Itera a través de todos los componentes existentes en el simulador
            costoTotal += comp.getCostoConstruccion();
        }
        return costoTotal; // Devuelve la sumatoria final de todos los costos de construcción
    }
}