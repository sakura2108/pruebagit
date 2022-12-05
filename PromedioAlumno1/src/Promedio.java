/* Realice el diagrama de flujo y pseudocódigo que representen el algoritmo para
determinar el promedio que obtendrá un alumno considerando que realiza tres
exámenes, de los cuales el primero y el segundo tienen una ponderación de 25%,
mientras que el tercero de 50%*/

import java.util.Scanner;
public class Promedio{

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		float exam1;
		float exam2;
		float exam3;
		
	
		
		System.out.println("Ingrese la nota del primer examen :");
		exam1= sc.nextFloat();
		
		System.out.println("Ingrese la nota del segundo examen :");
		exam2= sc.nextFloat();
		
		
		System.out.println("Ingrese la nota del tercer examen :");
		exam3= sc.nextFloat();
		
		System.out.println("El valor del primer examen es :"+ exam1*0.25);
		
		System.out.println("El valor del segundo examen es:"+exam2*0.25);
			
		System.out.println("El valor del tercer examen es :"+ exam3*0.50);
		
		double prom = exam1 * 0.25 + exam2 *0.25 + exam3*0.50;
		
		
		System.out.println("El promedio final  del alumno es :"+prom);
		
		
		
	}

}
