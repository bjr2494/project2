package edu.acc.web;

import java.io.Serializable;
import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class Article implements Serializable {

	private static final long serialVersionUID = 1L;
	private boolean definite;
	private String characters;

	public static String getRandomArt() {
		List<String> arts = Arrays.asList("a", "the");
		Random rand = new Random();
		return arts.get(rand.nextInt(arts.size()));
	}

	public void setDefinite(boolean definite) {
		this.definite = definite;
	}

	public boolean getDefinite() {
		return definite;
	}

	public void setCharacters(String characters) {
		this.characters = characters;
	}

	public String getCharacters() {
		return characters;
	}

}