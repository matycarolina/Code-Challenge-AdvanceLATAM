package com.challenge.code.car;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findCarByPlate(String plate);
    @Query("SELECT c FROM Car c WHERE c.plate = ?1")
    Optional<Car> findByPlate(String plate);
}
