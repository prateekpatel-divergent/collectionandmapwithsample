package com.divergent.collections.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Student Class for sort name
 * 
 * @author Divergent
 *
 */
class Student implements Comparable<Student> {
	int roll_no;
	String name;
	int age;

	Student(int roll_no, String name, int age) {
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student st) {

		if (age == st.age) {
			return 0;
		} else if (age > st.age) {
			return 1;
		} else {
			return -1;
		}
	}
}

public class ComaprableSortUsed {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(101, "Raju", 18));
		list.add(new Student(102, "shamu", 15));
		list.add(new Student(103, "Ravi", 14));
		list.add(new Student(104, "Rahul", 16));

		Collections.sort(list);
		for (Student stu : list) {
			System.out.println("Roll No: " + stu.roll_no + " Name: " + stu.name + " Age: " + stu.age);
		}
	}

}
