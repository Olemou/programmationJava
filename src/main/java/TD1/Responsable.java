package TD1;

public class Responsable extends Employe {

	private String titre;

	Employe[] employeSubordonnee;

	public Responsable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Responsable(String nom, String matricule, double indiceSalariale, Employe[] e, String titre) {
		super(nom, matricule, indiceSalariale);
		employeSubordonnee = e;
		this.titre = titre;

		// TODO Auto-generated constructor stub
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	void afficheSubordonnesDirects() {
		System.out.println(" Responsable");
		System.out.println("#############################");
		System.out.println(this.toString());
		System.out.println("#############################");
		System.out.println("                ");
		
		System.out.println("les subordonnees directs");
		
		for (Employe employeSubordonnee1 : employeSubordonnee) {
			System.out.println("               ");

			System.out.println( employeSubordonnee1.toString());
			
		} 
		System.out.println("******************************************************");


	}

	@Override
	public String toString() {
		return "Responsable [titre=" + titre + ", nom=" + nom + ", Matricule=" + Matricule + ", indiceSalariale="
				+ indiceSalariale + "]";
	}

	
}
