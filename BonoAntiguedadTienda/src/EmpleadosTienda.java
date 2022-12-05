/* Se les dará un bono por antigüedad a los empleados de una tienda. Si tienen un año, se
les dará $100; si tienen 2 años, $200, y así sucesivamente hasta los 5 años. Para los que
tengan más de 5, el bono será de $1000. Realice un algoritmo y represéntelo mediante el
diagrama de flujo y el pseudocódigo que permita determinar el bono que recibirá un
trabajador */

import java.util.Scanner;
public class EmpleadosTienda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bono=0;
		int antiguedad=0;
        
		System.out.println("Indique cuantos años tiene de antiguedad en la empresa segun la opcion correspondiente:");
		
		System.out.println("(1)-Un año de antiguedad");
		System.out.println("(2)-Dos años de antiguedad");	
		System.out.println("(3)-Tres años de antiguedad");
		System.out.println("(4)-Cuatro años de antiguedad");
		System.out.println("(5)-Cinco años de antiguedad");
		System.out.println("(6)-Mas de cinco años de antiguedad");
		antiguedad= sc.nextInt();
		
		switch (antiguedad) {
		
		case 1:{
			bono=100;
	 break;		
		}
		
		case 2: {
			bono=200;
			break;
		}
		case 3: {
			bono=300;
			break;
		}
		case 4: {
			bono=400;
			break;
		}
		case 5: {
			bono=500;
			break;
		}
		case 6: {
			bono =1000;
			break;
		}
	      
		}
		  System.out.println("Su bono es de :"+bono);
	}

}
