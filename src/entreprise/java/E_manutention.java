package entreprise.java;

public class E_manutention extends Employe {
	private int nbh;//le nombre f'heures de travail

	public E_manutention(String nom, String prenom,int age, int nbh) 
	{
		super(nom, prenom,age);
		this.nbh = nbh;
	}

	@Override
	public double calculerSalaire() {
		return nbh*3;
	}

	@Override
	public String toString() {
		return "Le manutentionnaire ";
	}
}

