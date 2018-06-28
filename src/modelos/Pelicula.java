package modelos;

public class Pelicula {
	
	private String titulo;
	private String director;
	private int fechaEstreno;
	private String categoria;
	private String resumen;
	private int id;
	private String url;
	
	public Pelicula(){
		
	}
	
	public Pelicula (String titulo, String director, int fechaEstreno, String categoria, String resumen, int id){
		this.titulo = titulo;
		this.director = director;
		this.fechaEstreno = fechaEstreno;
		this.categoria = categoria;
		this.resumen = resumen;
		this.id = id;
	}
	
	public void setTitulo (String titulo){
		this.titulo = titulo;
	}
	
	public String getTitulo (){
		return titulo;
	}
	
	public void setDirector (String director){
		this.director = director;
	}
	
	public String getDirector (){
		return director;
	}
	
	public void setFechaEstreno (int fechaEstreno){
		this.fechaEstreno = fechaEstreno;
	}
	
	public int getFechaEstreno (){
		return fechaEstreno;
	}
	
	public void setCategoria (String categoria){
		this.categoria = categoria;
	}
	
	public String getCategoria (){
		return categoria;
	}
	
	public void setResumen (String resumen){
		this.resumen = resumen;
	}
	
	public String getResumen (){
		return resumen;
	}
	
	public void setId (int id){
		this.id = id;
	}
	
	public int getId (){
		return id;
	}
	
	public void setUrl (String url){
		this.url = url;
	}
	
	public String getUrl(){
		return url;
	}
	
	public String toString (){
		return "Título: "+titulo+" | Director"+director+" | Fecha de estreno: "+fechaEstreno+" | Género: "+categoria+" | Sinopsis: "+resumen;
	}

}
