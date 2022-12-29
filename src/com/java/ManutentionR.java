package com.java;

public class ManutentionR extends Manutention implements IRisque{

	public ManutentionR(String nom, String prenom, String dateES, int age, int nbh) {
		super(nom, prenom, dateES, age, nbh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return (super.calculerSalaire()+prime);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Le manutentionnaire en risque ";
	}

}
