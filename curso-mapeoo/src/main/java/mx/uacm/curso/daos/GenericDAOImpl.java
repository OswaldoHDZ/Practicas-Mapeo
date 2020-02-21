package mx.uacm.curso.daos;

import javax.persistence.EntityManager;

public abstract class GenericDAOImpl<T,PK> implements GenericDAO<T,PK>{
     
    private EntityManager em;
    private Class<T> clase;
    //Constructor
    public GenericDAOImpl(EntityManager em, Class <T> clase){
        this.em = em;
        this.clase = clase;
    }

    public T buscarporID(PK id) {
        return this.em.find(this.clase,id);
    }

    public T guardar(T a) {
        return this.em.merge(a);
    }

    public void remover(T a) {
        this.em.remove(a);
    }
}
