package model;

public class Person {

	// 1. mainigie
	private String name;
	private String surname;
	private String personCode;


	// 2. get funkcijas


	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String personCode() {
		return personCode;
	}

	// 3. set funkcijas

	public void setName(String inputName) {
		if((inputName != null) && (inputName.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))) {
			name = inputName;
		}else {
			name = "Unknown";
		}
	}

	public void setSurname(String inputSurname) {
		if((inputSurname != null) && (inputSurname.matches("[A-Z]{1}[a-z]{2,15}([-]{1}[A-Z]{1}[a-z]{2,15})?"))) {
			surname = inputSurname;
		}else {
			surname = "Unknown";
		}
	}

	public void setPersonCode(String inputPersonCode) {
		if((inputPersonCode != null) && inputPersonCode.matches("[0-9]{6}[-][0-9]{5}")) {
			personCode = inputPersonCode;
		}else {
			personCode = "Unknown";
		}
	}

}
