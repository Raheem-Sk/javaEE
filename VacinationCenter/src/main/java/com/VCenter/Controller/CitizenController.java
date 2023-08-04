package com.VCenter.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.VCenter.Entity.Citizen;
import com.VCenter.Service.CitizenService;

@RestController
public class CitizenController {

	@Autowired
	CitizenService serve;
	
	@GetMapping("/citizens")
	public List<Citizen> Citizens(){
		return serve.getAll();
	}
	
	@PostMapping("/add")
	public String AddCitizen(@RequestBody Citizen Citizen) {
		return serve.addCitizen(Citizen);
	}
	
	@GetMapping("citizen/{id}")
	public Optional<Citizen> getbyid(@PathVariable("id") Long id) {
		return serve.get(id);
	}
	
	@PutMapping("/citizens/")
	public String updater(@RequestBody Citizen C) {
		serve.update(C.getId(), C);
		return "Updated Successfully";
	}
	
	@DeleteMapping("/citizens/{id}")
	public String Delte(@PathVariable Long id) {
		return serve.Delete(id);
	}
	
	
	
}
