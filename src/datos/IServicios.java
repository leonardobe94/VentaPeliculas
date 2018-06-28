package datos;

public interface IServicios<T> {
public void aņadirPelicula(T pelicula);
	
	public T modificarPelicula (T pelicula);
	
	public T buscarPelicula(String titulo);
	
	public void borrarPelicula (T pelicula);
	
	public void recorrerLista (T lista);
}
