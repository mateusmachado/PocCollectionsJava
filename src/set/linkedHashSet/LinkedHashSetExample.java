package set.linkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		set.add("Z");
		set.add("PQ");
		set.add("N");
		set.add("O");
		set.add("KK");
		set.add("FGH");
		System.out.println(set);
		
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(99);
		set2.add(7);
		set2.add(0);
		set2.add(67);
		set2.add(66);
		System.out.println(set2);
	}
}