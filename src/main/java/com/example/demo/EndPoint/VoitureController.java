package com.example.demo.EndPoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Voiture;
import com.example.demo.Service.VoitureService;

@RestController
@RequestMapping("/Voiture")
public class VoitureController {
	
	@Autowired
	private VoitureService voit;
	
	@GetMapping("/all")
	public List<Voiture> getVoiture(){
		return voit.getAll();
	}
}
