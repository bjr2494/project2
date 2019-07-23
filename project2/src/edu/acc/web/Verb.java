package edu.acc.web;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Verb implements Serializable {

	private static final long serialVersionUID = 1L;
	private boolean stative;
	private boolean thirdPersonPlural;
	private boolean simplePresent;
	private boolean simplePast;

	public static String getRandomVerb() {
		List<String> verbs = Arrays.asList("captures", "jostles", "shakes", "launches", 
				"illuminates", "commands", "magnifies", "demolishes", "mystifies", 
				"oppresses", "drags", "modifies", "discerns", "plunges");
		Random rand = new Random();
		return verbs.get(rand.nextInt(verbs.size()));
	}
	
	public boolean isStative() {
		return stative;
	}

	public void setStative(boolean stative) {
		this.stative = stative;
	}

	public boolean isThirdPersonPlural() {
		return thirdPersonPlural;
	}

	public void setThirdPersonPlural(boolean thirdPersonPlural) {
		this.thirdPersonPlural = thirdPersonPlural;
	}

	public boolean isSimplePresent() {
		return simplePresent;
	}

	public void setSimplePresent(boolean simplePresent) {
		this.simplePresent = simplePresent;
	}

	public boolean isSimplePast() {
		return simplePast;
	}

	public void setSimplePast(boolean simplePast) {
		this.simplePast = simplePast;
	}

	@Override
	public String toString() {
		return Verb.getRandomVerb();
	}
}
