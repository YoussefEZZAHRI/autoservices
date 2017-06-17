package com.piece.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Year implements Serializable{
	@Id
	private Long Year;

}