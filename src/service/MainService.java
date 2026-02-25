package service;

import model.Student;

public class MainService {

	public static void main(String[] args) {
		// datu tips 	nosaukums 	= 	new konstrutors:
		Student stud1 = new Student();
		System.out.println(stud1);
		Student stud2 = new Student("Rendijs", "Serna", "123456-12345");
		System.out.println(stud2);
		Student stud3 = new Student("e472", "Se2dna", null);
		System.out.println(stud3);
	}

}
