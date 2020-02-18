
package mx.uacm.curso;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EjercicioUsuario {
    
    public static void main(String[] args) {
        /*
        
        Ejercicio
        
        Actualizar el usuario, cuyo ID es 2 cambiando
            NOMBRE ="Homero Simpson"
            
        */
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("blog-pruebas");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Usuario user = em.find(Usuario.class,2);
        System.out.println("usuario tiene nombre: " + user.getNombre());

        user.setNombre("Homero Simpson");
        System.out.println("usuario tiene nombre: "+ user.getNombre());
        em.getTransaction().commit();
    }
}
