/* 2.	Realice y represente mediante un diagrama de flujo el algoritmo para obtener el producto de dos matrices de orden M x N y P x Q.

*/
import java.util.Scanner;
public class SumaMatrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
int filas =0; int columnas=0; 
		
		System.out.println("Ingrese la cantidad de filas que desee que tenga la matriz");
        filas= sc.nextInt();
        
        System.out.println("Ingrese la cantidad de filas que desee que tenga la matriz");
        columnas= sc.nextInt();
		
        int matriz1[][]= new int [filas] [columnas];
        int matriz2[][]= new int [filas] [columnas];
        int matrizresultado[][]= new int [filas] [columnas];
        
        for(int i=0; i<filas; i++) {
        	for(int j=0; j<columnas;j++) {
        		System.out.println("Ingrese los valores de la matriz 1 :["+i+1+"] ["+j+1+"] ");
        		matriz1[i][j]= sc.nextInt();	
        		
        	}
       } 	
        
        
        for(int i=0; i<filas; i++) {
        	for(int j=0; j<columnas;j++) {
        		System.out.println("Ingrese los valores de la matriz 2 :["+i+1+"] ["+j+1+"] ");
        		matriz2[i][j]= sc.nextInt();

        	}
        }
        
        
        for(int i=0; i<filas; i++) {
        	for(int j=0; j<columnas;j++) {
        		
        		matrizresultado[i][j]= matriz1[i][j]+ matriz2[i][j];

        	}
        }
       //////imprimir las matrices
        System.out.println("La primera matriz es :");
        for (int i=0;i<filas;i++){
                for (int j=0;j<columnas;j++) {
                    System.out.print(matriz1[i][j] + " ");
                }
                System.out.println("");
               
        }
        /////////////////////////////////////////////////////////
        
        System.out.println("La segunda matriz es :");
        for (int i=0;i<filas;i++){
                for (int j=0;j<columnas;j++) {
                    System.out.print(matriz2[i][j] + " ");
                }
                System.out.println("");
               
        }
        /////////////////////////////////////////////////////////
        
        System.out.println("Matriz resultante de la suma :");
        for (int i=0;i<filas;i++){
                for (int j=0;j<columnas;j++) {
                    System.out.print(matrizresultado[i][j] + " ");
                }
                System.out.println("");
               
        }
	}

}
