/*5.	Realice un diagrama de flujo que represente el algoritmo para determinar si una matriz
 *  es de tipo diagonal: es una matriz cuadrada en la cual todos sus elementos son cero,
 *  excepto los electos de la diagonal principal. */


import java.util.Scanner;
public class VerSiEsUnaMatrizDiagonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int filas=0; int columnas =0; 
		
		System.out.println("Ingrese la cantidad de filas que desee que tenga la matriz");
        filas= sc.nextInt();
        
        System.out.println("Ingrese la cantidad de filas que desee que tenga la matriz");
        columnas= sc.nextInt();
		
        int matriz[][]= new int [filas] [columnas];
       
     
        //////////////// Llenado de la matriz ///////

        if(  filas==columnas ) { /// para verificar si es una matriz cuadrada
        for(int i=0; i<filas; i++) {
        	for(int j=0; j<columnas;j++) {
        		System.out.println("Ingrese los valores de la matriz  :["+i+1+"] ["+j+1+"] ");
        		matriz[i][j]= sc.nextInt();	
        		
        	}
       } 	
        
////////impimir matriz
       System.out.println("La matriz  es :");
       for (int i=0;i<filas;i++){
               for (int j=0;j<columnas;j++) {
                   System.out.print(matriz[i][j] + " ");
               }
               System.out.println("");        
       }
       int c=0; // C es el contador
       
       for(int i=0; i<filas; i++) {
       	for(int j=0; j<columnas;j++) {
       		if( i==j ) { 
       			 if(matriz[i][j]==0) {
       				 c=c+1; // es para incrementar la variable 
       			 }else {
       				if(matriz[i][j]!=0) {
       					c= c+1;
       			 }
       		 }
       
       	  }
       	 }
      }
       
       
       if(c==0) {
    	   System.out.println("La matriz es diagoonal");
       }else {
    	   System.out.println("La matriz no es de tipo diagonal");
       }
               
             }else {
        	   System.out.println("La matriz no es cuadrada");
        }
        
        
     	
        }	
	
	}


