package sorting.colletion.data;

import java.util.TreeSet;

public class StudentsTree {

	public static void main(String[] args) {
		TreeSet<Students> treeSet = new TreeSet<Students>();
		treeSet.add(new Students(101, "Rahul", 987676542, 'M'));
		treeSet.add(new Students(102, "Aman", 289876567, 'M'));
		treeSet.add(new Students(103, "Suresh", 123456234, 'M'));
		treeSet.add(new Students(100, "Sivani", 987654323, 'F'));
		System.out.println(treeSet);
	}
}
