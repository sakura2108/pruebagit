/* 6.	Realice y represente mediante diagrama de flujo y pseudocódigo un 
 * algoritmo que lea los nombres y las edades de diez alumnos, y que los datos se 
 * almacenen en dos vectores, y con base en esto se determine el nombre del alumno con la
 *  edad mayor del arreglo.

 */
import java.util.Scanner;
public class AlumnosMayorEdad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int edad=0; int mayor=0; 
		String nombre=""; 
		
		String nombres[]= new String[3];
		int edades[]= new int[3];
		
       for(int i=0; i<3 ; i++) {
    	   System.out.println("Ingrese el nombre del alumno ["+i+1+"] ");
    	   nombres[i]= sc.nextLine();			   
       }
       
       for(int i=0; i<3 ; i++) {
    	   System.out.println("Ingrese la edad  del alumno  "+ nombres[i]);
    	   edades[i]= sc.nextInt();
    			    			   
       }
       
       for(int i=0; i<3 ; i++) {
    	   if(edades[i]>mayor) {
    		   mayor= edades[i];
    		   nombre= nombres[i];
    	   }
    	   
    	   }
    	   System.out.println("El alumno " +nombre+"  que tiene " +mayor+ " de edad");
       
       
	}

}
