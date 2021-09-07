/*
 * Clase Usuario
 * Esta clase representa a los usuarios del blog.
 */
package objetos;

import java.util.Date;

/**
 *
 * @author Equipo 4
 */
public class Usuario {
    private String nombreCompleto;
    private String correo;
    private String contrasena;
    private String telefono;
    private String avatar;
    private String ciudad;
    private Date fechaNacimiento;
    private char genero;

    public Usuario() {
        
    }
    
    public Usuario(String nombreCompleto, String correo, String contrasena, 
            String telefono, String avatar, String ciudad, 
            Date fechaNacimiento, char genero) {
        
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.contrasena = contrasena;
        this.telefono = telefono;
        this.avatar = avatar;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }
    
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
    
    
}
