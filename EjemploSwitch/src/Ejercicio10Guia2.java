/* 10. Represente un algoritmo mediante un diagrama de flujo y el pseudocódigo para
determinar a qué lugar podrá ir de vacaciones una persona, considerando que la línea de
autobuses “La tortuga” cobra por kilómetro recorrido.
 Se debe considerar el costo del
pasaje tanto de ida, como de vuelta; los datos que se conocen y que son fijos son:
México, 750 km; P.V., 800 km; Acapulco, 1200 km, y Cancún, 1800 km. También se debe
considerar la posibilidad de tener que quedarse en casa.
*/ 

import java.util.Scanner;
public class Ejercicio10Guia2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	float mexico=750;
	float pv= 800;
	float acapulco=1200;
	float cancun=1800;
	float  dinero;
	float total=0;
	int destino;
	float km;
	

	System.out.println("Ingrese el precio por km:");
	km= sc.nextFloat();
	
	System.out.println("Ingrese el dinero que tiene para viajar:");
	dinero= sc.nextFloat();
	
	System.out.println("Indique el destino al cual desea vijar ;");
	System.out.println("(1)-Mexico");
	System.out.println("(2)-P.V");	
	System.out.println("(3)-Acapulco");
	System.out.println("(4)-Cancun");
	destino= sc.nextInt();
	
	if(destino==1 || destino ==2 || destino==3 || destino==4 ) {
	
	switch (destino) {
    case 1: {
        
        total= mexico*(km*2);
       
        break;
    }
    case 2: {
    	total= pv*(km*2);
        break;
    }
    case 3:{
    	total= acapulco*(km*2);
    	break;
    }
    case 4: {
    	total= cancun*(km*2);
        break;
    }
}
        
	    if(dinero>=total) {
			System.out.println("Cuenta con el dinero suficientepara vijar.¡ Disfrute su viaje!");
			System.out.println("---------------------------------------------------------------");
			float sobra=0;
			sobra= dinero-total;
			System.out.println("El dinero que tiene poara viajar es de :$"+dinero);
			System.out.println("El costo total del viaje es de :$"+total);
			System.out.println("Le sobra la siguiente cantidad de dinero :$"+ sobra);
	    }
	    else {
			System.out.println("El dinero destinado para el viaje no es suficiente .Mejor quedese en su casa ahorra ,para las proximas vacaciones");
		}
		    
	    
 }
 else {
   	 System.out.println("La opcion no es correcta");
   	 }
     
    
}

}
