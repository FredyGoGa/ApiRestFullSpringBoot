package papeleriAPP.demo.servicies;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import papeleriAPP.demo.models.ProductoModels;
import papeleriAPP.demo.repositories.ProductoRepositorie;



@Service
public class ProductoService {

    @Autowired
    ProductoRepositorie productoRepositorie;

    public ArrayList<ProductoModels> obtenerProductos(){
        return (ArrayList<ProductoModels>) productoRepositorie.findAll();
        
    }

    public ProductoModels guardarProducto(ProductoModels producto){
        return productoRepositorie.save(producto);

    }

   
}
