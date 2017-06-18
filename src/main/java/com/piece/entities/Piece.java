package com.piece.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Entity
public class Piece implements Serializable{
	@Id @GeneratedValue
	private Long idPiece;
	private String nom;
	private String image;
	private String description;

	@ManyToOne
	@JoinColumn(name="SOUS_CATEGORIE")
	private SousCategoriePieces sousCategoriePiece;

	public Long getIdPiece() {
		return idPiece;
	}

	public void setIdPiece(Long idPiece) {
		this.idPiece = idPiece;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SousCategoriePieces getSousCategoriePiece() {
		return sousCategoriePiece;
	}

	public void setSousCategoriePiece(SousCategoriePieces sousCategoriePiece) {
		this.sousCategoriePiece = sousCategoriePiece;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(this.idPiece)
				.append(this.image)
				.append(this.description)
				.append(this.nom).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Piece rhs=(Piece)obj;
		return new EqualsBuilder()
				.append(this.idPiece,rhs.idPiece )
				.append(this.description, rhs.description)
				.append(this.nom, rhs.nom).isEquals();
	}


}
