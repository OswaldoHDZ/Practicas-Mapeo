
package mx.uacm.curso.daos;


//               Por estandar se le pone <T,PK>
public interface GenericDAO <ObjetoGenerico,ObjetoGenericoDos>{
    
    //oBJETOS QUE SON GENERICOS PARA QUE LOS METODOS RECIVAN CUALUQUIER TIPO DE OBJET
    
    public ObjetoGenerico buscarporID(Integer ObjetoGenericoDos);
    
    public ObjetoGenerico guardar(ObjetoGenerico a);
    
    public void remover (ObjetoGenerico a);
    
    
    
    
}
