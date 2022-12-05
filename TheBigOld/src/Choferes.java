/*Ejemplo 3.7
La empresa de transportes “The Big Old” cuenta con N choferes, de los cuales se conoce 
su nombre y los kilómetros que conducen durante cada día de la semana, esa información 
se guarda en un arreglo de N x 6. Se requiere un algoritmo que capture esa información y
 genere un vector con el total de kilómetros que recorrió cada chofer durante la semana. 
 Realice el algoritmo y represéntelo mediante el diagrama de flujo y el pseudocódigo. 
 Al final se debe presentar un reporte donde se muestre el nombre del chofer, los kilómetros 
 recorridos cada día y el total de éstos, tal y como se muestra en la figura 3.1.
 */                
import java.util.Scanner;
public class Choferes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombre=""; 
		int km=0; int choferes=0; 
		
		final int DIAS_LABORABLES = 6;
        final String[] DIAS = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        
        
		System.out.println("Ingrese la cantidad de choferes :");
		choferes=sc.nextInt();
		
		String nombres[]= new String[choferes];
	
		for(int i=0; i<choferes; i++) {
			System.out.println("Ingrese los nombres del chofer ["+i+1+"]");
			   	   nombres[i]= sc.nextLine();	
			   	sc.nextLine();
		}
	    

		for(int i=0; i<diaslaborales; i++) {
			System.out.println("Ingrese los kilometros recorridos por el chofer"+nombres[i] );
			   	   km[i]= sc.nextInt();	
			   	
		}
		
		
		////impresiones ///
		 for(int i=0; i<choferes; i++){
		        System.out.print(" "+nombres[i]);
		        } 
////////////////////////////  dias	
		 for(int i=0; i<6; i++){
		        System.out.print(" "+DIAS[i]);
		        } 
		
	}
	}
		

