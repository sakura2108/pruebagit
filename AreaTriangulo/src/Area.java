/*Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para obtener
el área de un triángulo.
 */



import java.util.Scanner;
public class Area {
     public static void main(String[] args) {
    	 
    	  Scanner in = new Scanner(System.in); 
        double b,h;
        
        System.out.println("Ingresa base");
        b=sc.nextDouble();
        
        System.out.println("Ingresa altura");
        h=sc.nextDouble();
        
        double area;
        
        area=b*h/2;
        
       System.out.print(area);
     }
}    