import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Quetzal simulador = new Quetzal();
        String rpta = "si";

        while (rpta.equalsIgnoreCase("si")) {
            try {
                System.out.println("Ingrese el tipo de módulo a crear: \n1. Vuelo \n2. Tierra \n3. Energía");
                int tipo = teclado.nextInt();
                teclado.nextLine();

                System.out.println("Ingrese el ID: ");
                int id = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Ingrese el nombre del componente: ");
                String nombre = teclado.nextLine();
                System.out.println("Ingrese el estado de salud: ");
                String estado = teclado.nextLine();
                System.out.println("¿Está activo? (true/false): ");
                boolean activo = teclado.nextBoolean();
                System.out.println("Ingrese el costo de construcción: ");
                double costo = teclado.nextDouble();
                teclado.nextLine();

                if (tipo == 1) {
                    System.out.println("Ingrese el tipo de instrumento: ");
                    String instrumento = teclado.nextLine();
                    System.out.println("Ingrese datos recolectados: ");
                    int datos = teclado.nextInt();
                    System.out.println("Ingrese energía necesaria: ");
                    int energia = teclado.nextInt();
                    teclado.nextLine();
                    ModuloVuelo mv = new ModuloVuelo(id, nombre, estado, activo, costo, instrumento, datos, energia);
                    simulador.agregarComponente(mv);
                } else if (tipo == 2) {
                    System.out.println("Ingrese capacidad de descarga: ");
                    int capacidad = teclado.nextInt();
                    System.out.println("Ingrese energía necesaria: ");
                    int energia = teclado.nextInt();
                    teclado.nextLine();
                    ModuloTierra mt = new ModuloTierra(id, nombre, estado, activo, costo, capacidad, energia);
                    simulador.agregarComponente(mt);
                } else if (tipo == 3) {
                    System.out.println("Ingrese energía generada: ");
                    int energia = teclado.nextInt();
                    teclado.nextLine();
                    ModuloEnergia me = new ModuloEnergia(id, nombre, estado, activo, costo, energia);
                    simulador.agregarComponente(me);
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Se ingresó un tipo de dato incorrecto. Intente de nuevo.");
                teclado.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println("¿Desea agregar otro módulo? (si/no)");
            rpta = teclado.nextLine();
        }

        System.out.println("\n--- Resumen del Simulador Quetzal ---");
        System.out.println("Costo total de construcción: " + simulador.consultarCosto());
        System.out.println("Total descargado (Módulos Tierra): " + simulador.totalDescargado());
        System.out.println("\nLista de Módulos:");
        System.out.println(simulador.listarModulos());
    }
}