package com.advance_project_.my_project_2.converter;

import com.advance_project_.my_project_2.dto.FloorDto;
import com.advance_project_.my_project_2.model.Floor;
import org.springframework.stereotype.Component;

@Component
public class FloorConverter {

    public FloorDto toFloorDto(Floor floor){
        return  FloorDto.builder().number(floor.getNumber()).build();

    }
    public  Floor toFloor (FloorDto floorDto){
        return  Floor.builder()
                .id(floorDto.getId())
                .number(floorDto.getNumber()).build();
    }
}
