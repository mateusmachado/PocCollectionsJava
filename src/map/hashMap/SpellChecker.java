package map.hashMap;

import java.util.HashMap;
import java.util.Map;

public class SpellChecker {
	public static void main(String[] args) {
		Map<String, String> misspeltWords = new HashMap<String, String>();
		misspeltWords.put("calendar", "calendar");
		misspeltWords.put("tomatos", "tomatoes");
		misspeltWords.put("existance", "existence");
		misspeltWords.put("aquaintance", "acquaintance");
		String sentence = "Buy a calendar for the year 2013";
		System.out.println("The given sentence is: " + sentence);
		for (String word : sentence.split("\\W+")) {
			if (misspeltWords.containsKey(word)) {
				System.out.println("The correct spelling for " + word + " is: " + misspeltWords.get(word));
			}
		}
	}
}