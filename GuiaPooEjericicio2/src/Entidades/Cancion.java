/*2 - Desarrollar  una clase Can c i o n  c o n  l o s  s i g u i e n t e s
a tri b u t o s : tit u l o y a u t o r.
Se  de b e r á́ d e fi n ir a d e m á s d o s c o n s tr u c t o r e s :
 u n o
v a c í o q u e i n i c i a l i z a e l tit u l o y e l a u t o r 
y o tr o q u e
r e c i b a c o m o p a r á m e tr o s e l tit u l o y e l a u t o r d e l a
c a n c i ó n .
S e d e b e r á n a d e m á s d e fi n ir l o s m é t o d o s g e tt e r s y
s e tt e r s c o rr e s p o n d i e n t e s  */

package Entidades;
import java.util.Scanner;
public class Cancion {

	private String titulo;
	private String autor;
	
	public void cancion() {	
	}
	
	public void cancion(String titulo , String cancion) {
		this.titulo=titulo;
		this.autor=autor;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
  public void crearCancion() {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Ingrese el nombre de la cancion:");
	  this.setTitulo(sc.nextLine());
	  
	  System.out.println("Ingrese el nombre del autor:");
	  this.setAutor(sc.nextLine());
  }
  
  public void mostrarCancion() {
	  System.out.println("El nombre de la cancion es :"+titulo);
	  System.out.println("El nombre del autor es :"+autor);
  }
	
}
