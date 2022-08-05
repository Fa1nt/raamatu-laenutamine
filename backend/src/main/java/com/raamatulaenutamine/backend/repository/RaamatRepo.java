package com.raamatulaenutamine.backend.repository;

import org.springframework.data.repository.CrudRepository;
import com.raamatulaenutamine.backend.model.Raamat;

public interface RaamatRepo extends CrudRepository<Raamat, Integer> {
    
}
