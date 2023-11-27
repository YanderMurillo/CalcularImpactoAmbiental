//El cálculo de la huella de carbono  implica considerar diversas fuentes de emisiones de gases de efecto invernadero  A continuación, te proporciono una descripción general de algunos factores comunes
//kgCO2 = kWh * consumo promedio
package v.calcularimpactoambiental;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author muril
 */
// Interfaz ImpactoEcologico
interface ImpactoEcologico {
    double obtenerImpactoEcologico();
}

// Clase Edificio
class Edificio implements ImpactoEcologico {
    private int consumoAnual;
    
    public Edificio(int consumoAnual) {
        this.consumoAnual = consumoAnual;
    }

    // Método estático para crear un Edificio con entrada de usuario
    public static Edificio crearEdificioDesdeConsola() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("Edificio:");
        System.out.print("Ingrese el consumo kilovatios-hora (kWh) Anual del edificio: ");
        int consumoAnual = scanner.nextInt();

        return new Edificio(consumoAnual);
    }
    // Implementación del método obtenerImpactoEcologico
    @Override
    public double obtenerImpactoEcologico() {
        // Cálculo del impacto ecológico del carbono para un edificio
        return consumoAnual * 0.5;
    }
}
// Clase Auto
class Auto implements ImpactoEcologico {
    private String modelo;
    private int consumoDeCombustible;
    private int distanciaRecorrida;

    public Auto(String modelo, int consumoDeCombustible, int distanciaRecorrida) {
        this.modelo = modelo;
        this.consumoDeCombustible = consumoDeCombustible;
        this.distanciaRecorrida = distanciaRecorrida;
    }
    // Método estático para crear un Auto con entrada de usuario
    public static Auto crearAutoDesdeConsola() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("Auto:");
        System.out.print("Ingrese el modelo del auto: ");
        String modelo = scanner.next();

        System.out.print("Ingrese el consumo de combustible del auto (L): ");
        int consumoDeCombustible = scanner.nextInt();
        
        System.out.print("Ingrese la distancia recorrida (KM): ");
        int distanciaRecorrida = scanner.nextInt();

        return new Auto(modelo, consumoDeCombustible, distanciaRecorrida);
    }
    // Implementación del método obtenerImpactoEcologico
    @Override
    public double obtenerImpactoEcologico() {
        // Cálculo del impacto ecológico del carbono para un auto
        return consumoDeCombustible * 2.3 * distanciaRecorrida;
    }
}
// Clase Bicicleta
class Bicicleta implements ImpactoEcologico {
    private String tipo;

    public Bicicleta(String tipo) {
        this.tipo = tipo;
    }

    // Método estático para crear una Bicicleta con entrada de usuario
    public static Bicicleta crearBicicletaDesdeConsola() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("Bicicleta:");
        System.out.print("Ingrese el tipo de bicicleta: ");
        String tipo = scanner.next();
        return new Bicicleta(tipo);

    }
    // Implementación del método obtenerImpactoEcologico
    @Override
    public double obtenerImpactoEcologico() {
        // Cálculo del impacto ecológico del carbono para una bicicleta
        return 0;
    }
}
// Clase principal
public class CalcularImpactoAmbiental {

    public static void main(String[] args) {
        // Crear objetos de cada clase con entrada de usuario
        Edificio edificio = Edificio.crearEdificioDesdeConsola();
        Auto auto = Auto.crearAutoDesdeConsola();
        Bicicleta bicicleta = Bicicleta.crearBicicletaDesdeConsola();

        // Crear ArrayList de objetos que implementan ImpactoEcologico
        ArrayList<ImpactoEcologico> listaImpactoEcologico = new ArrayList<>();
        listaImpactoEcologico.add(edificio);
        listaImpactoEcologico.add(auto);
        listaImpactoEcologico.add(bicicleta);

        // Iterar a través de la lista e imprimir información
        for (ImpactoEcologico objeto : listaImpactoEcologico) {
            System.out.println("Tipo: " + objeto.getClass().getSimpleName());
            System.out.println("Impacto ecológico del carbono (kgCO2​): " + objeto.obtenerImpactoEcologico());
            System.out.println("------------------------");
        }
    }
}
