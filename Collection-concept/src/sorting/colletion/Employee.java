package sorting.colletion;

import java.util.Comparator;

public class Employee  {
	public int empId;
	public String empName;
	public double sallary;

	public Employee(int empId, String empName, double sallary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sallary = sallary;
	}

	@Override
	public String toString() {
		return empId + "\t" + empName + "\t" + sallary;
	}

}

class SortWithId implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.empId - o2.empId;
	}

}
