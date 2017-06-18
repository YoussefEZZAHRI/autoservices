package com.piece.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piece.entities.Piece;

public interface PieceRepository extends JpaRepository<Piece, Long>{

}
