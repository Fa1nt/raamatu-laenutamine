package com.raamatulaenutamine.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.raamatulaenutamine.backend.model.Raamat;
import com.raamatulaenutamine.backend.repository.RaamatRepo;

@Service
public class RaamatService {
    
    @Autowired
    RaamatRepo raamatRepo;

    public List<Raamat> getAllRaamat() {
        List<Raamat> raamatud = new ArrayList<Raamat>();
        raamatRepo.findAll().forEach(raamat -> raamatud.add(raamat));
        return raamatud;
    }

    public Raamat getRaamatById(int id) {
        return raamatRepo.findById(id).get();
    }

    public void saveOrUpdate(Raamat raamat) {
        raamatRepo.save(raamat);
    }

    public void delete(int id) {
        raamatRepo.deleteById(id);
    }

}
