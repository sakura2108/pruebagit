/* Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para
determinar cuánto dinero ahorra una persona en un año si considera que cada semana
ahorra 15% de su sueldo (considere cuatro semanas por mes y que no cambia el
sueldo). */

import java.util.Scanner;
public class Ahorro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

float sueldo;


System.out.println("Ingrese el  monto del sueldo :");
sueldo=sc.nextFloat();

double semana= sueldo*0.15;   // semana= ahorro por semana
double mes= semana*4;        //mes= ahorro por mes    
double año= semana*12;       // año0 ahorro por año

System.out.println("El ahorro semnanal es de : " +semana);
System.out.println("El ahorro mensual es de : " +mes);
System.out.println("El ahorro anual es de: "+ año);



		
	}

}
