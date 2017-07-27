package com.autoservices.piece.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autoservices.piece.entities.Vehicule;

public interface VehiculeRepository extends  JpaRepository<Vehicule, Long>{

}
