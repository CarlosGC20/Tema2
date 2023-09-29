import java.util.Scanner {
	public static void main(String[] args) {
	final double PI = 3.146;  // declarando una constante
	double area;
	// Declaración de variables
	double radio;
	// Configuración del bufer de entrada
	BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
	String entrada;
	// Entrada(radio)
	System.out.println("Escribe el valor del radio: ");
	entrada = bufer.readLine();
	radio = Double.parseDouble(entrada);
	// proceso
	area = PI * radio * radio;
	// Salida(area)
	System.out.println("El área del círculo es: " + area );
    }
    
}