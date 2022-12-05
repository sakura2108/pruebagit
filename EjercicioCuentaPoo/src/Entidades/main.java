package Entidades;

public class main {

	public static void main(String[] args) {
		


        Cuenta cuenta1 = new Cuenta("Fernando");

        cuenta1.ingresar(300);

        cuenta1.retirar(100);


        System.out.println(cuenta1);



    }
}
