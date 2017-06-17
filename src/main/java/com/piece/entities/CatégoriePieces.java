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
public class CatégoriePieces implements Serializable{
	@Id @GeneratedValue
	private Long idCatégorie;
	private String nomCategorie;
	private String image;
	
	@OneToMany(mappedBy="categoriePiece",fetch=FetchType.LAZY)
	private Collection<SousCategoriePieces> SCP;
	
	 @ManyToOne
		@JoinColumn(name="CODE_Veh")
		private Vehicule vehicule;

}
