/* 3.	Realice y represente mediante diagrama de flujo y pseudocódigo un algoritmo que lea
 *  un arreglo de M filas y N columnas y que calcule la suma de los elementos de la diagonal principal. */
import java.util.Scanner;
public class MatrizDiagonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
 int filas =0; int columnas=0; int suma=0;
		
		System.out.println("Ingrese la cantidad de filas que desee que tenga la matriz");
        filas= sc.nextInt();
        
        System.out.println("Ingrese la cantidad de filas que desee que tenga la matriz");
        columnas= sc.nextInt();
		
        int matriz[][]= new int [filas] [columnas];
     
       
        
        for(int i=0; i<filas; i++) {
        	for(int j=0; j<columnas;j++) {
        		System.out.println("Ingrese los valores de la matriz  :["+i+1+"] ["+j+1+"] ");
        		matriz[i][j]= sc.nextInt();	
        		
        	}
       } 	
        
        /////////////suma de la matriz//////////
        
        for(int i=0; i<filas; i++) {
        	for(int j=0; j<columnas;j++) { 
        	
             if(i==j) {    		
  
               		suma= suma + matriz[i][j];
             }
        	}
        }
        
       //////imprimir las matrices
        System.out.println("La matriz ingresada es :");
        for (int i=0;i<filas;i++){
                for (int j=0;j<columnas;j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("");
               
        }
       
        System.out.println("El resultado de la suma de la diagonal principal de la matriz es  :"+ suma);
        
       
        
        
	}




	}


