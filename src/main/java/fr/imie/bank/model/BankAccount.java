package fr.imie.bank.model;

import java.util.ArrayList;
import java.util.List;

import fr.imie.bank.model.Person;

public class BankAccount {
	private List<Person> personnes2 = new ArrayList<Person>();
	private int number;
	

	public BankAccount(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public List<Person> getPersonnes2() {
		return personnes2;
	}

	public void setPersonnes2(List<Person> personnes2) {
		this.personnes2 = personnes2;
	}

}
