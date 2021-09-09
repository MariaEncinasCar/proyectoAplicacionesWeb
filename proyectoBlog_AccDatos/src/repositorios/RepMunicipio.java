package repositorios;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import modelos.Municipio;

/**
 *
 * @author Equipo 4
 */
public class RepMunicipio extends BaseRepository<Municipio>{
    private EntityManager em;
    
    @Override
    public void guardar(Municipio entidad) {
        em = this.createEntintyManager();
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        em = this.createEntintyManager();
        em.getTransaction().begin();   
        Municipio a = em.find(Municipio.class, id);
        em.remove(a);
        em.getTransaction().commit();
    }

    @Override
    public void actualizar(Municipio entidad) {
        em.getTransaction().begin();
        Municipio a = em.find(Municipio.class, entidad.getId());
        if(a!=null){
            a.setId_Municipio(entidad.getId_Municipio());
            a.setNombre(entidad.getNombre());
            a.setEstado(entidad.getEstado());
        }
        em.getTransaction().commit();
    }

    @Override
    public Municipio buscarPorId(int id) {
        em = this.createEntintyManager();
        Municipio a = em.find(Municipio.class, id);
        if(a!=null){
            return a;
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<Municipio> buscarTodos() {
        ArrayList<Municipio> lista;
        em = this.createEntintyManager();
        em.getTransaction().begin();
        CriteriaQuery criteria = em.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Municipio.class));
        Query query = em.createQuery(criteria);
        List<Municipio> as= query.getResultList();
        lista = new ArrayList(as);
        em.getTransaction().commit();
        return lista;
    }
    
}
