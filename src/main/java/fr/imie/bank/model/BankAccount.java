package fr.imie.bank.model;

import fr.imie.bank.model.Person;

public class BankAccount extends Person {

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

}
