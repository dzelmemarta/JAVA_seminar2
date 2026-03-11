package service;

import model.Course;
import model.Grade;
import model.Professor;
import model.Student;
import model.enums.ProfDegree;

public class MainService {

	public static void main(String[] args) {
		
		System.out.println("---------------- STUDENTS -----------------");
		
		// datu tips 	nosaukums 	= 	new konstrutors:
		Student stud1 = new Student();
		System.out.println(stud1);
		Student stud2 = new Student("Rendijs", "Serna", "123456-12345");
		System.out.println(stud2);
		Student stud3 = new Student("e472", "Se2dna", null);
		System.out.println(stud3);
		
		
		
		System.out.println("---------------- PROFS -----------------");
		
		Professor prof1 = new Professor();
		System.out.println(prof1);
		
		Professor prof2 = new Professor("Vairis", "Caune", ProfDegree.phd, "123456-12345");
		System.out.println(prof2);
		
		Professor prof3 = new Professor("Galina", "Hilkevica", ProfDegree.phd, "654321-12345");
		System.out.println(prof3);
		
		
		
		System.out.println("---------------- COURSES -----------------");
		
		Course course1 = new Course();
		System.out.println(course1);
		
		Course course2 = new Course("Algoritmu teorija", (byte)4, prof2);
		System.out.println(course2);
		
		
		System.out.println("---------------- GRADES -----------------");
		
		Grade grade1 = new Grade();
		System.out.println(grade1);
		
		Grade grade2 = new Grade(7, stud2, course1);
		System.out.println(grade2);
	}

}
