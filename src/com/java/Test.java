package com.java;

public class Test {

	public static void main(String[] args) {
Personnel p=new Personnel();
Employe e1 = new Producteur("user1","user1","30-01-2021",30,500);
Commercial e2 = new Vente("user2","user2","30-01-2021",38,30000);
Representation e3=new Representation ("user3","user3","30-01-2021",40,30000);
Producteur e4=new ProducteurR ("user4","user4","30-01-2021",41,450);
Manutention e5=new ManutentionR ("user5","user5","30-01-2021",40,50);
p.addE(e1);
p.addE(e2);
p.addE(e3);
p.addE(e4);
p.addE(e5);
System.out.println("Le salaire moyen est "+p.salaireM()+"dinars");
p.afficherSalaire();
	}
}
