package arrayList;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> languageList = new ArrayList<>();
		languageList.add("Java");
		languageList.add("C");
		languageList.add("C++");
		languageList.add("Scala");
		for (String language : languageList) {
			System.out.println(language);
		}
	}
}
