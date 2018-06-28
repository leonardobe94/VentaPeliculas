package modelos;

import java.util.LinkedList;

import datos.IDatos;

public class  ListaPeliculas<T> implements IDatos<T>{
	private LinkedList<Pelicula> listaPelis;
	
	public ListaPeliculas (){
		
	}

	@Override
	public void añadirPelicula(T pelicula) {
		// TODO Auto-generated method stub
		if (pelicula instanceof Pelicula){
		listaPelis.add((Pelicula)pelicula);
		}else {
			System.out.println("Información no válida.");
		}
	}

	@Override
	public void modificarPelicula (T pelicula, String titulo, String director, int fechaEstreno, String categoria, String resumen) {
		Pelicula peli = (Pelicula) pelicula;
		peli.setTitulo(titulo);
		peli.setDirector(director);
		peli.setFechaEstreno(fechaEstreno);
		peli.setCategoria(categoria);
		peli.setResumen(resumen);
	}

	@Override
	public T buscarPelicula(String titulo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarPelicula(T pelicula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recorrerLista(T lista) {
		// TODO Auto-generated method stub
		
	}
	


}