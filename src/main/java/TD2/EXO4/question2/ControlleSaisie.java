package TD2.EXO4.question2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControlleSaisie {

	
	static class Inf10Exception extends Exception{
		public Inf10Exception(){
		super( "division par zéro" );
		 }
		public Inf10Exception(String msg){
		 super( msg );
		 }
		 }
		 static int saisieCorrecte () {
		 Scanner input = new Scanner(System.in);
		 int x = 0;
		 String s = null;
		do {
		try {
		System.out.println("entrez un entier -> ");
		x = input.nextInt();
		if(x<=10) throw new Inf10Exception();

          
		break;
		 }
		catch ( InputMismatchException e) {
	
		s = input.next();
		System.out.println(s+"n'est pas un entier");
		System.out.println("Erreur Recommencez");}
		catch ( Inf10Exception e) {
		System.out.println(x+" est inférieur ou égal à 10");
		System.out.println ("Erreur Recommencez");}
		 } while (true);
		return x;
} 

	public static void main(String[] args) {
		
		System.out.println("entier saisi : "+saisieCorrecte());
}
}