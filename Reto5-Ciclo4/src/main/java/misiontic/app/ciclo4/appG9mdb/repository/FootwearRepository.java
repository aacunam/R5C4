package misiontic.app.ciclo4.appG9mdb.repository;

import misiontic.app.ciclo4.appG9mdb.model.Footwear;
import misiontic.app.ciclo4.appG9mdb.repository.crud.FootwearCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Armando Acuña
 */

@Repository
public class FootwearRepository {
    @Autowired
    private FootwearCrud footwearcrudrepo;

    public List<Footwear> getAll() {
        return footwearcrudrepo.findAll();
    }

    public Optional<Footwear> getFootwear(String reference) {
        return footwearcrudrepo.findById(reference);
    }
    public Footwear saveFootwear(Footwear footwear) {
        return footwearcrudrepo.save(footwear);
    }

    public void delete(Footwear footwear) {
        footwearcrudrepo.delete(footwear);
    }
    //*Reto 5 metodos
    public List<Footwear> getProductbyPrice(double price){
     return footwearcrudrepo.findByPrice(price);
    }
    public List<Footwear> getProductByDescription(String description){
        return  footwearcrudrepo.findByDescription(description);
    }
}
