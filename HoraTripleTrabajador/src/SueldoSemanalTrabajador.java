/*Realice un algoritmo que permita determinar el sueldo semanal de un trabajador con
base en las horas trabajadas y el pago por hora, considerando que a partir de la hora
número 41 y hasta la 45, cada hora se le paga el doble, de la hora 46 a la 50, el triple, y
que trabajar más de 50 horas no está permitido. Represente el algoritmo mediante el
diagrama de flujo y el pseudocódigo.*/


import java.util.Scanner;
public class SueldoSemanalTrabajador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float horas;
		float sueldo=0;
		float pago_hora;
	
		
		System.out.println("Ingrese el valor de la hora de trabajo");
		pago_hora= sc.nextFloat();
		
		System.out.println("Ingrese la cantidad  de horas de trabajadas");
		horas= sc.nextFloat();
		
		
		if(horas>= 41 || horas<45) {
			sueldo= horas*(pago_hora*2);
		}
		
		if(horas>= 46 || horas<50) {
			sueldo= horas*(pago_hora*3);
		}
		

		if(horas>50) {
			System.out.println("No esta permitido trabajas mas de 50 horas semanales");
		}else {
		
		System.out.println("Su sueldo semanal es de :$"+sueldo);
		}
	}
		

}
