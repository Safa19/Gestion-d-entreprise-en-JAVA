package com.java;

public class Producteur extends Employe {
private int nbu;

public Producteur(String nom, String prenom, String dateES, int age, int nbu) {
	super(nom, prenom, dateES, age);
	this.nbu = nbu;
}

@Override
public double calculerSalaire() {
	return nbu*5;
}

@Override
public String toString() {
	return "Le producteur ";
}

}
