package model;

import model.enums.ProfDegree;

public class Professor {
	
	// 1. mainigie
	private long profId;
	private String name;
	private String surname;
	private String persCode;

	private ProfDegree degree;
	
	private static long counter = 10000;
	
	// 2. getters
	public long getProfId() {
		return profId;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public ProfDegree getDegree() {
		return degree;
	}
	public String getPersCode() {
		return persCode;
	}
	
	// 3. setters

	public void setName(String name) {
		if((name != null) && (name.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))) {
			this.name = name;
		}
	}
	
	public void setSurname(String surname) {
		if((surname != null) && (surname.matches("[A-Z]{1}[a-z]{2,15}([-]{1}[A-Z]{1}[a-z]{2,15})?"))) {
			this.surname = surname;
		}
	}
	
	public void setProfId() {
		profId = counter;
		counter++;
	}
	
	public void setPersCode(String persCode) {
		if((persCode != null) && persCode.matches("[0-9]{6}[-][0-9]{5}")) {
			this.persCode = persCode;
		}
	}
	
	public void setDegree(ProfDegree inputDegree) {
		if(inputDegree != null) {
			degree = inputDegree;
		}else {
			degree = ProfDegree.unknown;
		}
	}


	// 4.1. bezargumenta konstruktors
	public Professor() {
		setProfId();
		setName("Marks");
		setSurname("Ozolins");
		setDegree(ProfDegree.bachelor);
	}

	// 4.2. argumenta konstruktors


	public Professor(String inputName, String inputSurname, ProfDegree inputDegree, String persCode) {
		setProfId();
		setName(inputName);
		setSurname(inputSurname);
		setPersCode(persCode);
		setDegree(inputDegree);
	}

	// 5. toString funkcija
	@Override	
	public String toString() {
		String result = profId + ": " + name + " " + surname + "(" + degree + ")";
		return result;
	}
		
	// 6. Parejas pec nepieciesamibas
}
