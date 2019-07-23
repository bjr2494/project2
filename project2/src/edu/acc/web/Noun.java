package edu.acc.web;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Noun implements Serializable {

	private static final long serialVersionUID = 1L;
	private boolean plural;
	private String chars;

	public static String getRandomNoun() {
		List<String> nouns = Arrays.asList("country", "test", "movie",
				"demonstration","carriage", "provocation", "policy", "series", "thought", "basis", "boyfriend", "direction", "strategy",
				"technology");
		Random rand = new Random();
		return nouns.get(rand.nextInt(nouns.size()));
	}

	public void setPlural(boolean plural) {
		this.plural = plural;
	}

	public boolean getPlural() {
		return plural;
	}

	public void setChars(String chars) {
		this.chars = chars;
	}

	public String getChars() {
		return chars;
	}
	
	@Override
	public String toString() {
		return Noun.getRandomNoun();
	}
}
