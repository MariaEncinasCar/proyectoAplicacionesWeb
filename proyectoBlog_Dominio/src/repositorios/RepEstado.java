/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import modelos.Estado;

/**
 *
 * @author Equipo 4
 */
public class RepEstado extends BaseRepository<Estado>{
    private EntityManager em;
    
    @Override
    public void guardar(Estado entidad) {
        em = this.createEntintyManager();
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        em = this.createEntintyManager();
        em.getTransaction().begin();   
        Estado a = em.find(Estado.class, id);
        em.remove(a);
        em.getTransaction().commit();
    }

    @Override
    public void actualizar(Estado entidad) {
        em.getTransaction().begin();
        Estado a = em.find(Estado.class, entidad.getId());
        if(a!=null){
            a.setId_Estado(entidad.getId_Estado());
            a.setNombre(entidad.getNombre());
        }
        em.getTransaction().commit();
    }

    @Override
    public Estado buscarPorId(int id) {
        em = this.createEntintyManager();
        Estado a = em.find(Estado.class, id);
        if(a!=null){
            return a;
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<Estado> buscarTodos() {
        ArrayList<Estado> lista;
        em = this.createEntintyManager();
        em.getTransaction().begin();
        CriteriaQuery criteria = em.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Estado.class));
        Query query = em.createQuery(criteria);
        List<Estado> as= query.getResultList();
        lista = new ArrayList(as);
        em.getTransaction().commit();
        return lista;
    }
    
}

