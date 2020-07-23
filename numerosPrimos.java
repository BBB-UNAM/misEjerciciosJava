public class numerosPrimos{//clase principal de nuestro codigo
	public static void main(String args[]){ //metodo principal
		//Declaramos e instanciamos el objeto miNumeroPrimo
		calculoNumeros miNumeroPrimo =  new calculoNumeros();

		//Buclue para iterar ente una serie de numeros del 1 al 100 y verificar se trata de un numero primo
		for(int i = 0; i < 100; i++){
			//linea de codigo para mostrar en pantalla si un numero es o no es primo utilizando el metodo numeroPrimo
			System.out.println(miNumeroPrimo.numeroPrimo(i));
		}

	}
}
//clase que contiene el metodo que calcula si un numero es primo o no
class calculoNumeros{
	//Metodo que calcula si el numero es primo o no
	public String numeroPrimo(int numero){
		int operador = numero; //variable temporal que guarda en numero a ser evaluado
		int contadorDiviciones = 1; //contador que acumula las veces que el modulo de una divicion es igual a cero
		while(numero > 1){	
			//System.out.println(operador % numero);
			if(operador % numero == 0){ //bucle que evalua si el modulo de una divicion es igual a cera
				contadorDiviciones++;
			}
			numero--;
			//System.out.println(numero);	
		}
        //System.out.println(contadorDiviciones);
        if(contadorDiviciones == 2){ //si el numero es primo, se regresa un String
        	return "el numero " + operador +" es Primo";
        }
        //si el numero no es primo se regresa otro String
		return "el numero " + operador +" NO es Primo";
	}
}