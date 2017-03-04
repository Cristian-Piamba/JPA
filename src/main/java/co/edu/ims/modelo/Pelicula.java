/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author 1061764041
 */
@Entity
public class Pelicula implements Serializable{
    
    //Atributos
    @Id
    private String titulo;
    private String anio;
    
    //Constructores
    public Pelicula(){
    }
    
    public Pelicula(String titulo, String anio) {
        this.titulo = titulo;
        this.anio = anio;       
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }  
    
}
