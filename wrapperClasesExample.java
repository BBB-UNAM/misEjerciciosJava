public class wrapperClasesExample{

	public static void main (String args[]){
		System.out.println("Esto es un ejemplo de Wrapper Clases");
		System.out.println(" ");

        
		wrapperClases ejemplos = new wrapperClases();  //Declaramos en instanciamos en el geeo memry el objeto ejemplos de tipo wrapperClases
		ejemplos.imprimirejemplo(); //llamamos al metodo imprimirejemplo del objeto ejemplos
	}
	
}
//creamos una clase llamada wrapperClases
class wrapperClases{
	int i = 12345; // declaramos una variable de tipo int con la que trabajaremos
    
    public void imprimirejemplo(){ //Declaramos un metodo que es el que se encargara de realizar el ejercicio

    		String a = Integer.toString(this.i); //va variable i es cconbertida a una cadena de strings
	        String b = Integer.toBinaryString(this.i);// la variable i es cobertida a una cadena de strings que muestran el valor binario de la variable
	        String c = Integer.toHexString(this.i); //la variable i es cobertida a una cadena de strings que muestran el valor hexadecimal de la variable
	        String d = "45"; //se declara una variable con una cadena de dos Strings

	        int e = Integer.parseInt(d); //se comvirtio la cadena de String a una variable de tipo int

	        System.out.println("El valor de i en forma de String es: " + a);
	        System.out.println("El valor de i en forma binaria es " + b);
	        System.out.println("El valor de i en forma Hexadecimal es:  " + c);
	        System.out.println(d);
	        System.out.println("El valor de D mas 5 es: " + (d + 5));
    }

	/*String a = Integer.toString(i);
	String b = Integer.toBinaryString(i);
	String c = Integer.toHexString(i);
	String d = "45"

	int e = Integer.parseInt(d);

	System.out.println("El valor de i en forma de String es: " + a);
	System.out.println("El valor de i en forma binaria es " + b);
	System.out.println("El valor de i en forma Hexadecimal es:  " + c);
	System.out.println(d);
	System.out.println("El valor de D mas 5 es: " d + 5);*/
}