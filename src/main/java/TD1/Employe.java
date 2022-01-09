package TD1;

public class Employe {
	 String nom;
	String Matricule;
double montant;
double indiceSalariale;

	// question1
	// a)caracterisitique employe
	public Employe(String nom, String matricule, double indiceSalariale) {

		this.nom = nom;
		Matricule = matricule;
		this.indiceSalariale = indiceSalariale;
	}

	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", Matricule=" + Matricule + ", indiceSalariale=" + indiceSalariale + "]";
	}

	public Employe() {

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMatricule() {
		return Matricule;
	}

	public void setMatricule(String matricule) {
		Matricule = matricule;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public double getIndiceSalariale() {
		return indiceSalariale;
	}

	public void setIndiceSalariale(double indiceSalariale) {
		this.indiceSalariale = indiceSalariale;
	}
	// b calcul salaire

	public double CalculSalaire(double montant, Employe employe) {
		double indice = employe.getIndiceSalariale();
		double salaire = montant * indice;
		return salaire;
	}

}
