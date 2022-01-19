package com.example.demo.Models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Voiture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	private String name;
	
	private String color;
	
	@OneToMany(mappedBy = "voitures")
	private List<Mat> mats;
	
}
