/*Una compañía de seguros para autos ofrece dos tipos de póliza: cobertura amplia (A) y 
daños a terceros (B). Para el plan A, la cuota base es de $1,200, y para el B, de $950. A
ambos planes se les carga 10% del costo si la persona que conduce tiene por hábito
beber alcohol, 5% si utiliza lentes, 5% si padece alguna enfermedad –como de- ficiencia
cardiaca o diabetes–, y si tiene más de 40 años, se le carga 20%, de lo contrario sólo
10%. Todos estos cargos se realizan sobre el costo base. Realice diagrama de flujo que
represente el algoritmo para determinar cuánto le cuesta a una persona contratar una
póliza. */

import java.util.Scanner;
public class PolizaDeSeguros {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int poliza;
		int toma=0;
		int  lentes=0;
		int edad=0 ;
		int enfermedad=0; 
		double costo;
		float cuotafinal=0;
		float base=0;
		double total;
		
		System.out.println(" Ingrese el tipo de poliza que quiera adquirir :" );
		
		System.out.println("1- Cobertura Amplia(A)   ó 2- Daños a terceros (B) ");
	poliza= sc.nextInt();
		
		
		
		 if(poliza==1 || poliza==2){
	}
		 
		  
		else{
			System.out.println(" Opcion incorrecta , intente de nuevo dentro los parametros establecidos ."); } 
		  	
		if(poliza==1){
		  System.out.println("Eligio la poliza tipo A , el costo de base es de : $1200" )  ;}
		  else if (poliza==2) { 
		  System.out.println("Eligio la polizs B , el costo base es de :$950 "  );  }
		  
		  if(poliza==1){
		      base=1200;	      
		  } else{
		      base=950;
		  }
		  	 costo= base;
		  if(poliza==1 || poliza==2){
		       System.out.println("A continuacion se le haran una serie de preguntas , marque segun corresponda.");
		       
		    System.out.println("Tiene como habito ingerir bebidas alcoholicas?. Marque (1) si ,la respuesta es SI, (2) si la respues es No : ");
		toma= sc.nextInt();
		 }
		 
		   if  (toma==1){
		      total= costo +(base*0.10);
		      System.out.println("Utiliza lentes para ver ? Marque (1) si ,la respuesta es SI, (2) si la respues es No");
		  	lentes= sc.nextInt();
		  }
		  
		
		//System.out.println("Utiliza lentes para ver ? Marque (1) si ,la respuesta es SI, (2) si la respues es No");
	//lentes= sc.nextInt();
		
		if(lentes==1){
			total= costo +(base*0.05);
			System.out.println("Padece de alguna enfermedad como deficiencia cardiaca o diabetes?. Marque (1) si ,la respuesta es SI, (2) si la respues es No");  
			 enfermedad = sc.nextInt();
		}
		 
		 
		if(enfermedad==1) {
			total= costo+ (base*0.05);
			System.out.println("Ingrese su edad:");
			edad= sc.nextInt();
			
		}
		
		
	    if(edad>40) {
	    	total= costo+(base*0.20);
	    } else{
	    	total= costo+(base*0.10);
	    	System.out.println("El precio final de la poliza es de :" +total);
			
	    }
	
		  // System.out.println("El precio final de la poliza es de :" +total);
		
	

		
	 }
		
	}	
		
	
	
