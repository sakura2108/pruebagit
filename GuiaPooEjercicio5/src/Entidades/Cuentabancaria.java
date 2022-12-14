/*
5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. 
Los métodos a realizar son: 
• Constructor por defecto(vacío) y constructor con DNI, saldo, número de cuenta e interés.
 • Agregar los métodos getters y setters correspondientes 
• Método para crear un objeto Cuenta, pidiéndole los datos al usuario.
 • Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual
 • Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo actual en 0. 
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%. 
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
 • Método consultarDatos(): permitirá mostrar todos los datos de la cuenta

 */

package Entidades;

import java.util.Scanner;

public class Cuentabancaria {
 	
	private String nombre;
	private String apellido;
	private int numcuenta;
	private int DNI;
	private double saldoactual;
	private double cantidad;

	
	public void cuentabancaria( double cantidad,int numcuenta, int DNI, double saldoactual, String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;	
		this.numcuenta=numcuenta;
		this.DNI=DNI;
		this.saldoactual=saldoactual;
	

        if (cantidad<0){/// para verificar que no ingresen 0 por cantidad
            this.cantidad=0;

        }else{
            this.cantidad = cantidad;
        }
    }

	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void cuentabancaria() {
	}

	public int getNumcuenta() {
		return numcuenta;
	}

	public void setNumcuenta(int numcuenta) {
		this.numcuenta = numcuenta;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public double getSaldoactual() {
		return saldoactual;
	}

	public void setSaldoactual(double saldoactual) {
		this.saldoactual = saldoactual;
	}
	
	

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public void crearCuenta() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese su nombre:");
		this.setNombre(sc.nextLine());
		
		System.out.println("Ingrese su apellido:");
		this.setApellido(sc.nextLine());
		
		System.out.println("Ingrese su DNI sin puntos , espacios ,guion ni comas :");
		this.setDNI(sc.nextInt());
		
		System.out.println("Ingrese el numero de cuenta sin puntos , espacios ,guion ni comas :");
		this.setNumcuenta(sc.nextInt());
	
	}
	
	public void ingresoSaldo() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese el saldo total que tiene su cuenta actualmente:");
		this.setSaldoactual(sc.nextInt());
		
		System.out.println("Indique la cantidad de dinero que desea ingresar a la cuenta:");
		this.setCantidad(sc.nextDouble());
		
	    
		if(this.cantidad<0) {
			System.out.println("Monto ingresado incorrecto, ingrese otro monto");	
			
		}else if(cantidad>0){
		        this.cantidad += cantidad;
		
		double nuevoSaldo;
		this.saldoactual=this.saldoactual+this.cantidad;
		nuevoSaldo=this.saldoactual+this.cantidad;
		
		}
	}
	public double retirar(double retiro){
		Scanner sc= new Scanner(System.in);
		System.out.println("Indique el dinero que desae retirar:");
		retiro=sc.nextDouble();
		
		if(this.saldoactual<retiro) {
			System.out.println("Saldo actual insuficiente. Intente con un monto menor");
			return 0;
		}else {
			
			this.saldoactual=this.saldoactual-retiro;
		double nuevoSaldo;
		nuevoSaldo=this.saldoactual-retiro;
              return nuevoSaldo;		
			}
        
		}
	
	
	public double extraccionRapido(double extraccion) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Indique el dinero que desae retirar mediante una extraccion rapida, solo puede sacar un 20% de su saldo:");
		extraccion=sc.nextDouble();
		
		double nuevoSaldo;
	
		if(extraccion>saldoactual*0.20 ) {
			System.out.println("Excede el monto permitido , intente con un monto menor");
			return 0;
		}else {
			System.out.println("Monto a retirar permitido");
			this.saldoactual=this.saldoactual-extraccion;
			
			nuevoSaldo=this.saldoactual-extraccion;
	              return nuevoSaldo;	
			
			//System.out.println("Monto a retirar :"+extraccion);
			
		}
		
		}
	
	public void consultarSaldo() {
		
		System.out.println("Tu saldo actual "+saldoactual);
	}
	
	public void mostrarDatos() {
		System.out.println("El nombre del titular es :"+nombre);
		System.out.println("El apellido del titular es :"+apellido);
		System.out.println("El DNI del titular es :"+DNI);
		System.out.println("El numero de cuenta es :"+numcuenta);
	
	
		
	}
	} 
	

