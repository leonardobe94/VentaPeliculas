package modelos;

import java.util.LinkedList;

import datos.BaseDatos;
import datos.IDatos;

public class ListaPeliculas<T> implements IDatos<T> {
	public boolean comprobar = false;
	private LinkedList<Pelicula> listaPelis;

	// No tocar
	public ListaPeliculas() {
		// Creo una conexiÃ³n para para cargar la base de datos en la lista
	}

	public ListaPeliculas(LinkedList<Pelicula> listaPelis) {
		super();
		this.listaPelis = listaPelis;
	}

	// No tocar
	public LinkedList<Pelicula> getListaPelis() {
		// Creo una conexiÃ³n para para cargar la base de datos en la lista
		BaseDatos conexion = new BaseDatos();
		// Obtengo todas las peliculas al crear una ListaPeliculas
		this.listaPelis = conexion.obtenerPelicula("select * from peliculas");
		return listaPelis;
	}

	public void setListaPelis(LinkedList<Pelicula> listaPelis) {
		this.listaPelis = listaPelis;
	}

	@Override

	public void a�adirPelicula(String titulo, String director, int fechaEstreno, String categoria, String resumen,
			String url) {
		Pelicula peli = new Pelicula(titulo, director, fechaEstreno, categoria, resumen, url);

	}

	@Override
	public void modificarPelicula(T pelicula, String titulo, String director, int fechaEstreno, String categoria,
			String resumen) {
		Pelicula peli = (Pelicula) pelicula;
		peli.setTitulo(titulo);
		peli.setDirector(director);
		peli.setFechaEstreno(fechaEstreno);
		peli.setCategoria(categoria);
		peli.setResumen(resumen);
	}

	@Override
	public T buscarPelicula(String titulo) {
		// crear metodo buscar pelicula
		Pelicula pelicula = new Pelicula();
		// Creo una conexiÃ³n para para cargar la base de datos en la lista
		BaseDatos conexion = new BaseDatos();
		// accerder al metodo
		pelicula = conexion.buscarPelicula(titulo);
		return (T) pelicula;// La obligamos a ser objeto

	}

	@Override
	public void borrarPelicula(Object pelicula) {
		// crear metodo para borrar pelicula y comprobar
		listaPelis.remove(pelicula);
		boolean comprobar = listaPelis.contains(pelicula);
		/*
		 * if (comprobar = false){ System.out.println("La peli esta borrada"); }
		 */
	}

	@Override
	public void recorrerLista() {
		// TODO Auto-generated method stub
		for (int i = 0; i < listaPelis.size(); i++) {
			System.out.println(listaPelis.get(i).toString());
		}

	}

	@Override
	public void a�adirPelicula(T pelicula, String titulo, String director, int fechaEstreno, String categoria,
			String resumen, String url) {
		// TODO Auto-generated method stub

	}
}