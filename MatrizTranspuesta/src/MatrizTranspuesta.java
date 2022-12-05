/*obtener la matriz transpuesta de cualquier matriz de orden M x N. */

import java.util.Scanner;
public class MatrizTranspuesta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int filas =0; int columnas=0; 
		
		System.out.println("Ingrese la cantidad de filas que desee que tenga la matriz");
        filas= sc.nextInt();
        
        System.out.println("Ingrese la cantidad de filas que desee que tenga la matriz");
        columnas= sc.nextInt();
        
        
        int matriz1[][]= new int [filas] [columnas];
        int matriz2[][]= new int [columnas] [filas];
        
        for(int i=0; i<filas; i++) {
        	for(int j=0; j<columnas; j++) {
        		System.out.println("Ingrese los valores de la matriz :["+i+1+"] ["+j+1+"] ");
        		matriz1[i][j]= sc.nextInt();
                matriz2[j][i]=matriz1[i][j];  		
        	} 	
        }
        //////// impimir matriz
        System.out.println("La matriz original es :");
        for (int i=0;i<filas;i++){
                for (int j=0;j<columnas;j++) {
                    System.out.print(matriz1[i][j] + " ");
                }
                System.out.println("");        
        }
        
        System.out.println("La matriz transpuesta es :");
        for (int j=0;j<columnas;j++){
                for (int i=0;i<filas;i++) {
                    System.out.print(matriz2[j][i] + " ");
                }
                System.out.println("");             
        }
        
	}

}
