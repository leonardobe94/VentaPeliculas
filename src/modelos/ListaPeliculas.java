package modelos;

import java.util.LinkedList;

import datos.IDatos;

public class ListaPeliculas implements IDatos{
	private LinkedList<Pelicula> listaPelis;
	
	public ListaPeliculas (){
		
	}
	
	public ListaPeliculas (LinkedList<Pelicula> listaPelis){
		this.listaPelis = listaPelis;
	}
	
	public void setListaPelis (LinkedList<Pelicula> listaPelis){
		this.listaPelis = listaPelis;
	}
	
	public LinkedList<Pelicula> getListaPelis (){
		return listaPelis;
	}

	@Override
	public void añadirPelicula(Object pelicula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object modificarPelicula(Object pelicula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object buscarPelicula(String titulo) {
	//crear metodo buscar pelicula
		Pelicula pelicula = null;
		for (int i=0; i<listaPelis.size(); i++){
			if (titulo.equalsIgnoreCase(listaPelis.get(i).getTitulo())){
				pelicula = listaPelis.get(i);
			}
			
		}
		return pelicula;
	}

	@Override
	public void borrarPelicula(Object pelicula) {
		//crear metodo para borrar pelicula y comprobar
		listaPelis.remove(pelicula);
		/*boolean comprobar =  listaPelis.contains(pelicula);
		if (comprobar = false){
			System.out.println("La peli esta borrada");
		}
		*/
	}

	@Override
	public void recorrerLista(Object lista) {
		// TODO Auto-generated method stub
		
	}

}
