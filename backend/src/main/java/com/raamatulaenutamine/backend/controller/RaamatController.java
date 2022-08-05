package com.raamatulaenutamine.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.raamatulaenutamine.backend.model.Raamat;
import com.raamatulaenutamine.backend.service.RaamatService;

@RestController
public class RaamatController {
    
    @Autowired
    RaamatService raamatService;

    @GetMapping("/raamat")
    private List<Raamat> getAllRaamat() {
        return raamatService.getAllRaamat();
    }

    @GetMapping("/raamat/{id}")
    private Raamat getRaamat(@PathVariable("id") int id) {
        return raamatService.getRaamatById(id);
    }

    @DeleteMapping("/raamat/{id}")
    private void deleteRaamat(@PathVariable("id") int id) {
        raamatService.delete(id);
    }

    @PostMapping("/raamat")
    private int saveRaamat(@RequestBody Raamat raamat) {
        raamatService.saveOrUpdate(raamat);
        return raamat.getId();
    }

}
