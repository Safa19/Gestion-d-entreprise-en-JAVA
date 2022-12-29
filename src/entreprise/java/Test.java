package entreprise.java;

public class Test {
	
	public static void main(String[] args) {
		Entreprise E=new Entreprise();
		E_manutention e1 = new E_manutention ("user1","user1",30,50);
		E_Vente e2 = new E_Vente("user2","user2",38,1000,250);
		E_Vente e3=new E_Vente ("user3","user3",40,300,5000);
		E.ajouter(e1);
		E.ajouter(e2);
		E.ajouter(e3);
		System.out.println("Les employés ayant un salaire supérieur a 600 sont ");
		E.List_employe(600);
	}
}
