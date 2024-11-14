package ProjetoSemana2.repository;

import java.util.List;

public interface Irepository<T,ID > {

    List <T> buscarTodos();

    T cadrastar (T model);

    T buscarPorId (ID id);

    boolean excluirPorId(ID id);
    
    
}
