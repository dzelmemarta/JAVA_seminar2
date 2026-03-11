package model;

public class Course {
	
	
	// 1. - privatie mainigie
	private long courseId;
	private String title;
	private byte creditPoints;
	private Professor professor; // TODO: piesaistit vairakus profs
	private static long counter = 27000;
	
	// 2. getters
	// 3. setters
	
	public long getCourseId() {
		return courseId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public byte getCreditPoints() {
		return creditPoints;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setCourseId() {
		courseId = counter;
		counter++;
	}
	
	public void setTitle(String inputTitle) {
		if((inputTitle != null) && inputTitle.matches("[A-Z]{1}[A-Za-z0-9]{1, 40}"))
		{
			title = inputTitle;
		}else 
		{
			title = "Unknown";
		}
	}
	
	public void setCreditPoints(byte inputCreditPoints) {
		if(inputCreditPoints >= 1 && inputCreditPoints <= 30) {
			creditPoints = inputCreditPoints;
		}else 
		{
			creditPoints = 1;
		}
	}
	
	public void setProfessor(Professor inputProfessor) {
		if(inputProfessor != null)
		{
			professor = inputProfessor;
		}else 
		{
			professor = new Professor();
		}
	}
	
	// 4. b4z argumenta kontruktors
	
	public Course() {
		setCourseId();
		setTitle("JAVA");
		setCreditPoints((byte)6);
		setProfessor(new Professor());
	}
	
	// 5. argumenta kontruktors
	
	public Course(String inputTitle, byte inputCreditPoints, Professor inputProfessor) {
		setCourseId();
		setTitle(inputTitle);
		setCreditPoints(inputCreditPoints);
		setProfessor(inputProfessor);
	}
	
	// 5.toString
	// 7. papildus

}
