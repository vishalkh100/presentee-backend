package net.pantherStudios.springboot.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "employee_name")
	private String employee_name;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "res_address")
	private String res_address;

	@Column(name = "perm_address")
	private String perm_address;

	@Column(name = "contact")
	private String contact;

	@Column(name = "acc_number")
	private String acc_number;

	@Column(name = "ifsc")
	private String ifsc;

	@Column(name = "esic")
	private String esic;

	@Column(name = "pt")
	private String pt;

	@Column(name = "aadhaar")
	private String aadhaar;

	@Column(name = "pan")
	private String pan;

	@Column(name = "rate")
	private String rate;
	
	public Employee() {
		
	}
	
	public Employee(String employee_name, Date dob, String res_address, String perm_address, String contact, String acc_number,
		String ifsc, String esic, String pt, String aadhaar, String pan, String rate) {
		super();
		this.employee_name = employee_name;
		this.dob = dob;
		this.res_address = res_address;
		this.perm_address = perm_address;
		this.contact = contact;
		this.acc_number = acc_number;
		this.ifsc = ifsc;
		this.esic = esic;
		this.pt = pt;
		this.aadhaar = aadhaar;
		this.pan = pan;
		this.rate = rate;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmployee_name() {
		return this.employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getRes_address() {
		return this.res_address;
	}

	public void setRes_address(String res_address) {
		this.res_address = res_address;
	}

	public String getPerm_address() {
		return this.perm_address;
	}

	public void setPerm_address(String perm_address) {
		this.perm_address = perm_address;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAcc_number() {
		return this.acc_number;
	}

	public void setAcc_number(String acc_number) {
		this.acc_number = acc_number;
	}

	public String getIfsc() {
		return this.ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getEsic() {
		return this.esic;
	}

	public void setEsic(String esic) {
		this.esic = esic;
	}

	public String getPt() {
		return this.pt;
	}

	public void setPt(String pt) {
		this.pt = pt;
	}

	public String getAadhaar() {
		return this.aadhaar;
	}

	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}

	public String getPan() {
		return this.pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getRate() {
		return this.rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

}
