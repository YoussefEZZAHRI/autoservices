package com.piece.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Pieces implements Serializable{
	@Id @GeneratedValue
	private Long idPiece;
	private String nom;
	private String image;
	
	 @ManyToOne
		@JoinColumn(name="SOUS_CATEGORIE")
		private SousCategoriePieces sousCategoriePiece;
	

}
