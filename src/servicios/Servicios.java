package servicios;

import java.util.LinkedList;

import modelos.ListaPeliculas;
import modelos.Pelicula;
/**

* Esta clase es la capa servicios del proyecto

* @author: Miguel Diaz Fernandez

* @version: 02/07/2018/A

* 

*/
public class Servicios implements IServicios {
	//Campos de la capa servicios
	 /**

     * Constructor para la capa

     * @param listaPelis La variable para listar las peliculas

     */
	private ListaPeliculas listaPelis ;

	public Servicios(){
		this.listaPelis=new ListaPeliculas<>();
	}
	public Servicios(ListaPeliculas listaPelis) {
		super();
		this.listaPelis = listaPelis;
	}
	/**

     * Constructor para la capa

     * @param añadirPelicula metodo para añadir las peliculas

     */
	@Override
	public void añadirPelicula(String titulo, String director, int fechaEstreno, String categoria, String resumen, String url) {
		listaPelis.añadirPelicula(titulo, director, fechaEstreno, categoria, resumen, url);

		/**

	     * Constructor para la capa

	     * @param modificarPelicula metodo para modificar las peliculas

	     */
	}
	@Override
	public void modificarPelicula(Object pelicula, String titulo, String director, int fechaEstreno, String categoria, String resumen) {
		listaPelis.modificarPelicula(pelicula, titulo, director, fechaEstreno, categoria, resumen);
		
	}
	/**

     * Constructor para la capa

     * @param buscarPelicula metodo para buscar las peliculas

     */
	public Object buscarPelicula(String titulo) {
		Pelicula pelicula =(Pelicula) listaPelis.buscarPelicula(titulo);
		return pelicula;
	}

	
	public LinkedList <Pelicula> mostrarCategorias (String categorias){
		LinkedList <Pelicula> listaCat = listaPelis.mostrarCategorias(categorias);
		return listaCat;
	}

	/**

    * Constructor para la capa


    * @param borrarPelicula metodo para borrar las peliculas

    */
	@Override
	public void borrarPelicula(Object pelicula) {
		listaPelis.borrarPelicula(pelicula);
		boolean comprobar =  listaPelis.comprobar;
		if (comprobar = false){
			System.out.println("La peli esta borrada");
		}
		
	}
	/**

	    * Constructor para la capa

	    * @param recorrerLista metodo para recorrer la Lista

	    */
	@Override
	public void recorrerLista(Object lista) {
		// TODO Auto-generated method stub
		
	}
	 /**

     * Constructor para la capa

     * @param listaPelis conseguirla para listar las distintas peliculas con el linked

     */
	@Override
	public LinkedList<Pelicula> getListaPelis(){		
		return listaPelis.getListaPelis();
  }
	
}//cierre de la capa de servicios
