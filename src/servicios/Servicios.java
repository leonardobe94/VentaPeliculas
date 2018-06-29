package servicios;

import modelos.ListaPeliculas;
import modelos.Pelicula;

public class Servicios implements IServicios {

	private ListaPeliculas listaPelis;
	@Override
	public void añadirPelicula(Object pelicula, String titulo, String director, int fechaEstreno, String categoria, String resumen, String url) {
		listaPelis.añadirPelicula(pelicula, titulo, director, fechaEstreno, categoria, resumen, url);
	}

	@Override
	public void modificarPelicula(Object pelicula, String titulo, String director, int fechaEstreno, String categoria, String resumen) {
		listaPelis.modificarPelicula(pelicula, titulo, director, fechaEstreno, categoria, resumen);
		
	}

	public Object buscarPelicula(String titulo) {
		Pelicula pelicula =(Pelicula) listaPelis.buscarPelicula(titulo);
		return pelicula;
	}

	@Override
	public void borrarPelicula(Object pelicula) {
		listaPelis.borrarPelicula(pelicula);
		boolean comprobar =  listaPelis.comprobar;
		if (comprobar = false){
			System.out.println("La peli esta borrada");
		}
		
	}

	@Override
	public void recorrerLista(Object lista) {
		// TODO Auto-generated method stub
		
	}

	

	

	

}
