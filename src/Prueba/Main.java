package Prueba;

import java.util.LinkedList;

import datos.BaseDatos;
import modelos.ListaPeliculas;
import modelos.Pelicula;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaPeliculas<Pelicula> lista = new ListaPeliculas<>();		
		lista.recorrerLista();
		
		//BaseDatos conexion = new BaseDatos();
		//conexion.insertar("Harry Potter", "carlos", 2010, "Ficcion", "guay", "/path");
	}

}
