package com.java;
import java.util.*;
public class Personnel {
private ArrayList<Employe>collection;
public Personnel()
{
	collection=new ArrayList<Employe>();
}
public void addE(Employe e)
{
	if(!collection.contains(e))
		collection.add(e);
	else
		System.out.println("L'employe existe déja");
}
public void afficherSalaire()
{
	for (Employe e:collection)
		System.out.println(e.getNom()+" touche "+e.calculerSalaire()+" dinars ");
}
public double salaireM()
{
	double s=0,m;
	for(Employe e:collection)
	{
		s+=e.calculerSalaire();
	}
	m=s/collection.size();
	return m;
}
}
