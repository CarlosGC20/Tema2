import java.util.Scanner;
public class Ejercicio16 {
 
static Scanner entrada=new Scanner(System.in);
 
	public static void main(String[] args) {
		double euros=introducirEuros();
		String moneda=introducirMoneda();
		double cambio=cambiarMoneda(moneda, euros);
		imprimir(cambio);
	}
 
	public static double introducirEuros() {
		System.out.println("Introduce una cantidad de euros");
		double euros=entrada.nextDouble();
		return euros;
	}
 
	public static String introducirMoneda() {
		System.out.println("Introduce el tipo de moneda");
		String moneda=entrada.next();
		System.out.println("La moneda introducida es "+moneda);
		return moneda;
		}
 
	public static double cambiarMoneda(String moneda, double euros) {
		String libras, dolares;
		if (moneda==libras)
		double cambio=euros*0.87;
		return cambio;
	}
 
	public static void imprimir(double cambio) {
		System.out.println("El resultado de la conversión es "+cambio);
		return;
	}
}
