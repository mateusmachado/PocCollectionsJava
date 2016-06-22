package list.linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
	public static void main(String[] args) {
		String word = "Word";
		List<Character> words = new LinkedList<Character>();
		for (char ch : word.toCharArray()) {
			words.add(ch);
			System.out.println("Input string is: " + word);
			ListIterator<Character> iterator = words.listIterator();
			ListIterator<Character> revIterator = words.listIterator(words.size());
			boolean result = true;
			while (revIterator.hasPrevious() && iterator.hasNext()) {
				if (iterator.next() != revIterator.previous()) {
					result = false;
					break;
				}
			}
			if (result)
				System.out.print("Input string is something.. \n");
			else
				System.out.print("Input string is something.. \n");
		}
	}
}