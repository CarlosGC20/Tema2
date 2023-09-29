import java.util.Scanner;
public class Ejercicio17 {
	public static void main(String[] args) { 
		int total = 0;
		int kms;
		int contador = 0;
		double promedio;
		// Método que se encarga de leer los datos
 
		Scanner lector = new Scanner(System.in);
 
		System.out.println("Introduzca los Kms o -1 para terminar :");
		// Solicito ingreso de kms recorridos
 
		kms = lector.nextInt();
 
		System.out.println("Introduzca la carga de combustible :");
		// Solicito la cantidad de combustible
		while(kms!=-1){
 
			total = total + kms;
			contador = contador + 1;
 
			System.out.println("Introduzca los Kms o -1 para terminar :");
 
			kms = lector.nextInt();
 
		}
 		lector.close();
 
	}
}