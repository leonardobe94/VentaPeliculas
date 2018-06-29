package modelos;

import java.util.LinkedList;

import datos.BaseDatos;
import datos.IDatos;

public class ListaPeliculas<T> implements IDatos<T> {
	public boolean comprobar = false;
	private LinkedList<Pelicula> listaPelis;

	//No tocar
	public ListaPeliculas() {
		// Creo una conexión para para cargar la base de datos en la lista
		BaseDatos conexion = new BaseDatos();
		// Obtengo todas las peliculas al crear una ListaPeliculas
		this.listaPelis = conexion.obtenerPelicula("select * from peliculas");
	}

	public ListaPeliculas(LinkedList<Pelicula> listaPelis) {
		super();
		this.listaPelis = listaPelis;
	}

	//No tocar
	public LinkedList<Pelicula> getListaPelis() {
		// Creo una conexión para para cargar la base de datos en la lista
		BaseDatos conexion = new BaseDatos();
		// Obtengo todas las peliculas al crear una ListaPeliculas
		this.listaPelis = conexion.obtenerPelicula("select * from peliculas");
		return listaPelis;
	}

	public void setListaPelis(LinkedList<Pelicula> listaPelis) {
		this.listaPelis = listaPelis;
	}

	@Override
	public void a�adirPelicula(String titulo, String director, int fechaEstreno, String categoria,
			String resumen, int id, String url) {
		Pelicula peli = new Pelicula(titulo, director, fechaEstreno, categoria, resumen, id, url);
			listaPelis.add(peli);
	}

	public void a�adirPelicula(T pelicula) {
		// TODO Auto-generated method stub
		if (pelicula instanceof Pelicula) {
			listaPelis.add((Pelicula) pelicula);
		} else {
			System.out.println("Información no válida.");
		}
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
		Pelicula pelicula = null;
		for (int i = 0; i < listaPelis.size(); i++) {
			if (titulo.equalsIgnoreCase(listaPelis.get(i).getTitulo())) {
				pelicula = listaPelis.get(i);
			}
		}
		return (T) pelicula;
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
}