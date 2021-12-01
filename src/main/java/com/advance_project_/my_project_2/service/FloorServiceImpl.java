package com.advance_project_.my_project_2.service;

import com.advance_project_.my_project_2.exception.DuplicateRecordException;
import com.advance_project_.my_project_2.exception.ResourceNotFoundException;
import com.advance_project_.my_project_2.model.Floor;
import com.advance_project_.my_project_2.repository.FloorRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class FloorServiceImpl implements FloorService {

    private FloorRepository floorRepository;

    public FloorServiceImpl (FloorRepository floorRepository){
        this.floorRepository=floorRepository;
    }

    @Override
    public Floor save(Floor floor) {
        try {
            return floorRepository.save(floor);
        } catch (DataIntegrityViolationException exception) {
    throw  new DuplicateRecordException(String.format("Floor with number %d already exists", floor.getNumber()));
        }
    }
    @Override
    public Floor findByNumber(Integer number) {
        return floorRepository.findByNumber(number).orElseThrow(() -> new ResourceNotFoundException(String.format("Floor with %d does not exist", number)));
    }

    @Override
    public Floor findById(Long id) {
        return floorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(String.format("jkkj",id)));
    }

    @Override
    public Floor update(Floor floor, Long id) {
        Floor foundFloor = findById(id);
        Floor updateFloor = Floor.builder()
                .id(foundFloor.getId())
                .number(foundFloor.getNumber())
                .build();

        return save (updateFloor);
    }

    @Override
    public Floor delete(Long id) {
        return floorRepository.getById(id);
    }

    @Override
    public Set<Floor> findAll() {
        return null ;
    }
}
