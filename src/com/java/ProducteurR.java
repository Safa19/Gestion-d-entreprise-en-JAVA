package com.java;

public class ProducteurR extends Producteur implements IRisque{

	public ProducteurR(String nom, String prenom, String dateES, int age, int nbu) {
		super(nom, prenom, dateES, age, nbu);
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
		return "Le producteur en risque ";
	}

}
