package com.VD2.Tuan6;

import java.util.ArrayList;

public interface IManagerVD3 {
	void addStudent(Student student);

	void editStudent(String masv, Student student);

	void removeStudent(String masv);

	Student findStudent(String masv);

	void sortByAge();

	void sortByScore();

	ArrayList<Student> findStudent(int age);

	void displayAIIStudents();
}
