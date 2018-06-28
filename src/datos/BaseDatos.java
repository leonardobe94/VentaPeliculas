package datos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

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

	public LinkedList<Pelicula> obtenerPelicula(String sql) {
		LinkedList<Pelicula> peliculas = new LinkedList<>();
		try {
			Statement s = conexion.createStatement();
			ResultSet rs = s.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("idPeliculas");
				String titulo = rs.getString("Titulo");
				String director = rs.getString("Director");
				int fechaEstreno = rs.getInt("FechaEstreno");
				String categoria = rs.getString("Categorias");
				String resumen = rs.getString("Resumen");
				String url = rs.getString("Url");
				Pelicula pelicula = new Pelicula(titulo, director, fechaEstreno, categoria, resumen, id, url);
				peliculas.add(pelicula);
				System.out.println("as");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return peliculas;
	}
	
	public boolean insertar(int id,String titulo,String director,int fechaEstreno,String categoria,String resumen,String url){
		String sql="insert into peliculas";
		try {
			PreparedStatement preparedStatement =conexion.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, titulo);
			preparedStatement.setString(3, categoria);
			preparedStatement.setString(4, director);
			preparedStatement.setInt(5, fechaEstreno);
			preparedStatement.setString(6, categoria);
			preparedStatement.setString(7, resumen);
			preparedStatement.setString(8, url);
			preparedStatement.executeUpdate();
			//inserta datos
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	
}
