package entreprise.java;

public class E_Vente extends Employe {
	private double CH;
	private int nbu ;
	private double prix_vente; // nbu est la quantité vendue
	public E_Vente(String nom, String prenom,int age, int nbu , double prix_vente) {
		super(nom, prenom,age);
		this.nbu=nbu;
		this.prix_vente=prix_vente;
	}
	public double calculer_CH()
	{
		CH=prix_vente*nbu;
		return CH;
		
	}
	@Override
	public double calculerSalaire() {
		return this.CH*0.2;
	}

	@Override
	public String toString() {
		return "Le vendeur ";
	}
}
