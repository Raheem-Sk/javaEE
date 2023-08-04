package com.VCenter.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class VacinationCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Vid;
	@Column
	private String Vname;
	@Column
	private String VCity;
	@OneToOne(mappedBy = "vCenter")
	private Citizen citizen;
	
	public VacinationCenter() {

	}

	public VacinationCenter(long vid, String vname, String vcity) {
		super();
		this.Vid = vid;
		this.Vname = vname;
		this.VCity = vcity;
	}

	public long getVid() {
		return Vid;
	}

	public void setVid(long vid) {
		this.Vid = vid;
	}

	public String getVname() {
		return Vname;
	}

	public void setVname(String vname) {
		this.Vname = vname;
	}

	public String getVCity() {
		return VCity;
	}

	public void setVCity(String vcity) {
		this.VCity = vcity;
	}

}
