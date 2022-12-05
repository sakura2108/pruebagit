/*Cierta empresa proporciona un bono mensual a sus trabajadores, el cual puede ser por
su antigüedad o bien por el monto de su sueldo (el que sea mayor), de la siguiente
forma:
Cuando la antigüedad es mayor a 2 años pero menor a 5, se otorga 20 % de su sueldo;
cuando es de 5 años o más, 30 %. Ahora bien, el bono por concepto de sueldo, si éste es
menor a $1000, se da 25 % de éste, cuando éste es mayor a $1000, pero menor o igual a
$3500, se otorga 15% de su sueldo, para más de $3500. 10%. Realice el algoritmo
correspondiente para calcular los dos tipos de bono, asignando el mayor y represéntelo
con un diagrama de flujo y pseudocódigo */


import java.util.Scanner;
public class BonoTrabajadores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float sueldo;
		float antiguedad;
		double bono= 0;
		double bono2=0;
		
		System.out.println("Ingrese su antiguedad: ");
		antiguedad= sc.nextFloat();
		
		System.out.println("Ingrese el valor de su sueldo: ");
		sueldo= sc.nextFloat();
		
		
		
		if (antiguedad>2 || antiguedad <=5 ){
			bono= sueldo*0.20;
		}
		
		else if (antiguedad>=5) { 
		bono= sueldo*0.30;
		
		}else if(sueldo <1000) {
			bono2= sueldo*0.25;
			
			} 
		else if(sueldo>1000 || sueldo>=3500 );{
				 bono2= sueldo *0.15;
				 
			} if  (sueldo>=3500) {
			bono2= sueldo*0.10;
		}
			
		 
		
		System.out.println("El bono por antiguedad es de : $"+bono );
		System.out.println("El bono en base del salario es de  : $"+ bono2);
		
		if (bono>bono2) {
			System.out.println("Tu bono correspondiente es de : $"+bono);
		} else {
			System.out.println("Tu bono correspondiente es de : $"+bono2);
		}
	}

}
