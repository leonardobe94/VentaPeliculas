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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarPelicula(Object pelicula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recorrerLista(Object lista) {
		// TODO Auto-generated method stub
		
	}

}
