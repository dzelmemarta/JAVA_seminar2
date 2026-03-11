package model;

public class Grade {
	
	// 1. lokalie mainigie
	
	private long gradeId;
	private int gradeValue;
	private Student student;
	private Course course;
	
	private static long counter = 30000;
	
	
	// 2. getters
	// 3. setters
	
	public long getGradeId() {
		return gradeId;
	}

	public void setGradeId() {
		gradeId = counter;
		counter++;
	}

	public int getGradeValue() {
		return gradeValue;
	}

	public void setGradeValue(int inputGradeValue) {
		if(inputGradeValue >= 1 && inputGradeValue <=10) {
			gradeValue = inputGradeValue;
		}else {
			gradeValue = 1;
		}
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student inputStudent) {
		if(inputStudent != null) {
			student = inputStudent;
		}else {
			student = new Student();
		}
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course inputCourse) {
		if(inputCourse != null) {
			course = inputCourse;
		}else {
			course = new Course();
		}
	}
	
	// 4. bezargumenta kontruktors
	
	public Grade() {
		setGradeId();
		setGradeValue(5);
		setStudent(new Student());
		setCourse(new Course());
	}
	
	// 5. argumenta konstrutors
	
	public Grade(int inputGradeValue, Student inputStudent, Course inputCourse) {
		setGradeId();
		setGradeValue(inputGradeValue);
		setStudent(inputStudent);
		setCourse(inputCourse);
	}
	
	// 6. toString
	
	@Override	
	public String toString() {
		String result = gradeId + ": " + gradeValue + " " + student.getName().charAt(0) + ". " + student.getSurname() + " " + course.getTitle();
		return result;
	}
	
	// 7. parejas funkcijas

}
