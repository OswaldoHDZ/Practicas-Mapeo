/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.curso;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Alumno
 */
//@Entyty es para indicar que esta clase es una entidad de JPA
@Entity
@Table(name="articulos")
public class Articulo {
    @Id
    @Column(name="id")
    //LE INDICAMOS AJPA EL OMBRE DE LA SECUECIA DE LA TABLA
    //CADA UNA DE LA SECUENCIAS TIENE UN NOMBRE DIFERENTE
    @SequenceGenerator(name="SEC_JAVA_ARTICULO",
            sequenceName="articulo_id_seq",
            allocationSize=1)
    //INDICAMOS QUE CAMOS A USAR UNA ESTRATEGIA DELTIPO
    @GeneratedValue(strategy=GenerationType.SEQUENCE
            ,generator="SEC_JAVA_ARTICULO")
    private Integer id;
    
    @Column(name="titulo")
    private String titulo;
    
    @Column(name="contenido")
    private String contenido;
    
    @Column(name="fecha_creacion")
    private Date fechaCreacion;

    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
