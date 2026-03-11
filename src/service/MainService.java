package service;

import java.util.ArrayList;
import java.util.Arrays;

import model.Course;
import model.Grade;
import model.Professor;
import model.Student;
import model.enums.ProfDegree;

public class MainService {
	
	private static ArrayList<Student> allStudents = new ArrayList<Student>();
	private static ArrayList<Professor> allProfessors = new ArrayList<Professor>();
	private static ArrayList<Course> allCourses = new ArrayList<Course>();
	private static ArrayList<Grade> allGrades = new ArrayList<Grade>();

	public static void main(String[] args) {
		
		System.out.println("---------------- STUDENTS -----------------");
		
		// datu tips 	nosaukums 	= 	new konstrutors:
		Student stud1 = new Student();
		Student stud2 = new Student("Rendijs", "Serna", "123456-12345");
		Student stud3 = new Student("e472", "Se2dna", null);
		
		allStudents.add(stud1);
		allStudents.add(stud2);
		allStudents.add(stud3);
		
		for(Student tempS : allStudents) {
			System.out.println(tempS);
		}
		
		
		
		System.out.println("---------------- PROFS -----------------");
		
		Professor prof1 = new Professor();
		Professor prof2 = new Professor("Vairis", "Caune", ProfDegree.phd, "123456-12345");
		Professor prof3 = new Professor("Galina", "Hilkevica", ProfDegree.phd, "654321-12345");
		
		allProfessors.addAll(Arrays.asList(prof1, prof2,prof3));
		System.out.println(allProfessors);
		
		System.out.println("---------------- COURSES -----------------");
		
		Course course1 = new Course();
		Course course2 = new Course("Algoritmu teorija", (byte)4, prof2);
		
		allCourses.addAll(Arrays.asList(course1, course2));
		System.out.println(allCourses);
		
		System.out.println("---------------- GRADES -----------------");
		
		Grade grade1 = new Grade();		
		Grade grade2 = new Grade(7, stud2, course1);
		
		allGrades.addAll(Arrays.asList(grade1, grade2));
		System.out.println(allGrades);
		
	}

}
