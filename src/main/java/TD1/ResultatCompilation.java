package TD1;

public class ResultatCompilation {

	public static void main(String[] args) {
		Commercial c1, c2, c3;

		c1 = new Commercial("jean", "120", 0.);
		c1.enregistreVentes(1200);
		c2 = new Commercial("Alberto", "121", 12);
		c2.enregistreVentes(1100);
		c3 = new Commercial("John", "122", 17);
		c3.enregistreVentes(700);
		Employe[] t1 = { c1, c2, c3 };
		Responsable r1, r2, r3;
		r1 = new Responsable("Luis", "125", 20, t1, "directeur commercial");
		Employe e1, e2, e3;
		e1 = new Employe("Jerzy", "17", 15);
		e2 = new Employe("Ivan", "19", 14);
		e3 = new Employe("Joao", "21", 14);
		Employe[] t2 = { e1, e2, e3 };
		r2 = new Responsable("Helmut", "77", 21, t2, "directeur technique");
		Employe[] t3 = { r1, r2 };
		r3 = new Responsable("Jan", "301", 30, t3, "directeur");
		Personnel pers = new Personnel();
		pers.ajouterEmploye(c1);
		pers.ajouterEmploye(c2);
		pers.ajouterEmploye(c3);
		pers.ajouterEmploye(e1);
		pers.ajouterEmploye(e2);
		pers.ajouterEmploye(e3);
		pers.ajouterResponsable(r1);
		pers.ajouterResponsable(r2);
		pers.ajouterResponsable(r3);
		
		pers.AfichagePersonnel();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ ");
		System.out.println("               \n ");
		pers.afficheHierarchie();

	}

}
