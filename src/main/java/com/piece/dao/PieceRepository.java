package com.piece.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piece.entities.Pieces;

public interface PieceRepository extends JpaRepository<Pieces, Long>{

}
