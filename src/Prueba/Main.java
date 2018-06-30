package Prueba;

import java.util.LinkedList;

import com.mysql.jdbc.Connection;

import datos.BaseDatos;
import modelos.ListaPeliculas;
import modelos.Pelicula;
import servicios.IServicios;
import servicios.Servicios;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ListaPeliculas<Pelicula> lista = new ListaPeliculas<>();		
	//	lista.recorrerLista();
		
		//BaseDatos conexion = new BaseDatos();
		//conexion.insertar("Harry Potter", "carlos", 2010, "Ficcion", "guay", "/path");
		
		IServicios<Pelicula> servicios = new Servicios();
		LinkedList<Pelicula> lista = servicios.getListaPelis();
		System.out.println(lista.get(0).getTitulo());
		
	}

}
