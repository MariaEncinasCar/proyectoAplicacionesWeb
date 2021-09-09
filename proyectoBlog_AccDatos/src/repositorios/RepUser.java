package repositorios;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import modelos.User;

/**
 *
 * @author Equipo 4
 */
public class RepUser extends BaseRepository<User>{
    private EntityManager em;
    
    @Override
    public void guardar(User entidad) {
        em = this.createEntintyManager();
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        em = this.createEntintyManager();
        em.getTransaction().begin();   
        User a = em.find(User.class, id);
        em.remove(a);
        em.getTransaction().commit();
    }

    @Override
    public void actualizar(User entidad) {
        em.getTransaction().begin();
        User a = em.find(User.class, entidad.getId());
        if(a!=null){
            a.setNombreCompleto(entidad.getNombreCompleto());
            a.setCorreo(entidad.getCorreo());
            a.setContrasena(entidad.getContrasena());
            a.setTelefono(entidad.getTelefono());
            a.setAvatar(entidad.getAvatar());
            a.setCiudad(entidad.getCiudad());
            a.setFechaNacimiento(entidad.getFechaNacimiento());
            a.setGenero(entidad.getGenero());
            a.setMunicipio(entidad.getMunicipio());
        }
        em.getTransaction().commit();
    }

    @Override
    public User buscarPorId(int id) {
        em = this.createEntintyManager();
        User a = em.find(User.class, id);
        if(a!=null){
            return a;
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<User> buscarTodos() {
        ArrayList<User> lista;
        em = this.createEntintyManager();
        em.getTransaction().begin();
        CriteriaQuery criteria = em.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(User.class));
        Query query = em.createQuery(criteria);
        List<User> as= query.getResultList();
        lista = new ArrayList(as);
        em.getTransaction().commit();
        return lista;
    }
    
}