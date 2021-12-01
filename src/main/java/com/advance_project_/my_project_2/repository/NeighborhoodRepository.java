package com.advance_project_.my_project_2.repository;

import com.advance_project_.my_project_2.model.Neighborhood;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NeighborhoodRepository extends JpaRepository<Neighborhood, Long> {

    Optional<Neighborhood> findByName (String name);
}
