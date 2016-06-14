package collections.set;

import java.util.*;
import java.util.stream.*;

public class FindDups {
	public static void main(String[] args) {
		Set<String> distinctWords = Arrays.asList("a", "a", "A", "b", "d").stream().collect(Collectors.toSet());
		System.out.println(distinctWords.size() + " distinct words: " + distinctWords);
	}
}
