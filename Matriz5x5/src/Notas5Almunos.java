import java.util.Scanner;
public class Notas5Almunos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int suma=0;
		int promedio=0;
		int alumnos[][]= new int [5][5]; 
		
	for(int i=0; i<5; i++) {
		for(int j=0; j<5; j++) {
			System.out.println("Ingrese la nota del  ["+j+1+"] alumno  ["+i+1+"] ");
			alumnos[i][j]= sc.nextInt();
			
					
		}
	}
	
	for(int i=0; i<5; i++){
		for(int j=0; j<5; j++) {
			suma = suma+ alumnos[i][j] ;
	}
 promedio= suma/ alumnos [0].length; //// el lenght es para saber cuantas filas tiene 
 System.out.println("El promedio de los alumnos es :"+promedio);
}

	
	}
}

	