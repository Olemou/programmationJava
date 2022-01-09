package TD2.EX01.question2;

public class Fiction extends Emission{
	private String realisateur ;
	private boolean rediffusion ;
	private int duree, annee ;
	public Fiction (String n,String real,
	 boolean redif, int d ){
	 nom = n ; realisateur = real ;
	 rediffusion = redif ; duree = d ;
	 }
	public String toString() {
	 return super.toString()+" : "+realisateur.toString();
}
}