package sorting.colletion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		HashSet<Employee> hashSet = new HashSet<Employee>();
		hashSet.add(new Employee(101, "Rani", 50000.0));
		hashSet.add(new Employee(103, "kaushik", 20000.0));
		hashSet.add(new Employee(102, "Raju", 10000.11));
		hashSet.add(new Employee(101, "Rani", 40000.0));
		System.out.println(hashSet);
		 
		ArrayList<Employee> arrayList = new ArrayList<Employee>(hashSet);
		
		Collections.sort(arrayList,new SortWithId());
		
	}
}
