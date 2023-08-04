package com.VCenter.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.VCenter.Entity.VacinationCenter;
import com.VCenter.Service.VCservice;

@RestController
public class VCcontroller {
	
	@Autowired
	VCservice serve;
	
	@GetMapping("/vaccinationcenter")
	public List<VacinationCenter> Citizens(){
		return serve.getAll();
	}
	
	@PostMapping("/addVC")
	public String Add(VacinationCenter VC) {
		System.out.println(VC.getVCity()+VC.getVname());
		serve.addVC(VC);
		return "Added Successfully";
	}
	
	@GetMapping("vaccinationcenter/{id}")
	public Optional<VacinationCenter> getbyid(@PathVariable("id") Long id) {
		return serve.get(id);
	}
	
	@PutMapping("/vaccinationcenter/")
	public String updater(@RequestBody VacinationCenter VC) {
		serve.update(VC.getVid(), VC);
		return "Updated VC Successfully";
	}
	
	@DeleteMapping("/vaccinationcenter/{id}")
	public String Delte(@PathVariable Long id) {
		return serve.Delete(id);
	}
	
	
}
