package datos;

public interface IDatos<T> {
	
	
	public void a�adirPelicula(T pelicula);
	
	public T modificarPelicula (T pelicula);
	
	public T buscarPelicula(String titulo);
	
	public void borrarPelicula (T pelicula);
	
	public void recorrerLista (T lista);
	
}
