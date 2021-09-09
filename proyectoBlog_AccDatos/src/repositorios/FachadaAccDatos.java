package repositorios;

/**
 *
 * @author Equipo 4
 */
public class FachadaAccDatos {
    
    private RepComentario rc;
    private RepEstado re;
    private RepMunicipio rm;
    private RepPost rp;
    private RepUser ru;

    public RepComentario getRc() {
        if (rc != null) {
            return rc;
        } else {
            rc = new RepComentario();
            return rc;
        }
    }

    public RepEstado getRe() {
        if (re != null) {
            return re;
        } else {
            re = new RepEstado();
            return re;
        }
    }

    public RepMunicipio getRm() {
        if (rm != null) {
            return rm;
        } else {
            rm = new RepMunicipio();
            return rm;
        }
    }

    public RepPost getRp() {
        if (rp != null) {
            return rp;
        } else {
            rp = new RepPost();
            return rp;
        }
    }

    public RepUser getRu() {
        if (ru != null) {
            return ru;
        } else {
            ru = new RepUser();
            return ru;
        }
    }
    
}
