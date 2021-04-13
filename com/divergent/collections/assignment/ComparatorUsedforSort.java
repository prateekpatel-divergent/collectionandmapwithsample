package com.divergent.collections.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Employee Data sort by Name on basis of lenght
 * 
 * @author Divergent
 *
 */

class Employee {
	int id;
	String name;
	String department;

	Employee(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}
}

/**
 * Compare Name accounding to the Name
 * 
 * @author Divergent
 *
 */
class NameCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		Employee e1 = (Employee) emp1;
		Employee e2 = (Employee) emp2;

		return e1.name.compareTo(e2.name);
	}
}

public class ComparatorUsedforSort {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Raj", "Electrical"));
		list.add(new Employee(2, "Rohit", "Account"));
		list.add(new Employee(4, "Ajay", "Gradendepart"));
		list.add(new Employee(5, "Sanju", "Building Depart"));

		Collections.sort(list, new NameCompare());
		list.forEach((name) -> System.out
				.println("Id : " + name.id + "   Name: " + name.name + "   Department:  " + name.department));

	}

}
