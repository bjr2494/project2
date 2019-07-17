package edu.acc.web;

import java.io.Serializable;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Article implements Serializable {

	private static final long serialVersionUID = 1L;
	private boolean definite;
	private String characters;

	// For simplicity, I'm leaving off the override of toString() and customized
	// constructor

	public static String getRandomArt() {
		ArrayList<String> arts = new ArrayList<>();
		arts.add("a");
		arts.add("the");
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