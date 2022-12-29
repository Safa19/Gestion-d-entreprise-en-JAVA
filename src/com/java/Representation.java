package com.java;

public class Representation extends Commercial {

	public Representation(String nom, String prenom, String dateES, int age, double chiffreA) {
		super(nom, prenom, dateES, age, chiffreA);
		this.chiffreA=chiffreA;
	}

	@Override
	public double calculerSalaire() {
		return ((this.chiffreA*0.2)+800);//this.chiffreA car cet attribut est protected dans la classe Commercial
	}

	@Override
	public String toString() {
		return "Le représentateur ";
	}

}
