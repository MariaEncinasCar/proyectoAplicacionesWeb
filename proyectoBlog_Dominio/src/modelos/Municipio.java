/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.Serializable;
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

/**
 *
 * @author Equipo 4
 */
@Entity
@Table(name = "municipio")
public class Municipio implements Serializable {

    public Municipio() {
    }

    public Municipio(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_municipio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_municipio;

    public int getId() {
        return id_municipio;
    }

    public void setId(int id_estado) {
        this.id_municipio = id_estado;
    }
    
    @Column(name = "id", nullable=false)
    private String id;

    public String getId_Municipio() {
        return id;
    }

    public void setId_Municipio(String id) {
        this.id = id;
    }
    
    @Column(name = "nombre", nullable=false)
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @ManyToOne
    @JoinColumn(name="id_estado", nullable=false)
    private Estado estado;
    
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    @OneToMany(mappedBy="Municipio" , cascade= CascadeType.ALL)
    private List<User> usuarios;

    public List<User> getUsuarios() {
        return  usuarios;
    }

    public void setUsuarios(List<User> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.id_municipio;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + Objects.hashCode(this.estado);
        hash = 37 * hash + Objects.hashCode(this.usuarios);
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
        final Municipio other = (Municipio) obj;
        if (this.id_municipio != other.id_municipio) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Municipio{" + "id_municipio=" + id_municipio + ", id=" + id 
                + ", nombre=" + nombre + ", estado=" + estado 
                + ", usuarios=" + usuarios + '}';
    }
    
}
