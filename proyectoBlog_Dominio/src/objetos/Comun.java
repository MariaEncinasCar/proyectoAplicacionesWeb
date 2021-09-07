/*
 * Clase Común
 * Está clase representa a un Post común.
 */
package objetos;

import java.util.Date;

/**
 *
 * @author Equipo 4
 * Esta clase hereda de Post
 */
public class Comun extends Post{

    public Comun() {
        
    }

    public Comun(Date fechaHoraCreacion, String titulo, String contenido) {
        super(fechaHoraCreacion, titulo, contenido);
    }
    
}
