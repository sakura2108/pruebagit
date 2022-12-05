package Entidades;
import java.util.Scanner;
public class Agenda {

	private String nombre;
	private int numero;
	private int DNI; 
	
	
	public Agenda(String nombre, int numero, int DNI) {
		this.nombre=nombre;
		this.numero=numero;
		this.DNI=DNI;
	}
	
	public Agenda() {	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}
	
	public void crearContacto() {
		Scanner sc= new Scanner(System.in);
         System.out.println("Ingrese el nombre del contacto: ");
         this.setNombre(sc.nextLine());
         
         System.out.println("Ingrese el numero del contacto: ");
         this.setNumero(sc.nextInt());
		
         System.out.println("Ingrese el D.N.I sin puntos, espacios , ni comas: ");
         this.setDNI(sc.nextInt());
	}
	
	public void mostrarContacto(){
		System.out.println("El nombre del contacto es: "+nombre);
		System.out.println("El numero del contacto es: "+numero);
		System.out.println("El DNI del contacto es: "+DNI);
	}
}
