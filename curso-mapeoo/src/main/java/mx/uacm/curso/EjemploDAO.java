package mx.uacm.curso;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mx.uacm.curso.daos.UsuarioDAO;
import mx.uacm.curso.daos.UsuarioDAOImpl;


public class EjemploDAO {
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("blog-pruebas");
        EntityManager em = emf.createEntityManager();
        
        //Invocamos AL DAO
        
        //ArticuloDAO aDAO = new ArticuloDAOImpl(em);
        
        
        //em.getTransaction().begin();
        //CREAR LA INSTANCIA QUE QUEREMOS INSERTAR EN LA BD
        
        //Articulo articulo = new Articulo();
        //articulo.setTitulo("nuevo titulo (dao)");
        
        //aDAO.guardar(articulo);
        
        //----------------------------------------------------------
        //em.getTransaction().begin();
        //UsuarioDAO aDAO = new UsuarioDAOImpl(em);
        
        
        //Usuario usuario = new Usuario();
        //usuario.setNombre("Este es el nuevo nombre con DAO");
        //aDAO.guardar(usuario);
        //em.getTransaction().commit();
        //----------------------------------------------------------
        //----------------------------------------------------------
        em.getTransaction().begin();
        
        UsuarioDAO aDAO = new UsuarioDAOImpl(em);
        
        
        Usuario usuario = new Usuario();
        usuario.setNombre("Este es el nuevo nombre con DAO GENERIC");
        aDAO.guardar(usuario);
        em.getTransaction().commit();
        //----------------------------------------------------------
        
        
    }
}
