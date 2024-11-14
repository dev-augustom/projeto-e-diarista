package ProjetoSemana2.repository;

import java.util.ArrayList;
import java.util.List;

import ProjetoSemana2.models.Diarista;
import semana2.classes.diarista;

public class DiaristaRepository implements Irepository <Diarista, Long> {

    private List <Diarista> diaristas ;

    private long idAtual;

    public DiaristaRepository(){
        diaristas = new ArrayList<>();
       // diarista de teste ou criaçao manual diaristas.add(new Diarista(1L, "Maria santos", "98-955-8742", "854.652.146-01", null) );
    }


    @Override
    public List<Diarista> buscarTodos() {
        // TODO Auto-generated method stub
        
        return diaristas;
    }

    @Override
    public Diarista cadrastar(Diarista model) {
        // TODO Auto-generated method stub
        model.setId(idAtual);

        diaristas.add(model);
        idAtual++;

        return model;

    }

    @Override
    public Diarista buscarPorId(Long id) {
        // TODO Auto-generated method stub
        for (Diarista diarista  : diaristas) {
            if (diarista.getId() == id){
                return diarista;
            }
            
        }

        return null;
    }



    @Override
    public boolean excluirPorId(Long id) {
        // TODO Auto-generated method stub
       var diaristaEncontrada = buscarPorId(id);

       if (diaristaEncontrada != null){
            diaristas.remove(diaristaEncontrada);
            return true;


       }    
    return false;
    }


    
}
