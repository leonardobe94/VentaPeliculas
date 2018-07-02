package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.Pelicula;
import servicios.IServicios;
import servicios.Servicios;

/**
 * Servlet implementation class Videoclub
 */
@WebServlet("/Videoclub")
public class Videoclub extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IServicios servicios;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Videoclub() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void procesarRespuesta(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Esta en el servlet");
		String titulo = request.getParameter("query");
		String tipoAccion = request.getParameter("accion");
		System.out.println("tipoAccion: "+tipoAccion);
		if(tipoAccion.equals("buscarPeli")){
			Pelicula pelicula = buscarPelicula(titulo);
			request.setAttribute("pelicula", pelicula);
			System.out.println(pelicula.toString());
		    RequestDispatcher view = request.getRequestDispatcher("/Pelicula.jsp");
		    view.forward(request,response);
		}
		// mostrar imagenes en principal
		/*
		 * request.setAttribute("paises", op.Listado()); RequestDispatcher view
		 * = request.getRequestDispatcher("/listado.jsp"); view.forward(request,
		 * response);
		 */
		
		
		servicios = new Servicios();
		LinkedList<Pelicula> lista = servicios.getListaPelis();				
		request.setAttribute("listado", lista);
		System.out.println(lista.get(0).getDirector());		
		RequestDispatcher view = request.getRequestDispatcher("Principal.jsp");
		view.forward(request, response);
		
		
		

		// Buscar pelicula
		
		 Pelicula pelicula = (Pelicula) servicios.buscarPelicula(titulo);
		 System.out.println(pelicula.toString());
		 //String titulo = request.getParameter("titulo");
		 
		// Recopilar respuesta
		 
		 
		// Salir
		
		 request.setAttribute("titulo", pelicula);
		 RequestDispatcher ver = request.getRequestDispatcher("Pelicula.jsp"); 
		 ver.forward(request, response);
		 
		// Modificar pelicula
		/**
		 * String titulo = request.getParameter("Titulo"); String director =
		 * request.getParameter("Director"); int fechaEstreno =
		 * request.getParameter("Fecha"); String categoria =
		 * request.getParameter("Categoria"); String resumen =
		 * request.getParameter("Resumen");
		 * servicios.buscarPelicula(servicios.buscarPelicula(titulo)); pelicula
		 * = new Pelicula(Object pelicula, String titulo, String director, int
		 * fechaEstreno, String categoria, String resumen);
		 */
		// Recopilar respuesta
		/**
		 * servicios = Servicios; pelicula =
		 * servicios.modificarPelicula("pelicula");
		 */
		// Salir
		/**
		 * RequestDispatcher view =
		 * request.getRequestDispatcher("Pelicula.jsp"); view.forward(request,
		 * response);
		 */
		// Alta pelicula
		/**
		 * pelicula = new Pelicula(Object pelicula, String titulo, String
		 * director, int fechaEstreno, String categoria, String resumen);
		 * pelicula = request.getParameter("pelicula");
		 */
		// Recopilar respuesta
		/**
		 * servicios = Servicios;
		 * 
		 * pelicula = servicios.añadirPelicula("pelicula");
		 */
		// Salir
		/**
		 * RequestDispatcher view =
		 * request.getRequestDispatcher("Pelicula.jsp"); view.forward(request,
		 * response);
		 */
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		procesarRespuesta(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		procesarRespuesta(request, response);
	}

	public LinkedList<Pelicula> cargarPeliculas() {
		servicios = new Servicios();
		LinkedList<Pelicula> lista = servicios.getListaPelis();
		return lista;
	}
	
	public LinkedList<Pelicula> mostrarCategoria(String categoria) {
		LinkedList<Pelicula> lista = cargarPeliculas();
		LinkedList<Pelicula> listaCat = new LinkedList<Pelicula>();
		for (Pelicula peli: lista){
			if (peli.getCategoria() == categoria){
				listaCat.add(peli);
			}
		}
		return listaCat;
	}
	public Pelicula buscarPelicula(String titulo){
		Servicios servicio = new Servicios();
		return (Pelicula) servicio.buscarPelicula(titulo);
		
		
	}
}
