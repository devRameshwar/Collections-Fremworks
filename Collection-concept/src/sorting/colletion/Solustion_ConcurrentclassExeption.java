package sorting.colletion;

import java.util.ArrayList;
import java.util.Iterator;

public class Solustion_ConcurrentclassExeption {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Raju");
		list.add("Kumar");
		list.add("Moti");
		System.out.println(list);
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
			iterator.remove();
		}
		System.out.println(list);
	}
}
