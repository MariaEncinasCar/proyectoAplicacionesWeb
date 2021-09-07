/*
 * Clase Post
 * Esta clase representa un post en el blog.
 */
package objetos;

import java.util.Date;

/**
 *
 * @author Equipo 4
 */
public class Post {
    private Date fechaHoraCreacion;
    private String titulo;
    private String contenido;
    private Date fechaHoraEdicion;

    public Post() {
        
    }

    public Post(Date fechaHoraCreacion, String titulo, String contenido) {
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.titulo = titulo;
        this.contenido = contenido;
    }

    /**
     * Recupera la fecha y hora de creación del post
     * @return fecha y hora creación del post
     */
    public Date getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    /**
     * Define la fecha y hora de creación del post
     * @param fechaHoraCreacion Fecha y hora de creación del post
     */
    public void setFechaHoraCreacion(Date fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    /**
     * Recupera el título del post
     * @return título del post
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define el título del post
     * @param titulo Título del post
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Recupera el contenido del post
     * @return contenido del post
     */
    public String getContenido() {
        return contenido;
    }

   /**
     * Define el contenido del post
     * @param contenido Contenido del post
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * Recupera la fecha y hora de edición del post
     * @return fecha y hora de edición del post
     */
    public Date getFechaHoraEdicion() {
        return fechaHoraEdicion;
    }

    /**
     * Define la fecha y hora de edición del post
     * @param fechaHoraEdicion Fecha y hora de edición del post
     */
    public void setFechaHoraEdicion(Date fechaHoraEdicion) {
        this.fechaHoraEdicion = fechaHoraEdicion;
    }
    
    
}
