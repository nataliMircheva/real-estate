package com.advance_project_.my_project_2.service;

import com.advance_project_.my_project_2.model.Floor;
import com.advance_project_.my_project_2.repository.FloorRepository;

import java.util.List;
import java.util.Set;

public interface FloorService {

    Floor save (Floor floor);

    Floor findByNumber (Integer number);

    Floor findById(Long id);

    Floor update (Floor floor, Long id);

    Floor delete (Long id);

     Set<Floor> findAll();
}
