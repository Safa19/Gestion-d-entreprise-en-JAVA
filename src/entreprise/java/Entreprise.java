package entreprise.java;
import java.util.*;
public class Entreprise {
	private String nom;
	private int i=0;
	private ArrayList<Employe>collection;
	public Entreprise()//constructeur d'initialisation
	{
		collection=new ArrayList<Employe>();
	}
	public int chercher(String nom,String prenom)
	{
		for(Employe e:collection)
			{if((e.getNom()==nom)&&(e.getPrenom()==prenom))
				return i;
			else 
				i=i+1;
			}
		return -1; //l'employé n'est pas trouvé
	}
	public boolean ajouter(E_Vente e)
	{
		if(!collection.contains(e))
			{collection.add(e);
			return true;
			}
		else
			return false;
	}
	public boolean ajouter(E_manutention s)
	{
		if(!collection.contains(s))
			{collection.add(s);
			return true;
			}
		else
			return false;
	}
	public void List_employe(double m)
	{
		for (Employe e:collection)
			if(e.calculerSalaire()>m)
				System.out.println(e);
	}
	@Override
	public String toString() {
		return "L'entreprise ";
	}
}
