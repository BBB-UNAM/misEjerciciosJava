//Import java.util.Scanner;

import java.util.Scanner;

public class scanerExample{

	public static void main(String args[]){

			ScannerName pedirNombre = new ScannerName();

	        pedirNombre.escanearDelTeclado();

	}

}

class ScannerName {

	public void escanearDelTeclado(){

		System.out .println("Ingrese su nombre: ");

		Scanner cadenaEntrada = new Scanner(System.in);

		String myName = cadenaEntrada.nextLine();

		System.out.println("El nombre ingresado fue: " + myName);
		
		cadenaEntrada.close();
	}
}