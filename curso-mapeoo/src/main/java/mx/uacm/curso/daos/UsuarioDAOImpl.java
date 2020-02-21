
package mx.uacm.curso.daos;

import javax.persistence.EntityManager;
import mx.uacm.curso.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO{
    
    private EntityManager em;

    public UsuarioDAOImpl(EntityManager em) {
        this.em = em;
    }
    
    
    
    @Override
    public Usuario buscarporID(Integer id) {
        return this.em.find(Usuario.class,id);
    }

    @Override
    public Usuario guardar(Usuario a) {
        return this.em.merge(a);
    }

    @Override
    public void remover(Usuario a) {
        this.em.remove(a);
    }
    
}
