package com.VCenter.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VCenter.Entity.VacinationCenter;
import com.VCenter.Repository.Vrepo;

@Service
public class VCservice {

	@Autowired
	Vrepo Vrepo;
	
	public String addVC(VacinationCenter C) {
		Vrepo.save(C);
		return "Succesfully Added";		
	}
	
	public List<VacinationCenter> getAll(){
		return (List<VacinationCenter>) Vrepo.findAll();
	}
	
	public Optional<VacinationCenter> get(Long id) {
		return Vrepo.findById(id);
	}
	
	public String update(long id ,VacinationCenter V) {
		
		if(Vrepo.findById(id).isPresent()) {
			VacinationCenter updatable = Vrepo.findById(id).get();
			updatable.setVname(V.getVname());
			updatable.setVCity(V.getVCity());
			Vrepo.save(updatable);
			return "Updated Succesfully";
		}
		else
			return "Opps Something Went Wrong";
		}
	
	
	public String Delete(Long id) {
		Vrepo.deleteById(id);
		return "Deleted Succesfully";
	}
	
	
	
}
