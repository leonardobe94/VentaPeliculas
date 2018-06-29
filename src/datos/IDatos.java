package datos;

public interface IDatos<T> {
	

	
	public void añadirPelicula(String titulo, String director, int fechaEstreno, String categoria, String resumen, int id, String url);

	
	public void modificarPelicula (T pelicula, String titulo, String director, int fechaEstreno, String categoria, String resumen);
	
	public T buscarPelicula(String titulo);
	
	public void borrarPelicula (T pelicula);
	
	public void recorrerLista ();
	
}
