//El cálculo de la huella de carbono  implica considerar diversas fuentes de emisiones de gases de efecto invernadero  A continuación, te proporciono una descripción general de algunos factores comunes
//kgCO2 = kWh * consumo promedio
package v.calcularimpactoambiental;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author muril
 */
interface ImpactoEcologico {
    double obtenerImpactoEcologico();
}
// Clase Edificio
class Edificio  {
    private int consumoAnual;
    
    public Edificio(int consumoAnual) {
        this.consumoAnual = consumoAnual;
    }

}
// Clase Auto
class Auto  {
    private String modelo;
    private int consumoDeCombustible;
    private int distanciaRecorrida;

    public Auto(String modelo, int consumoDeCombustible, int distanciaRecorrida) {
        this.modelo = modelo;
        this.consumoDeCombustible = consumoDeCombustible;
        this.distanciaRecorrida = distanciaRecorrida;
    }
    
}
// Clase Bicicleta
class Bicicleta  {
    private String tipo;

    public Bicicleta(String tipo) {
        this.tipo = tipo;
    }

    
}
public class CalcularImpactoAmbiental {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
