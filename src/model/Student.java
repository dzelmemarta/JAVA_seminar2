package model;

public class Student extends Person{

	// 1. mainigie
	private long studId;
	
	// Paligmainigais kam nevajag ne set, ne get
	private static long counter = 0;
	
	// 2. get funkcijas
	public long getStudId() {
		return studId;
	}
	
	// 3. set funkcijas
	public void setStudId() {
		studId = counter;
		counter++;
	}
	
	// 4.1. bezargumenta konstruktors
	public Student() {
		super(); // Izsauksies automatiski Person konstruktors; jabut pasam pirmajam ko izsauc
		setStudId();
	}
	
	// 4.2. argumenta konstruktors
	
	
	public Student(String inputName, String inputSurname, String inputPersonCode) {
		// izsauc person konstruktoru
		super(inputName, inputSurname, inputPersonCode);
		setStudId();
	}
	
	// 5. toString funkcija
	@Override	
	public String toString() {
		String result = studId + ": " + name + " " + surname + "(" + personCode + ")";
		return result;
	}
	
	// 6. Parejas pec nepieciesamibas

}
