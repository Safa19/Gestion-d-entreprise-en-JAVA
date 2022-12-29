package com.java;

public class Vente extends Commercial {

	public Vente(String nom, String prenom, String dateES, int age, double chiffreA) {
		super(nom, prenom, dateES, age, chiffreA);
		this.chiffreA=chiffreA;
	}

	@Override
	public double calculerSalaire() {
		return ((this.chiffreA*0.2)+400);
	}

	@Override
	public String toString() {
		return "Le vendeur ";
	}

}
