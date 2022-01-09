package TD1;

public class Personnel {
	Employe[] tabEmp = new Employe[100];
	int nbEmp = 0;
	Responsable[] tabResp = new Responsable[10];
	int nbResp = 0;
	double montant;
	Employe e;

	Employe chercherEmploye(String matr) {
		for (int i = 0; i < nbEmp; i++) {
			if (tabEmp[i].Matricule == matr) {
				return tabEmp[i];
			}
		}
		return null;
	}

	void ajouterEmploye(Employe e) {
		if (chercherEmploye(e.Matricule) == null) {
			tabEmp[nbEmp] = e;
			nbEmp++;
		}
	}

	void ajouterResponsable(Responsable r) {
		if (chercherEmploye(r.Matricule) == null) {
			ajouterEmploye(r);
			tabResp[nbResp] = r;
			nbResp++;
		}
	}

	public void AfichagePersonnel() {
		
		System.out.println("la liste des employes confondus "+ "\n");
		for (int i = 0; i < nbEmp; i++) {
			
			
			System.out.println(tabEmp[i].toString());

		}
	}

	void afficheHierarchie() {
		for (int i = 0; i < nbResp; i++) {
			
		tabResp[i].afficheSubordonnesDirects();
			System.out.println();
		}
	}

	double totalSalaires() {
		double somme = 0;
		for (int i = 0; i < nbEmp; i++) {
			somme = somme + tabEmp[i].CalculSalaire(montant, e);
		}
		return somme;
	}
}
