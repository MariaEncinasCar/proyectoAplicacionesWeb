/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Equipo 4
 */
@Entity
@Table(name="post")
public class Post implements Serializable {

    public Post() {
        
    }

    public Post(Date fechaHoraCreacion, String titulo, String contenido, Date fechaHoraEdicion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaHoraEdicion = fechaHoraEdicion;
    }
    
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_post")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Column(name = "fechaHoraCreacion", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaHoraCreacion;

    public Date getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public void setFechaHoraCreacion(Date fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }
    
    @Column(name = "titulo", nullable = false)
    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Column(name = "contenido", nullable = false)
    private String contenido;

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    @Column(name = "fechaHoraEdicion", nullable = true)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaHoraEdicion;

    public Date getFechaHoraEdicion() {
        return fechaHoraEdicion;
    }

    public void setFechaHoraEdicion(Date fechaHoraEdicion) {
        this.fechaHoraEdicion = fechaHoraEdicion;
    }
    
    @ManyToOne
    @JoinColumn(name="id_usuario", nullable=false)
    private User usuario;
    
    public User getUser() {
        return usuario;
    }

    public void setUser(User usuario) {
        this.usuario = usuario;
    }
    
    @OneToMany(mappedBy="Post" , cascade= CascadeType.ALL)
    private List<Comentario> comentarios;

    public List<Comentario> getComentario() {
        return  comentarios;
    }

    public void setComentario(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.id;
        hash = 11 * hash + Objects.hashCode(this.fechaHoraCreacion);
        hash = 11 * hash + Objects.hashCode(this.titulo);
        hash = 11 * hash + Objects.hashCode(this.contenido);
        hash = 11 * hash + Objects.hashCode(this.fechaHoraEdicion);
        hash = 11 * hash + Objects.hashCode(this.usuario);
        hash = 11 * hash + Objects.hashCode(this.comentarios);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Post other = (Post) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Post{" + "id=" + id + ", fechaHoraCreacion=" 
                + fechaHoraCreacion + ", titulo=" + titulo 
                + ", contenido=" + contenido + ", fechaHoraEdicion=" 
                + fechaHoraEdicion + ", usuario=" + usuario 
                + ", comentarios=" + comentarios + '}';
    }
    
    
}
