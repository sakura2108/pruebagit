/* Realice un algoritmo para determinar si una persona puede votar con base en su edad
en las próximas elecciones. Construya el diagrama de flujo y el pseudocódigo.
 */


	import java.util.Scanner;

	public class Edad {

	    public static void main(String[] args) {
	    	
	    
	        Scanner sc = new Scanner(System.in);
	        
	        int edad;
	        
	        System.out.println("Ingrese su edad :");
	        edad =sc.nextInt();
	        
	         if(edad>=18)
	         
	         System.out.println("Usted es mayor de edad, puede votar en estas elecciones. ");
	         
	         else
	        	 System.out.println("Usted es menor de edad , no puede votar en estas elecciones.");
	         	        
	       }
	}
	        