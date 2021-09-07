/*
 * Clase Anclado
 * Esta clase representa a un Post anclado, al cual no se le pueden hacer
 * comentarios.
 */
package objetos;

import java.util.Date;

/**
 *
 * @author Equipo 4
 * Esta clase hereda de Post
 */
public class Anclado extends Post{

    public Anclado() {
        
    }

    public Anclado(Date fechaHoraCreacion, String titulo, String contenido) {
        super(fechaHoraCreacion, titulo, contenido);
    }
    
}
