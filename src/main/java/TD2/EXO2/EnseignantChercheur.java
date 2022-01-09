package TD2.EXO2;


	
	public class EnseignantChercheur extends Enseignant {
		
		 public EnseignantChercheur(String n, String p, int h) {
			super(n, p, h);
			// TODO Auto-generated constructor stub
		}

		public float cout() {
		 return (2000*12+(this.heuresCours-192)*40)*charges;
		 }
		}



