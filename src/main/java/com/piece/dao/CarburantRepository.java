package com.piece.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piece.entities.Carburant;

public interface CarburantRepository extends JpaRepository<Carburant, Long>{

}
