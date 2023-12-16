package sorting.colletion;

import java.util.HashMap;

public class StudentMap {

	public static void main(String[] args) {
		HashMap<Students, String> hashMap = new HashMap<Students, String>();
		hashMap.put(new Students(101, "java"), "  Kajal");
		hashMap.put(new Students(102, "c++"), "  Mohen");
		hashMap.put(new Students(103, "java"), "  Messi");
		hashMap.put(new Students(101, "java"), "  Ullu");
		System.out.println(hashMap);
	}

}
