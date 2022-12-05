package papeleriAPP.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import papeleriAPP.demo.models.UsuarioModels;
import papeleriAPP.demo.servicies.UsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModels> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModels guardarUsuario(@RequestBody UsuarioModels usuario) {        
        return this.usuarioService.guardarUsuario(usuario);
    }
    
    @GetMapping( path = "/{id}")
    public Optional<UsuarioModels> obtenerUsuariosPorId(@PathVariable("id") Long id){
        return this.usuarioService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<UsuarioModels> obtenerUsuariosPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.usuarioService.obtenerPorProridad(prioridad);
    }

    @DeleteMapping(path = "/{id}")
        public String eliminarPorId(@PathVariable("id")Long id){
            boolean ok = this.usuarioService.eliminarUsuario(id);
            if (ok){
                return "Se eliminó el usuario con id" + id;
            }else{
                return "No pudo eliminar el usuario con id" + id;
            }
        }
    
    

}
