package com.autoservices.piece.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autoservices.piece.entities.Piece;

public interface PieceRepository extends JpaRepository<Piece, Long>{

}
