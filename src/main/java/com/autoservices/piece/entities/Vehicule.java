package com.autoservices.piece.entities;

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
public class Vehicule implements Serializable{
	@Id @GeneratedValue
	private Long idVehicule;
	private String nom;

	 @ManyToOne
		@JoinColumn(name="CODE_MOD")
		private Modele modele;
	 
	 @OneToMany(mappedBy="vehicule",fetch=FetchType.LAZY)
		private Collection<CatégoriePieces> CP;
	

}
