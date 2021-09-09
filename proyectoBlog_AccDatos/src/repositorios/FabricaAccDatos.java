package repositorios;

/**
 *
 * @author Equipo 4
 */
public class FabricaAccDatos {
    
    public static BaseRepository getRepositorio(String tipo) {
        if (tipo.equals("Comentario")) {
            return new RepComentario();
        }
        else if (tipo.equals("Estado")) {
            return new RepEstado();
        }
        else if (tipo.equals("Municipio")){
            return new RepMunicipio();
        }
        else if (tipo.equals("Post")) {
            return new RepPost();
        }
        else {
            return new RepUser();
        }
    }
    
}
