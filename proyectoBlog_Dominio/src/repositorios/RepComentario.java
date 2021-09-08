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
import modelos.Comentario;

/**
 *
 * @author Equipo 4
 */
public class RepComentario extends BaseRepository<Comentario>{
    private EntityManager em;
    
    @Override
    public void guardar(Comentario entidad) {
        em = this.createEntintyManager();
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        em = this.createEntintyManager();
        em.getTransaction().begin();   
        Comentario a = em.find(Comentario.class, id);
        em.remove(a);
        em.getTransaction().commit();
    }

    @Override
    public void actualizar(Comentario entidad) {
        em.getTransaction().begin();
        Comentario a = em.find(Comentario.class, entidad.getId());
        if(a!=null){
            a.setFechaHora(entidad.getFechaHora());
            a.setContenido(entidad.getContenido());
            a.setPost(entidad.getPost());
            a.setUser(entidad.getUser());
        }
        em.getTransaction().commit();
    }

    @Override
    public Comentario buscarPorId(int id) {
        em = this.createEntintyManager();
        Comentario a = em.find(Comentario.class, id);
        if(a!=null){
            return a;
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<Comentario> buscarTodos() {
        ArrayList<Comentario> lista;
        em = this.createEntintyManager();
        em.getTransaction().begin();
        CriteriaQuery criteria = em.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Comentario.class));
        Query query = em.createQuery(criteria);
        List<Comentario> as= query.getResultList();
        lista = new ArrayList(as);
        em.getTransaction().commit();
        return lista;
    }
    
}

