package Entidades;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		Libro libro= new Libro();
		
		System.out.println("Ingrese el titulo del libro ");
		String titulo= scan.nextLine();
		
		
		System.out.println("Ingrese el nombre del autor ");
		String autor= scan.nextLine();
		
		
		System.out.println("Ingrese el numero de paginas ");
		int numpag= scan.nextInt();
		
		////// para guardar los valore ingresador
		libro.setTitulo(titulo);
		libro.setAutor(autor);
		libro.setNumpag(numpag);
		
		libro.mostrarlibro();
	}

}
