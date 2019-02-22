package fr.imie.bank.model;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class PersonDaoCsvImpl implements PersonDao {

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		FileWriter test = new FileWriter("MonFichier.csv", true) ;
		try {
			BufferedReader reader1 = new BufferedReader(new FileReader("Monfichier.csv")) ;
			String currentLine ; 
			System.out.println(reader1.readLine());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Person findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAll(List<Person> people) {
		
		FileWriter fileWriter = new FileWriter("MonFichier1.csv", true);
		fileWriter.write("Compte ; Prénom ; Nom ; Date de naissance ; Email; \r\n");
		for (int i = 0; i < personnes.size(); i++) {
			fileWriter.write(personnes.get(i).toString() + "\r\n");
		}
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}
}
