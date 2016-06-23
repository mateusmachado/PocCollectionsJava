package set.hashSet;

import java.util.HashSet;
import java.util.Set;

class RemoveDuplicates {
	public static void main(String[] args) {
		String reallity = "work hard or go home!, work hard, play hard";
		Set<String> words = new HashSet<>();

		for (String word : reallity.split("\\W+"))
			words.add(word);

		System.out.println("Reallity: " + reallity);
		System.out.print("The words used were: ");
		System.out.println(words);
	}
}
