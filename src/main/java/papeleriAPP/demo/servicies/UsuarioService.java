package papeleriAPP.demo.servicies;

import java.util.ArrayList;
import java.util.Optional;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import papeleriAPP.demo.models.UsuarioModels;
import papeleriAPP.demo.repositories.UsuarioRepositorie;

@Service
public class UsuarioService {

    @Autowired

    UsuarioRepositorie usuarioRepositorie;

    public ArrayList<UsuarioModels> obtenerUsuarios(){
        return (ArrayList<UsuarioModels>)usuarioRepositorie.findAll();
    }

    public UsuarioModels guardarUsuario(UsuarioModels usuario){
        return usuarioRepositorie.save(usuario);
    }

    public Optional<UsuarioModels> obtenerPorId(long id){
        return usuarioRepositorie.findById(id);
    }

    public ArrayList <UsuarioModels> obtenerPorProridad(Integer prioridad){
        return usuarioRepositorie.findByPrioridad(prioridad);
    }

    public boolean eliminarUsuario(Long id){

        try {
            usuarioRepositorie.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    
}
