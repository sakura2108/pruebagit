package entidad;

public class Animal {

	public String raza ;
	public String color ;
	public String nombre ;
	
	public void mover() {
		System.out.println("Estoy moviendome ");
	}

	public void dormir() {
		System.out.println("Estoy durmiendo ");
	}
	
	public void comiendo()   {
		System.out.println("Estoy cominedo ");
	}
	
    public String toString() {
    	return "Animal{"
    			+ "		perro.raza= \"Mestizo\";"
    			+ "		perro.color= \"Marron\";\r\n"
    			+ "		perro.nombre= \"Nicole\"}";
    }
	
}
