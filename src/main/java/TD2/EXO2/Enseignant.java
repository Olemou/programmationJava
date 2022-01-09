package TD2.EXO2;

public abstract class Enseignant {
	 protected String nom,prenom;
	 protected int heuresCours;
	 protected static int charges = 1;
	 public Enseignant(String n, String p, int h) {
	 this.nom = n; this.prenom = p; this.heuresCours = h;
	 }
	 public abstract float cout();
	}

