package com.autoservices.piece.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autoservices.piece.entities.Carburant;

public interface CarburantRepository extends JpaRepository<Carburant, Long>{

}
