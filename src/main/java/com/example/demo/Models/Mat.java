package com.example.demo.Models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Mat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int number;
	
	@ManyToOne
	private Voiture voitures ;

}
