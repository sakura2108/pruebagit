package Entidades;
import java.util.Scanner;
public class Cafetera {

	private int capacidad_max;
	private int capacidad_actual;

	public  Cafetera (int capacidad_max , int capacidad_actual) {
		
		this.capacidad_max=capacidad_max;
		this.capacidad_actual=capacidad_actual;
	}
	
	public Cafetera() {	
	}

	public int getCapacidad_max() {
		return capacidad_max;
	}

	public void setCapacidad_max(int capacidad_max) {
		this.capacidad_max = capacidad_max;
	}

	public int getCapacidad_actual() {
		return capacidad_actual;
	}

	public void setCapacidad_actual(int capacidad_actual) {
		this.capacidad_actual = capacidad_actual;
	}
	
	public void Llenarcafetera() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese la capacidad maxima de la cafetera:");
		this.setCapacidad_max(sc.nextInt());

		System.out.println("Ingrese la cantidad de cafe que tiene la cafetera:");
		this.setCapacidad_actual(sc.nextInt());
		
		if(this.capacidad_actual==this.capacidad_max) {
			System.out.println("La cafetera esta llena");
		}else {
			System.out.println("Hay que agregar mas cafe.");
		}	
	}
	
	public void Llenartaza(int capacidad_taza) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese la cantidad de ml que posee la taza:");
		capacidad_taza=sc.nextInt();
		 if(capacidad_taza> this.capacidad_actual) {
			 int resta_taza= this.capacidad_actual-capacidad_taza;
			 System.out.println("No hay suficiente cafe en la cafetera , hay que cargar");
			 System.out.println("La taza le falta llenar: "+resta_taza+ "ml");
			
		 }else {
			 this.capacidad_actual-=capacidad_taza;
			 System.out.println("La taza se lleno");
			 
		 }
	}
	
	public void Vaciarcafetera(){
		this.capacidad_actual=0;
		}
	
	public void Agregarcafe(int rellenar) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese la cantidad necesaria de cafe:");
		rellenar=sc.nextInt();
		
		this.capacidad_actual += rellenar;	
		if(this.capacidad_actual==this.capacidad_max) {
			System.out.println("cafetera llena");
		}
	}
	
	public void mostrarcafetera() {
		System.out.println("la capacidad maxima de la cafetera es: "+capacidad_max);
		System.out.println("la capacidad actual  de la cafetera es: "+capacidad_actual);
		
	}
}

	
	

