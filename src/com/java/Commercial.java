package com.java;

public abstract class Commercial extends Employe{
protected double chiffreA;

public Commercial(String nom, String prenom, String dateES, int age, double chiffreA) {
	super(nom, prenom, dateES, age);
	this.chiffreA = chiffreA;
}

public double getChiffreA() {
	return chiffreA;
}
public abstract double calculerSalaire(); 
}