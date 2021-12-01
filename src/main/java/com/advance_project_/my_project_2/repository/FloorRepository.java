package com.advance_project_.my_project_2.repository;

import com.advance_project_.my_project_2.model.Floor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FloorRepository extends JpaRepository<Floor, Long> {
    Optional<Floor> findByNumber (Integer number);
}
