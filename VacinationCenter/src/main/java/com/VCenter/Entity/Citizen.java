package com.VCenter.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Citizen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String name;
	@Column
	private String city;
	@Column
	private int doses;
	@Column
	private String status="Not Vacinated";
	@OneToOne(cascade = CascadeType.ALL)
	private VacinationCenter vCenter;
	
	public Citizen() {
		
	}

	public Citizen(long id, String name, String city, int doses, String status, VacinationCenter vCenter) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.doses = doses;
		this.status = status;
		this.vCenter = vCenter;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getDoses() {
		return doses;
	}

	public void setDoses(int doses) {
		this.doses = doses;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public VacinationCenter getvCenter() {
		return vCenter;
	}

	public void setvCenter(VacinationCenter vCenter) {
		this.vCenter = vCenter;
	}

	
}
