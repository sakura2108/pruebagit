/*1 - C r e a r u n a c l a s e l l a m a d a L i b r o q u e c o n t e n g a l o s
s i g u i e n t e s a tri b u t o s :
 Tít u l o , Au t o r, n ú m e r o d e
p á g i n a s 
 u n c o n s tr u c t o r c o n t o d o s  l o s  a tri b u t o s
p a s a d o s  p o r p a r á m e tr o  y  u n  c o n s tr u c t o r  v a c í o .
C r e a r u n m é t o d o p a r a c a r g a r u n l i b r o p i d i e n d o l o s
d a t o s a l u s u a ri o y l u e g o i n f o r m a r m e d i a n t e o tr o
m é t o d o e l tít u l o , e l a u t o r d e l l i b r o y e l n u m e r o d e
p á g i n a s . */



package Entidades;

public class Libro {

	private String titulo;
	private String autor;
	private int numpag;
	
	public Libro(String titulo, String autor , int numpag){// constructor pasado por parametros
		this.titulo=titulo;
		this.autor=autor;
		this.numpag=numpag;
		
	}
	
	public Libro() {//Se deja el constructor  vacio para agg los get y set
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

	public int getNumpag() {
		return numpag;
	}

	public void setNumpag(int numpag) {
		this.numpag = numpag;
	}
		
	public void mostrarlibro() {//metodo
		System.out.println("El titulo del libro es: "+titulo);
		System.out.println("El autor del libro es: "+autor);
		System.out.println("la cantidad de numero de paginas del libro es: "+numpag);
	}

}
