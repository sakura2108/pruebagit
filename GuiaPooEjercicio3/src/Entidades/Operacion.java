/* 3- Crear una clase llamada Operación que tenga como atributos privados numero1 y numero2. Crear los siguientes métodos:
 a) Método constructor con todos los atributos pasados por parámetro. 
b) Método constructor vacío. 
c) Métodos get y set. 
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto. 
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
 f) Método restar(): calcular la resta de los números y devolver el resultado al main 
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
 h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el error. Si no, se hace la división y se devuelve el resultado al main
*/


package Entidades;

import java.util.Scanner;

public class Operacion {

	private int numero1;
	private int numero2;
	
	public Operacion (int numero1, int numero2) {
		this.numero1=numero1;
		this.numero2=numero2;
	}
	
	public Operacion() { // constructyor vacion , para ingresar get y set		
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	public void crearOperacion() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Ingrese el valor del numero 1:");
		this.setNumero1(sc.nextInt());
		
		System.out.println("Ingrese el valor del numero 2:");
		this.setNumero2(sc.nextInt());
	}
	
	public int sumar (){
		int suma;
		suma=this.numero1+this.numero2;
		System.out.println("El resultado de la suma es :"+suma);
		return suma;
	}
	
	public int restar (){
		int resta;
		resta=this.numero1-this.numero2;
		System.out.println("El resultado de la resta es :"+resta);
		return resta;
	}
	
	public int multiplicar (){
		int multi;
		if(this.numero1==0 || this.numero2==0) {
			System.out.println("ERROR . No se puede multiplicar por 0");
			return 0;
		}else {
			multi=this.numero1*this.numero2;
			System.out.println("El resultado de la multiplicacion es :"+multi);
			return multi;
		}	
	}
	
	public int dividir (){
		int division;
		if(this.numero1==0 || this.numero2==0) {
			System.out.println("ERROR . No se puede dividir por 0");
			return 0;
		}else {
			division=this.numero1/this.numero2;
			System.out.println("El resultado de la division es :"+division);
			return division;
		}	
	}
	
}
