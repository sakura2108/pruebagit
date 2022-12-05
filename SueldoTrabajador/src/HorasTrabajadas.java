import java.util.Scanner;

/*  Realice un algoritmo para determinar el sueldo semanal de un trabajador con base en
las horas trabajadas y el pago por hora, considerando que después de las 40 horas cada
hora se considera como excedente y se paga el doble. Construya el diagrama de flujo, el
pseudocódigo.
 */
public class HorasTrabajadas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		float sueldo;
		float horas ;
		float pagoxhrs;
	 
		
  System.out.println("Ingrese el valor de la hora de trabajo :");
  pagoxhrs = sc.nextFloat();
  
 
  
 System.out.println("Ingrese la cantidad de horas trabajadas :");
 horas = sc.nextFloat();
 
 
 
 if(horas>=40) {
		
	  sueldo = horas * (pagoxhrs*2);

 
	 System.out.println( "Su sueldo es : $" + sueldo);
		
 } else {
	 
	 sueldo= horas*pagoxhrs;
	 System.out.println("Su sueldo es :$ "+sueldo);
 }
	}

}
