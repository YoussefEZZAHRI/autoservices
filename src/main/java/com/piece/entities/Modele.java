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
public class Modele implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	 private Long idModele;
	 private String nom;
	 
	 @ManyToOne
		@JoinColumn(name="YEAR")
		private Year year;
	 
	 @ManyToOne
		@JoinColumn(name="CODE_MAR")
		private Marque marque;
	 
	 @OneToMany(mappedBy="modele",fetch=FetchType.LAZY)
		private Collection<Motorisation> moteur;

}
