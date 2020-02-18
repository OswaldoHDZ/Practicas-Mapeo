/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.curso;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;//propia de JPA

/**
 *
 * @author Alumno
 */
public class IntroJPA {

    public static void main(String[] args) {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("blog-pruebas");
                EntityManager em = emf.createEntityManager();
                
                //Entity manager sirve para hacer consultas
                
                //BUSCAMOS POR ID
                Articulo a = em.find(Articulo.class,1);
                //El metodo FIND REGRESA ENTIDADES EN ESTADO ADMINSITRADO
                a.setTitulo("Se cambio el 1 actualizado");
                System.out.println("titulo:" + a.getTitulo());
                
                Usuario user = em.find(Usuario.class,1);
                System.out.println("Email de usuario:" + user.getEmail());
                /*
                Articulo aNuevo = new  Articulo();
                //Termina transecciony guarda cambios
                em.getTransaction().begin();
                //aNuevo.setId(3);
                aNuevo.setContenido("contenido 3");
                aNuevo.setTitulo("contenido 3");
                aNuevo.setFechaCreacion(new Date());
                em.merge(aNuevo);
                em.getTransaction().commit();
                */
                
                Usuario aNuevo = new  Usuario();
                //Termina transecciony guarda cambios
                em.getTransaction().begin();
                //aNuevo.setId(3);
                aNuevo.setPassword("password");
                em.merge(aNuevo);
                
                /*
                    - Ademas de agregar articulos tambien podemos actualizar
                        en la base de datos en la entidad, creando una nueva 
                        instancia 
                */
                Articulo articuloActualizado = new Articulo();
                articuloActualizado.setId(2);
                articuloActualizado.setContenido("Contenido actualizado");
                articuloActualizado.setFechaCreacion(new Date());
                articuloActualizado.setTitulo("Titulo actualizado");
                //Usamos mage para actualiza
                em.merge(articuloActualizado);
                
                
                em.getTransaction().commit();
    }
}
