package datos;

public interface IDatos<T> {
	
	
	public void añadirPelicula(T pelicula);
	
	public void modificarPelicula (T pelicula, String titulo, String director, int fechaEstreno, String categoria, String resumen);
	
	public T buscarPelicula(String titulo);
	
	public void borrarPelicula (T pelicula);
	
	public void recorrerLista (T lista);
	
}
