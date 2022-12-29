package com.java;

public class Manutention extends Employe {
private int nbh;

public Manutention(String nom, String prenom, String dateES, int age, int nbh) {
	super(nom, prenom, dateES, age);
	this.nbh = nbh;
}

@Override
public double calculerSalaire() {
	return nbh*65;
}

@Override
public String toString() {
	return "Le manutentionnaire ";
}


}
