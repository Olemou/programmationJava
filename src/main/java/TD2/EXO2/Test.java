package TD2.EXO2;

public class Test {
	public static void main(String[] args) {
		
		EnseignantChercheur enseignantcheurcheur=new EnseignantChercheur("sarr", "paul", 45);
		System.out.println("le cout EnseignantChercheur"+" "+ enseignantcheurcheur.cout());
		System.out.println();
		Doctorant doc=new Doctorant("felix", "olemou", 40);
		System.out.println("cout docorant"+"     "+doc.cout());
		System.out.println();
		Vacataire vac=new Vacataire("Diallo", "cherif", 78, "ugb");
		System.out.println("cout"+"  "+vac.cout());
		
}
}