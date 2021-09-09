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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Equipo 4
 */
@Entity
@Table(name = "estado")
public class Estado implements Serializable {

    public Estado() {
    }

    public Estado(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_estado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_estado;

    public int getId() {
        return id_estado;
    }

    public void setId(int id_estado) {
        this.id_estado = id_estado;
    }
    
    @Column(name = "id", nullable=false)
    private String id;

    public String getId_Estado() {
        return id;
    }

    public void setId_Estado(String id) {
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
    
    @OneToMany(mappedBy="Estado" , cascade= CascadeType.ALL)
    private List<Municipio> municipios;

    public List<Municipio> getMunicipios() {
        return  municipios;
    }

    public void setMunicipios(List<Municipio> municipios) {
        this.municipios = municipios;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id_estado;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.nombre);
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
        final Estado other = (Estado) obj;
        if (this.id_estado != other.id_estado) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Estado{" + "id_estado=" + id_estado 
                + ", id=" + id + ", nombre=" + nombre + '}';
    }
    
}
