package TD2.EX01.question3;

public class Fiction extends Emission{
	private String realisateur ;
	private boolean rediffusion ;
	private int duree, annee ;
	public Fiction (String n,String real,boolean redif,int d ){
	nom = n ; realisateur = real ; rediffusion = redif ;
	duree = d ;
	 }
	public void Affiche(){
	super.Affiche() ;
	 System.out.println("Réalisateur :" + realisateur) ;
	 System.out.println("Duree :" + duree) ;
	 System.out.println("Année de réalisation :" + annee) ;
	if ( rediffusion )
	 System.out.println("C'est une rediffusion") ;
	else
	 System.out.println("Première Diffusion !") ;
	 }
	public boolean Programmer(int heure) {
		if ( rediffusion || heure == 21 ) {
		heure_debut = heure ;
		heure_fin = heure + duree ;
		return true ;
		 } else
		return false ;
		 } 
}
