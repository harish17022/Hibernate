package com.hospital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "hospital_table")
public class HospitalEntity {
	@Id
	@Column(name = "PATIENT_ID")
	private int patientID;
	
	@Column(name = "PATIENT_NAME")
	private String patientName;
	
	@Column(name = "PATIENT_AGE")
	private int patientAge;
	
	@Column(name = "PATIENT_DISEASE")
	private String patientDisease;
	
	@Column(name = "PATIENT_BILL")
	private int patientBill;

	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientDisease() {
		return patientDisease;
	}

	public void setPatientDisease(String patientDisease) {
		this.patientDisease = patientDisease;
	}

	public int getPatientBill() {
		return patientBill;
	}

	public void setPatientBill(int patientBill) {
		this.patientBill = patientBill;
	}
	public HospitalEntity() {
		
	}
	public HospitalEntity(int patientID, String patientName, int patientAge, String patientDisease, int patientBill) {
		super();
		this.patientID = patientID;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientDisease = patientDisease;
		this.patientBill = patientBill;
	}

	@Override
	public String toString() {
		return "HospitalEntity [patientID=" + patientID + ", patientName=" + patientName + ", patientAge=" + patientAge
				+ ", patientDisease=" + patientDisease + ", patientBill=" + patientBill + "]";
	}
	
	
}
