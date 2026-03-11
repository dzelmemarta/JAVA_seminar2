package model;

public class Person {

	// 1. mainigie
	// protected - lai var izmantot mantosana
	protected String name;
	protected String surname;
	protected String personCode;


	// 2. get funkcijas


	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getPersonCode() {
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
	
	// 4. no arg contr
	
	public Person() {
		setName("Anna");
		setSurname("Liepa");
		setPersonCode("212121-21212");
	}
	
	// 5. args constr
	
	public Person(String inpuName, String inputSurname, String inputPersCode) {
		setName(inpuName);
		setSurname(inputSurname);
		setPersonCode(inputPersCode);
	}
	
	// String
	
	@Override	
	public String toString() {
		String result = name + " " + surname + "(" + personCode + ")";
		return result;
	}

}
