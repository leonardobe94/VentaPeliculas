package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicios.IServicios;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void procesarRespuesta(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//Buscar pelicula
    	/**
    	 *  String titulo = request.getParameter("titulo");
    	 */
    	//Recopilar respuesta
    	/**
    	 * servicios = new Servicios();
    	 * Pelicula pelicula = servicios.buscarPelicula("titulo"); 
    	 */
    	//Salir
    	/**
    	*RequestDispatcher view = request.getRequestDispatcher("Pelicula.jsp");
		*view.forward(request, response);
		*/
    	//Modificar pelicula
    	/**
    	 *   String titulo = request.getParameter("Titulo");
    	 *   String director = request.getParameter("Director"); 
    	 *   int fechaEstreno = request.getParameter("Fecha");
    	 *   String categoria = request.getParameter("Categoria");
    	 *   String resumen = request.getParameter("Resumen");
    	 *   servicios.buscarPelicula(servicios.buscarPelicula(titulo));  
    	 *  pelicula = new Pelicula(Object pelicula, String titulo, String director, int fechaEstreno, String categoria, String resumen);
    	 */
    	//Recopilar respuesta
    	/**
    	 * servicios = Servicios;
    	 * pelicula = servicios.modificarPelicula("pelicula"); 
    	 */
    	//Salir
    	/**
    	*RequestDispatcher view = request.getRequestDispatcher("Pelicula.jsp");
		*view.forward(request, response);
		*/
    	//Alta pelicula
    	/** pelicula = new Pelicula(Object pelicula, String titulo, String director, int fechaEstreno, String categoria, String resumen);
    	 * pelicula = request.getParameter("pelicula");
    	 */
    	//Recopilar respuesta
    	/**
    	 * servicios = Servicios;
    	 * 
    	 * pelicula = servicios.añadirPelicula("pelicula"); 
    	 */
    	//Salir
    	/**
    	*RequestDispatcher view = request.getRequestDispatcher("Pelicula.jsp");
		*view.forward(request, response);
		*/
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		procesarRespuesta(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		procesarRespuesta(request, response);	
	}

}
