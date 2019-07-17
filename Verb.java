package edu.acc.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Verb implements Serializable {
	private boolean stative;
	private boolean thirdPersonPlural;
	private boolean simplePresent;
	private boolean simplePast;

	// For simplicity, I'm leaving off the override of toString() and customized
	// constructor
	// AND getters and setters

	public static String getRandomVerb() {
		ArrayList<String> verbs = new ArrayList<>();
		verbs.add("captures");
		verbs.add("jostles");
		verbs.add("slips");
		verbs.add("launches");
		verbs.add("shines");
		verbs.add("commands");
		verbs.add("magnifies");
		verbs.add("demolishes");
		verbs.add("mystifies");
		verbs.add("oppresses");
		verbs.add("drags");
		verbs.add("modifies");
		verbs.add("discerns");
		verbs.add("plunges");
		Random rand = new Random();
		return verbs.get(rand.nextInt(verbs.size()));
	}
}
