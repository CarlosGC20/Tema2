import java.util.Scanner;
public class Ejercicio15 {
	public static void main(String[] args) {
	Scanner lector = new Scanner (System.in);
	System.out.print("Dime una temperatura en grados Celsius: ");
	double gradosCelsius = lector.nextDouble();
	double gradosKelvin = 273.15 + gradosCelsius;
	double gradosFahrenheit = 9 / 5. * gradosCelsius + 32;
	double gradosRankine = 9 / 5. * (gradosCelsius + 273.15);
	double gradosReaumur = 4 / 5. * gradosCelsius;
	System.out.println(gradosCelsius + " grados Celsius equivalen a:");
	System.out.println(gradosKelvin + " grados Kelvin");
	System.out.println(gradosFahrenheit  + " grados Fahrenheit ");
	System.out.println( gradosRankine + " grados Rankine");
	System.out.println(gradosReaumur + " grados Reaumur");
	}
}