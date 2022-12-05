package entidad;

public class main {

	public static void main(String[] args) {
		
		Animal perro = new Animal() ; 
		
		perro.raza= "Mestizo";
		perro.color= "Marron";
		perro.nombre= "Nicole";
		
		System.out.println(perro);
		 
		perro.mover();
		perro.dormir();
		perro.comiendo();
	}

}
