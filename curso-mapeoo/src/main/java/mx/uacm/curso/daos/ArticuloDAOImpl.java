
package mx.uacm.curso.daos;

import javax.persistence.EntityManager;
import mx.uacm.curso.Articulo;

public class ArticuloDAOImpl extends GenericDAOImpl<Articulo, Integer>{
    
    public ArticuloDAOImpl(EntityManager em, Class<Articulo> clase) {
        super(em, clase);
    }

}
