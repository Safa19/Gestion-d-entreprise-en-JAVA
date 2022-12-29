package com.java;

public class Salle {
private int numero;
private String code;
private String libelle;
private static int count;
public Salle(String code, String libelle) {
	this.numero=++count;
	this.code = code;
	this.libelle = libelle;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getLibelle() {
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public static int getCount() {
	return count;
}
public int getNumero() {
	return numero;
}
@Override
public String toString() {
	return "Salle numero "+numero + "libelle  "+ libelle ;
}

}
