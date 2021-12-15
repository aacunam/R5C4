package misiontic.app.ciclo4.appG9mdb.repository;

import misiontic.app.ciclo4.appG9mdb.model.User;
import misiontic.app.ciclo4.appG9mdb.repository.crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Armando Acuña
 */

@Repository
public class UserRepository {
    @Autowired
    private UserCrudRepository repositoryCrud;
    /**
     * get all
     * @return
     */
    public List<User> getAll(){
        return repositoryCrud.findAll();
    }

    /**
     * @param idUser
     * @return
     */    
    public Optional<User>getUser(Integer idUser){
        return repositoryCrud.findById(idUser);
    }
    /**
     * @param user
     * @return
     */      
    public User saveUser(User user){
        return repositoryCrud.save(user);

    }
    /**
     * @param email
     * @return
     */  
    public User getUserByEmail(String email){
        return repositoryCrud.findUserByEmail(email);
    }
    /**
     * @param email
     * @param password
     * @return
     */      
    public User getByEmailAndPassword(String email, String password){
        return repositoryCrud.findByEmailAndPassword(email, password);
    }
    /**
     * @param user
     * 
     */    
    public void delete(User user) {

        repositoryCrud.delete(user);
    }
    //* Reto 5 metodos

    /**
     * @param monthBirthtDay
     * @return
     */    
    public List<User> getUsersBymonthBirthtDay(String monthBirthtDay){
       return repositoryCrud.findmonthBirthDay(monthBirthtDay);
    }
}
