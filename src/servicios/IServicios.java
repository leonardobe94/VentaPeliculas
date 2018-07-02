package servicios;

import java.util.LinkedList;

import modelos.Pelicula;

public interface IServicios<T> {

	public void añadirPelicula(T pelicula, String titulo, String director, int fechaEstreno, String categoria, String resumen, String url);

	
	public void modificarPelicula (T pelicula, String titulo, String director, int fechaEstreno, String categoria, String resumen);
	
	public T buscarPelicula(String titulo);
	
	public LinkedList <Pelicula> mostrarCategorias (String categorias);
	
	public void borrarPelicula (T pelicula);
	
	public void recorrerLista (T lista);
	
	public LinkedList<Pelicula> getListaPelis();
}
