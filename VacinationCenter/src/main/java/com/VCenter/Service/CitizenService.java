package com.VCenter.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VCenter.Entity.Citizen;
import com.VCenter.Repository.CitizenRepo;

@Service
public class CitizenService {

	@Autowired
	CitizenRepo Crepo;
	
	public String addCitizen(Citizen C) {
		Crepo.save(C);
		return "Succesfully Added";		
	}
	
	public List<Citizen> getAll(){
		return (List<Citizen>) Crepo.findAll();
	}
	
	public Optional<Citizen> get(Long id) {
		return Crepo.findById(id);
	}
	
	public String update(long id ,Citizen C) {
		
		if(Crepo.findById(id).isPresent()) {
			Citizen updatable = Crepo.findById(id).get();
			updatable.setName(C.getName());
			updatable.setCity(C.getCity());
			updatable.setStatus(C.getStatus());
			Crepo.save(updatable);
			return "Updated Succesfully";
		}
		else
			return "Opps Something Went Wrong";
		}
	
	
	public String Delete(Long id) {
		Crepo.deleteById(id);
		return "Deleted Succesfully";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
