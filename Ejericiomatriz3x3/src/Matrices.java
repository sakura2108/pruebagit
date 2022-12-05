import java.util.Arrays;  
import java.util.Scanner;
public class Matrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        
    /* NO BORRAR ///////////////////////
		int[][] matriz= {
				{10,15,18,19,21},
				{5,25,37,41,15}
				
		};
				for(int[]fila : matriz) {
				
					System.out.println();
				
			
		    for(int z: fila) {
		    
		    	System.out.print(  z + " ");
		    	
		    }
				
				}			 
	
		
		
		*/
		
		int [][] alumnos =new int[2][2];
		
		for(int i=0; i<5; i++) {
			for (int j=0;j<5; j++) {
			
			System.out.println("Introduce las notas de los alumnos: ["+i+1+"]["+j+1+"] ");
			alumnos[i][j]= sc.nextInt();
			
		}
	}
		for(int[] filas:alumnos) {
			
			System.out.println();
			
			for(int z: filas){
		
			System.out.println("alumnos" +alumnos);
			}
			
		}
		
	}
        
}
        
	

