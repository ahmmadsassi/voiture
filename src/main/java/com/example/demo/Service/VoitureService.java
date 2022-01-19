package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Voiture;
import com.example.demo.Repository.VoitureRepo;

@Service
public class VoitureService {
	@Autowired
	private VoitureRepo repovoiture;
	
	public List<Voiture> getAll(){
		return repovoiture.findAll();
	}

}
