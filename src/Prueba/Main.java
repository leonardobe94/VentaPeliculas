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

		//Clase obejerio = new Clase();
		Servicios servicio = new Servicios();
		String titulo = "V de Vendetta";
		String director = "frgnjfihj";
		int fechaEstreno = 2006;
		String categoria = "Drama";
		String resumen = "dgnjfkdhytrjkgdfjklgjdfkgnjklh";
		String url = "images/v.jpg";
		
		 servicio.añadirPelicula(titulo, director, fechaEstreno, categoria, resumen, url);
		
		
		
	}

}
