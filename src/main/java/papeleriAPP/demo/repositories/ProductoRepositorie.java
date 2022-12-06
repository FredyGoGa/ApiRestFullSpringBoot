package papeleriAPP.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import papeleriAPP.demo.models.ProductoModels;

@Repository
public interface ProductoRepositorie extends CrudRepository<ProductoModels, Integer> {
    
}
