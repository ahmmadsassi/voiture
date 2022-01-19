package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Mat extends JpaRepository<Mat, Integer>{
	
}
