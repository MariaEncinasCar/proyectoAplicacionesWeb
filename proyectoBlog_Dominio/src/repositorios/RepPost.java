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
import modelos.Post;

/**
 *
 * @author Equipo 4
 */
public class RepPost extends BaseRepository<Post>{
    private EntityManager em;
    
    @Override
    public void guardar(Post entidad) {
        em = this.createEntintyManager();
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
    }

    @Override
    public void eliminar(int id) {
        em = this.createEntintyManager();
        em.getTransaction().begin();   
        Post a = em.find(Post.class, id);
        em.remove(a);
        em.getTransaction().commit();
    }

    @Override
    public void actualizar(Post entidad) {
        em.getTransaction().begin();
        Post a = em.find(Post.class, entidad.getId());
        if(a!=null){
            a.setTitulo(entidad.getTitulo());
            a.setComentario(entidad.getComentario());
            a.setFechaHoraCreacion(entidad.getFechaHoraCreacion());
            a.setFechaHoraEdicion(entidad.getFechaHoraEdicion());
            a.setUser(entidad.getUser());
        }
        em.getTransaction().commit();
    }

    @Override
    public Post buscarPorId(int id) {
        em = this.createEntintyManager();
        Post a = em.find(Post.class, id);
        if(a!=null){
            return a;
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<Post> buscarTodos() {
        ArrayList<Post> lista;
        em = this.createEntintyManager();
        em.getTransaction().begin();
        CriteriaQuery criteria = em.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Post.class));
        Query query = em.createQuery(criteria);
        List<Post> as= query.getResultList();
        lista = new ArrayList(as);
        em.getTransaction().commit();
        return lista;
    }
    
}

