package sorting.colletion.data;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Key_Value {

	public static void keyValue(TreeMap<Integer, String> treeMap) {
		System.out.println(treeMap);
		Set<Entry<Integer, String>> entrySet = treeMap.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();
			System.out.println(next.getKey());

		}
	}

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(106, "Rajesh");
		treeMap.put(102, "Raj");
		treeMap.put(103, "Rakesh");
		treeMap.put(105, "Raghu");
		treeMap.put(104, "Ranjit");
		treeMap.put(101, "Raushan");
		//keyValue(treeMap);
		
	}

}
