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
public class EjercicioEstados {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("blog-pruebas");
        EntityManager em = emf.createEntityManager();        
        em.getTransaction().begin();
        
        
        Usuario u = new Usuario();
        u.setNombre("Oswaldo");
        Usuario usuario2 = em.merge(u);
        u.setEmail("nuevoEmailOswaldo");
        usuario2.setEmail("nuevoEmal-Oswaldo");
        //¿porque no se actualiza automaticamente el campo email?
        //usuario2.setEmail("actualizado@mail.com");  
        
        em.getTransaction().commit();
    }
}
