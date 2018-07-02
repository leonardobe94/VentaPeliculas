package datos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelos.Pelicula;

public class BaseDatos {

	private Connection conexion = null;
	private String servidor = "localhost";
	private String database = "ventapeliculas";
	private String usuario = "root";
	private String password = "1111";
	private String url = "";

	public BaseDatos() {
		try {
			this.servidor = servidor;
			this.database = database;
			Class.forName("com.mysql.jdbc.Driver");
			url = "jdbc:mysql://" + servidor + "/" + database;
			conexion = DriverManager.getConnection(url, usuario, password);
			System.out.println("Conexion a Base de Datos " + url + " . . . . .Ok");
		} catch (SQLException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		}
	}

	public BaseDatos(String servidor, String database, String usuario, String password) {
		try {
			this.servidor = servidor;
			this.database = database;
			Class.forName("com.mysql.jdbc.Driver");
			url = "jdbc:mysql://" + servidor + "/" + database;
			conexion = DriverManager.getConnection(url, usuario, password);
			System.out.println("Conexion a Base de Datos " + url + " . . . . .Ok");
		} catch (SQLException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		}
	}

	public Connection getConexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			url = "jdbc:mysql://" + servidor + "/" + database;
			conexion = DriverManager.getConnection(url, usuario, password);
			System.out.println("Conexion a Base de Datos " + url + " . . . . .Ok");
		} catch (SQLException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		}
		return conexion;
	}

	public void cerrarConexion() {
		try {
			conexion.close();
			System.out.println("Cerrando conexion a " + url + " . . . . . Ok");
		} catch (SQLException ex) {
			System.out.println(ex);
		}
		conexion = null;
	}

	/*
	 * obtenerPeliculas Consulta las peliculas desde base de datos recibe como
	 * parametro un sql para guardar en una lista las peliculas
	 * 
	 */
	public LinkedList<Pelicula> obtenerPelicula(String sql) {
		LinkedList<Pelicula> peliculas = new LinkedList<>();
		try {
			Statement s = conexion.createStatement();
			ResultSet rs = s.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("idPeliculas");
				String titulo = rs.getString("Titulo");
				String director = rs.getString("Director");
				int fechaEstreno=rs.getInt("FechaEstreno");
				String categoria=rs.getString("Categorias");
				String resumen=rs.getString("Resumen");
				String url = rs.getString("Url");
				Pelicula pelicula = new Pelicula(titulo, director, fechaEstreno, categoria, resumen,id, url);
				peliculas.add(pelicula);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return peliculas;
	}

	/*
	 * insertar Recibe c recibe como parametro un sql para guardar en una lista
	 * las peliculas
	 * 
	 */
	public void insertar(String titulo, String director, int fechaEstreno, String categoria,
			String resumen, String url) {
		String sql = "insert into peliculas (Titulo,Director,FechaEstreno,Categorias,Resumen,Url) "
				+ "values (?,?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement = conexion.prepareStatement(sql);
			preparedStatement.setString(1, titulo);
			preparedStatement.setString(2, director);
			preparedStatement.setInt(3, fechaEstreno);
			preparedStatement.setString(4, categoria);
			preparedStatement.setString(5, resumen);
			preparedStatement.setString(6, url);
			preparedStatement.executeUpdate();
			// inserta dato

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public Pelicula buscarPelicula (String titulo){
			String ficha = "select Titulo, Director, FechaEstreno, Categorias, Resumen, Url from peliculas where Titulo ='"+titulo+"'";
						Pelicula pelicula =null;
			try {
				Statement s = conexion.createStatement();
				ResultSet rs = s.executeQuery(ficha);
				
				while (rs.next()) {
					String titulo2 = rs.getString("Titulo");
					String director = rs.getString("Director");
					int fechaEstreno=rs.getInt("FechaEstreno");
					String categoria=rs.getString("Categorias");
					String resumen=rs.getString("Resumen");
					String url = rs.getString("Url");
					pelicula = new Pelicula(titulo2, director, fechaEstreno, categoria, resumen, url);
					
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	return pelicula;
		}
	
}
