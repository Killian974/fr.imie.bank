package fr.imie.bank.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Person {

	private List<BankAccount> acount = new ArrayList<BankAccount>();

	public String firstname;
	public String lastname;
	public LocalDate dateBirth;
	public String email;

	public Person(String firstname, String lastname, LocalDate dateBirth, String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateBirth = dateBirth;
		this.email = email;
	}

	public List<BankAccount> getAcount() {
		return acount;
	}

	public void setAcount(List<BankAccount> acount) {
		this.acount = acount;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public LocalDate getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(LocalDate dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return  acount + " ;"
				 + firstname + ";"
				 + lastname + "; "
				+ dateBirth + ";"
				+ email ;
	}
	
	

}
