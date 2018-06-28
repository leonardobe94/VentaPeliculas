package servicios;

public interface IServicios<T> {
public void añadirPelicula(T pelicula);
	
	public void modificarPelicula (T pelicula);
	
	public T buscarPelicula(String titulo);
	
	public void borrarPelicula (T pelicula);
	
	public void recorrerLista (T lista);
}
