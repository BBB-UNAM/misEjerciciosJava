import java.util.*;
//agregue un comentario
public class ejercicioFactorial{
	public static void main(String args[]){

		Contador factorial =  new Contador();

		Scanner miNumero = new Scanner(System.in);

		System.out.print("Ingrese un número: ");

        int numFact = miNumero.nextInt();

		System.out.println(" El factorila del mnùmero ingresado es: " + factorial.factorial(numFact));
	    
	    miNumero.close();
	}
}

class Contador{
	public int factorial(int numero){
		int cont = 0;
		//int B = 1;
		for(int i = numero; i > 1 ; i--) {
			if(cont == 0){
				cont = i * (i-1);
			} else {
				cont = cont * (i-1);
			}
			//acumnuladorMulti = i * (i-1);
		}
		return cont;
	}
}
