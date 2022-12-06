package Entidades;

public class main {

	public static void main(String[] args) {

		Cuentabancaria cuenta = new Cuentabancaria();
		
		cuenta.crearCuenta();
		cuenta.ingresoSaldo();
		cuenta.retirar(0);
		cuenta.extraccionRapido(0);
		cuenta.mostrarDatos();
		cuenta.consultarSaldo();

	}

}



