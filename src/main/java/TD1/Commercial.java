package TD1;

public class Commercial extends Employe {
	
	int venteDuMois;
	
	public Commercial() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commercial(String nom, String matricule, double indiceSalariale) {
		super(nom, matricule, indiceSalariale);
		// TODO Auto-generated constructor stub
	}
	void enregistreVentes(int i){
	venteDuMois = i;
	}
	int salaire(){
	return  (int) ((indiceSalariale *montant)+(venteDuMois/10));
	}

}
