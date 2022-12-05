package papeleriAPP.demo.repositories;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import papeleriAPP.demo.models.UsuarioModels;



@Repository
public interface UsuarioRepositorie extends CrudRepository<UsuarioModels, Long>{
    public abstract ArrayList<UsuarioModels>  findByPrioridad(Integer prioridad);
}
