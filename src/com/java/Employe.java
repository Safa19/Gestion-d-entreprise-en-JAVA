package com.java;

public abstract class Employe {
protected String nom,prenom,dateES;
protected int age;
public abstract double calculerSalaire();
public String getNom() {
	return this+nom.toUpperCase()+" "+prenom;//this appel toString de l'objet référencé
}
public String getPrenom() {
	return prenom;
}
public String getDateES() {
	return dateES;
}
public int getAge() {
	return age;
}
public Employe(String nom, String prenom, String dateES, int age) {
	this.nom = nom;
	this.prenom = prenom;
	this.dateES = dateES;
	this.age = age;
}
@Override
public String toString() {
	return "L'employe ";
}

}
