
/**
 * Lista de libro de una biblioteca
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaLibros
{
   
    Libro primero;

    /**
     * Constructor for objects of class ListaNodos
     */
    public ListaLibros()
    {
       
        primero = null;
    }

   
    // Completar los metodos
    
    // Incluye un nuevo libro en la lista
    public void pon( Libro valor){
    	valor.siguiente=primero;
    	this.primero=valor;
        
    }
    
    public boolean estaVacia(){
       return ( primero == null );    
        
    }
    
    // Devuelve un libro que es eliminado de la lista o null si no exite
    public Libro quitar ( int id ) {
    	Libro l = primero;
        if (primero == null) return null;
        if (l.id == id) {
        	this.primero = primero.siguiente;
        	return l;
        }
        Libro l2 =l.siguiente;
        if(l2 == null) return null;
        do {
        	if(l2.id == id) {
        		l.siguiente = l2.siguiente;
        		return l2;
        	}
        	l=l.siguiente;
        	l2=l2.siguiente;
        }while(l2 != null);
        return null;
    }
   
    // Devuelve el id del libro o -1 si no esta
    public int buscarId ( String titulo ){       
    Libro aux = primero;
    while(aux != null) {
    	if (aux.titulo.equals(titulo))
    		return aux.id;
    	aux = aux.siguiente;
    }
    return -1;
   }
    // Muestra los libros almacenados
    public void verCatalogo (){
    	Libro aux = this.primero;
    	while(aux != null) {
    		System.out.println(aux);
    		aux=aux.siguiente;
    	}
    }
         
    

}
