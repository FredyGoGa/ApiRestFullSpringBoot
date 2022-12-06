package papeleriAPP.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import papeleriAPP.demo.models.ProductoModels;
import papeleriAPP.demo.servicies.ProductoService;

@RestController
@RequestMapping( "/productos")
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @GetMapping()
    public ArrayList<ProductoModels> obtenerProductos(){
        return productoService.obtenerProductos();
    }

    @PostMapping()
        public ProductoModels guardarProducto(@RequestBody ProductoModels productos){
           return this.productoService.guardarProducto(productos);
        }
    
}
