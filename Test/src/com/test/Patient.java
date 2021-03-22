package com.test;

public class Patient {

	private String Name;
	
	private int Id;
	
	private String Status;
	
	private int contactNumber;
	
	
	
	private String allgeris;

	public String getAllgeris() {
		return allgeris;
	}

	public void setAllgeris(String allgeris) {
		this.allgeris = allgeris;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public static void main(String[] args) {
		System.out.println("Patient.main()");
		System.out.println("Patient");
	}
}
