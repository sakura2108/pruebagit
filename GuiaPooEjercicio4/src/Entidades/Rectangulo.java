/*4- Crear una clase Rectángulo que contenga atributos
privados de base y altura.
La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario.
También incluirá un método para calcular el área del
rectángulo.
Se deberán además definir los métodos getters, setters y
constructores correspondientes.
Área= base * altura. */

package Entidades;

import java.util.Scanner;

public class Rectangulo {
	
	private float base;
    private float altura;	

    public void rectangulo(float base, float altura) {
    	this.base= base;
    	this.altura=altura;
    }
    
    public void rectangulo (){	
    }

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
    
    public void crearRectangulo(){
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Ingrese el valor de la base del triangulo:");
    	this.setBase(sc.nextFloat());
    	
    	System.out.println("Ingrese el valor de la altura del triangulo:");
    	this.setAltura(sc.nextFloat());
    }
    
    public void calculoArea(){
    	float area;
    	area=this.base*this.altura;
    	System.out.println("El area del triangulo es :" +area);
    	
    }
   
    
}
