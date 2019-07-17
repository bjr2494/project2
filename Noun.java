package edu.acc.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Noun implements Serializable {

	private static final long serialVersionUID = 1L;
	private boolean plural;
	private String chars;

	// For simplicity, I'm leaving off the override of toString() and customized
	// constructor

	public static String getRandomNoun() {
		ArrayList<String> nouns = new ArrayList<>();
		nouns.add("country");
		nouns.add("test");
		nouns.add("movie");
		nouns.add("demonstration");
		nouns.add("carriage");
		nouns.add("provocation");
		nouns.add("policy");
		nouns.add("series");
		nouns.add("thought");
		nouns.add("basis");
		nouns.add("boyfriend");
		nouns.add("direction");
		nouns.add("strategy");
		nouns.add("technology");
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
}
