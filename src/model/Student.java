package model;

public class Student {

	// 1. mainigie
	private long studId;
	private String name;
	private String surname;
	private String personCode;
	
	// Paligmainigais kam nevajag ne set, ne get
	private static long counter = 0;
	
	// 2. get funkcijas
	public long getStudId() {
		return studId;
	}
	
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
	public void setStudId() {
		studId = counter;
		counter++;
	}
	
	public void setName(String inputName) {
		if((inputName != null) && (inputName.matches("[A-Z]{1}[a-z]{2,15}([ ][1][A-Z]{1}[a-z]{2,15})?"))) {
			name = inputName;
		}else {
			name = "Unknown";
		}
	}
	
	public void setSurname(String inputSurname) {
		if((inputSurname != null) && (inputSurname.matches("[A-Z]{1}[a-z]{2,15}([-][1][A-Z]{1}[a-z]{2,15})?"))) {
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
	
	
	// 4.1. bezargumenta konstruktors
	public Student() {
		setStudId();
		setName("Janis");
		setSurname("Berzins-Kalnins");
		setPersonCode("121212-12345");
	}
	
	// 4.2. argumenta konstruktors
	
	
	public Student(String inputName, String inputSurname, String inputPersonCode) {
		setStudId();
		setName(inputName);
		setSurname(inputSurname);
		setPersonCode(inputPersonCode);
	}
	
	// 5. toString funkcija
	@Override	
	public String toString() {
		String result = studId + ": " + name + " " + surname + "(" + personCode + ")";
		return result;
	}
	
	// 6. Parejas pec nepieciesamibas

}
