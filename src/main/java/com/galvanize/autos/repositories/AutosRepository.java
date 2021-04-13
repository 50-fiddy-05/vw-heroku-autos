package com.galvanize.autos.repositories;

import com.galvanize.autos.model.Automobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutosRepository extends JpaRepository<Automobile, Long> {
    List<Automobile> findByColorContainsAndMakeContains(String color, String make);
    List<Automobile> findByColorOrMakeContains(String color, String make);
}
