package com.piece.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class SousCategoriePieces implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Long idSGP;
	private String nom;
	private String image;
	
	 @ManyToOne
		@JoinColumn(name="CATEGORIE")
		private CatégoriePieces categoriePiece;
	
	@OneToMany(mappedBy="sousCategoriePiece",fetch=FetchType.LAZY)
	private Collection<Piece> pieces;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


}
