package TD2.EX01.question2;

public class Divertissement extends Emission {
	private String animateur ;
	private static final int duree = 2;
	public Divertissement(String n, String anim) {
	 nom = n ; animateur = anim ;
	 }
	public String toString() { // générée automatiquement
	 return super.toString()+" : "+animateur.toString();
}
}
