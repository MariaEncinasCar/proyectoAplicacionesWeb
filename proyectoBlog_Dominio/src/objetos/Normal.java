/*
 * Clase Normal
 * Esta clase representa a un usuario normal.
 */
package objetos;

import java.util.Date;

/**
 *
 * @author Equipo 4
 * Esta clase hereda de Usuario
 */
public class Normal extends Usuario{
    
    public Normal() {
        
    }

    public Normal(String nombreCompleto, String correo, String contrasena,
            String telefono, String avatar, String ciudad, 
            Date fechaNacimiento, char genero) {
        
        super.setNombreCompleto(nombreCompleto);
        super.setCorreo(correo);
        super.setContrasena(contrasena);
        super.setTelefono(telefono);
        super.setAvatar(avatar);
        super.setCiudad(ciudad);
        super.setFechaNacimiento(fechaNacimiento);
        super.setGenero(genero);
    }
}
