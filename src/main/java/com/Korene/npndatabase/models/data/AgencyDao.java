package com.Korene.npndatabase.models.data;


import com.Korene.npndatabase.models.Agency;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


//repo is for controller, crud repo contains .save .delete
@Repository
public interface AgencyDao extends CrudRepository<Agency, Integer> {

    //you could put in the controller
    Agency findByPoc(String poc);
}
