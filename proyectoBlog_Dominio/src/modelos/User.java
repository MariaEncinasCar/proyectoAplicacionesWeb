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
@Table(name="usuario")
public class User implements Serializable {
  
    public User() {
        
    }
    //todo
    public User(String nombreCompleto, String correo, String contrasena,
            String telefono, String avatar, String ciudad, Date fechaNacimiento,
            char genero) {
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.contrasena = contrasena;
        this.telefono = telefono;
        this.avatar = avatar;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

    public User(String nombreCompleto, String correo, String contrasena, 
            String avatar, String ciudad, Date fechaNacimiento, char genero) {
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.contrasena = contrasena;
        this.avatar = avatar;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Column(name="nombreCompleto", nullable = false)
    private String nombreCompleto;
    
    /**
     * Recupera el nombre completo del usuario
     * @return nombre del usuario
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
    /**
     * Define el nombre completo del usuario
     * @param nombreCompleto Nombre del usuario
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    @Column(name="correo", nullable = false)
    private String correo;
    
    /**
     * Recupera el correo del usuario
     * @return correo del usuario
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Define el correo del usuario
     * @param correo Correo del usuario
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    @Column(name="contrasena", nullable = false)
    private String contrasena;
    
    /**
     * Recupera la contraseña del usuario
     * @return contraseña del usuario
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Define la contraseña del usuario
     * @param contrasena Contraseña del usuario
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    @Column(name="telefono", nullable = true)
    private String telefono;
    
    /**
     * Recupera el teléfono del usuario
     * @return teléfono del usuario
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el teléfono del usuario
     * @param telefono Teléfono del usuario
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Column(name="avatar", nullable = false)
    private String avatar;
    
    /**
     * Recupera el avatar del usuario
     * @return avatar del usuario
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * Define el avantar del usuario
     * @param avatar Avatar del usuario
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    
    @Column(name="ciudad", nullable = true)
    private String ciudad;
    
    /**
     * Recupera la ciudad del usuario
     * @return ciudad del usuario
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Define la ciudad del usuario
     * @param ciudad Ciudad del usuario
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Column(name="fechaNacimiento", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaNacimiento;
    
    /**
     * Recupera la fecha de nacimiento del usuario
     * @return fecha de nacimiento del usuario
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define la fecha de nacimiento del usuario
     * @param fechaNacimiento Fecha de nacimiento del usuario
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    @Column(name="genero", nullable = false)
    private char genero;
    
    /**
     * Recupera el género del usuario
     * @return género del usuario
     */
    public char getGenero() {
        return genero;
    }

    /**
     * Define el género del usuario
     * @param genero Género del usuario
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }
        
    @ManyToOne
    @JoinColumn(name="id_municipio", nullable=false)
    private Municipio municipio;
    
    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
    
    @OneToMany(mappedBy="usuario" , cascade= CascadeType.ALL)
    private List<Post> post;

    public List<Post> getPost() {
        return  post;
    }

    public void setPost(List<Post> post) {
        this.post = post;
    }
    
    @OneToMany(mappedBy="usuario" , cascade= CascadeType.ALL)
    private List<Comentario> comentario;

    public List<Comentario> getComentario() {
        return  comentario;
    }

    public void setComentario(List<Comentario> comentario) {
        this.comentario = comentario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.id;
        hash = 71 * hash + Objects.hashCode(this.nombreCompleto);
        hash = 71 * hash + Objects.hashCode(this.correo);
        hash = 71 * hash + Objects.hashCode(this.contrasena);
        hash = 71 * hash + Objects.hashCode(this.telefono);
        hash = 71 * hash + Objects.hashCode(this.avatar);
        hash = 71 * hash + Objects.hashCode(this.ciudad);
        hash = 71 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 71 * hash + this.genero;
        hash = 71 * hash + Objects.hashCode(this.municipio);
        hash = 71 * hash + Objects.hashCode(this.post);
        hash = 71 * hash + Objects.hashCode(this.comentario);
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
        final User other = (User) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nombreCompleto=" + nombreCompleto 
                + ", correo=" + correo + ", contrasena=" + contrasena 
                + ", telefono=" + telefono + ", avatar=" + avatar 
                + ", ciudad=" + ciudad + ", fechaNacimiento=" + fechaNacimiento 
                + ", genero=" + genero + ", municipio=" + municipio 
                + ", post=" + post + ", comentario=" + comentario + '}';
    }
    
    
}
