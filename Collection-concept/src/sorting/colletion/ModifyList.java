package sorting.colletion;

import java.util.ArrayList;

public class ModifyList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Raju");
		list.add("Kumar");
		list.add("Moti");
		System.out.println(list);
		for(String name:list) {
			System.out.println(name);
			list.remove(name);
		}
		System.out.println(list);
	}

}
