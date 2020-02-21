/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.curso;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Alumno
 */
public class EjemploPersist {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("blog-pruebas");
        EntityManager em = emf.createEntityManager();
        
        //Crear usando el metodo persist
        
        
        //Si queremos actualizar sale error si lo hacemos así
        //articulo.setId(2);
        
        ////Persist recibe solo entidades administrada
        //  El merge puede recibir entidades no administradas
        
        //Aqui esta como un objeto nuevo
        //Articulo articulo = new Articulo();
        //Convertir un objeto en adminsitrado
        //Aqui agregamos un nuevo renglon 
        //articulo.setTitulo("Titulo persist");
        //em.persist(articulo);
        //articulo.setTitulo("Objeto convertido a adminstrado");
        
        
        
        //Actualización usando persist
        //Articulo articuloAdministrado = em.find(Articulo.class,2);
        //articuloAdministrado.setTitulo("Este es nuvo el titulo");
        //-----------------------------------------------------------------
        
        
        //Articulo articulo = new Articulo();
        //articulo.setTitulo("Articulo 3");
        //Articulo articuloAdministrado = em.merge(articulo);
        //articulo.setTitulo("Actual 3");
        //articuloAdministrado.setTitulo("contenido nuevo usando a4");
        
        
        
        
        //-----------------------------------------------------------------
        
        em.getTransaction().begin();
        
        //Como remover entidades
        Articulo articulorRemover = em.find(Articulo.class,4);
        em.remove(articulorRemover);
    
        em.getTransaction().commit();
    }
    
}
