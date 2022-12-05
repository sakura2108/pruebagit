package Entidades;
import java.util.Scanner;
import java.util.Scanner;

public class Persona {
	
private String nombre;
private char sexo;
private int edad;
private float peso;
private float altura;

public Persona (String nombre, char sexo, int edad, float peso, float altura){
  this.nombre=nombre;
  this.sexo=sexo;
  this.edad=edad;
  this.peso=peso;
  this.altura=altura;
}

public Persona(){	
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public char getSexo() {
	return sexo;
}

public void setSexo(char sexo) {
	this.sexo = sexo;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public float getPeso() {
	return peso;
}

public void setPeso(float peso) {
	this.peso = peso;
}

public float getAltura() {
	return altura;
}

public void setAltura(float altura) {
	this.altura = altura;
}

public void crearpersona() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Ingrese el nombre de la persona: ");
	this.setNombre(sc.nextLine());
	

	System.out.println("Ingrese el sexo de " +nombre+" : ");
	System.out.println("(F)- Si es femenino ");
	System.out.println("(M)- Si es masculino");
	System.out.println("(O)- Si es otro");
	this.setSexo(sc.next().charAt(0));
	
	if(this.sexo=='F' || this.sexo=='M' || this.sexo=='O') {
		if(this.sexo=='F') {
			System.out.println("Femenino");
		}
		
		if(this.sexo=='M') {
			System.out.println("Masculino");
		}
		if(this.sexo=='O') {
			System.out.println("Otro");
		}
		
	}else {
		System.out.println("Opcion ingresada incorrecta , intente nuevamente.");
	}
	
	System.out.println("Ingrese la edad de "+nombre+" :");
	this.setEdad(sc.nextInt());
	
	System.out.println("Ingrese el peso de "+nombre+" :");
	this.setPeso(sc.nextFloat());
	
	System.out.println("Ingrese la altura de "+nombre+" : ");
	this.setAltura(sc.nextFloat());
}

public float calcularIMC() {
	float IMC;
	IMC= this.peso/(this.altura)*2;
	if(IMC<20) {
		System.out.println("Esta por debejo de su peso , deberia ir al medico");
	}else if(IMC==20|| IMC==25) {
		System.out.println("Esta en un peso ideal");
	}else if(IMC>25){
		System.out.println("Tiene sobrepeso , deberia comer mas saludable y hacer ejercicio");
	}
	return IMC;
}


public void esMayordeEdad() {

	if(this.edad>=18) {
		System.out.println("Es mayor de edad");
	}else {
		System.out.println("Es menor de edad");
	}
	
}

public void mostrar() {
	System.out.println("El nombre de la persona es: "+nombre);
	System.out.println("La edad es: "+edad);
	System.out.println("El peso  es: "+peso);
	//System.out.println("El IMC de la persona es: "+calcularIMC());
	System.out.println("La altura es: "+altura);
}
}