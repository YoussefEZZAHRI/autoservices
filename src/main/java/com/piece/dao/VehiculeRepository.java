package com.piece.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.piece.entities.Vehicule;

public interface VehiculeRepository extends  JpaRepository<Vehicule, Long>{

}
