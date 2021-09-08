/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

/**
 *
 * @author Equipo 4
 */
public class Control {
    
    private RepEstado repEstado;
    private RepMunicipio repMunicipio;
    
    public RepEstado getRepEstado(){
        if(this.repEstado != null){
            return this.repEstado;
        }else{
            this.repEstado = new RepEstado();
            return this.repEstado;
        }
    }
    
    public RepMunicipio getRepMunicipio(){
        if(this.repMunicipio != null){
            return this.repMunicipio;
        }else{
            this.repMunicipio = new RepMunicipio();
            return this.repMunicipio;
        }
    }
    
}
