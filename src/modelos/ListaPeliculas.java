package modelos;

import java.util.LinkedList;

import datos.IDatos;

public class  ListaPeliculas<T> implements IDatos<T>{
	public boolean comprobar = false;
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
	//crear metodo buscar pelicula
		Pelicula pelicula = null;
		for (int i=0; i<listaPelis.size(); i++){
			if (titulo.equalsIgnoreCase(listaPelis.get(i).getTitulo())){
				pelicula = listaPelis.get(i);
			}
			
		}
		return (T)pelicula;
	}

	@Override
	public void borrarPelicula(Object pelicula) {
		//crear metodo para borrar pelicula y comprobar
		listaPelis.remove(pelicula);
		boolean comprobar =  listaPelis.contains(pelicula);
		/*if (comprobar = false){
			System.out.println("La peli esta borrada");
		}
		*/
	}

	@Override
	public void recorrerLista(T lista) {
		// TODO Auto-generated method stub
		
	}
	


}