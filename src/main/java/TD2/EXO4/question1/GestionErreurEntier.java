package TD2.EXO4.question1;

import java.util.Scanner;

public class GestionErreurEntier {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc=new Scanner(System.in);
		 boolean chiffre = false;
         String input;
  System.out.println("donner un entier");
         do {
            
                input = sc.next();
             try {
                 System.out.println("### valeur correcte");
                 int x = Integer.parseInt(input);
                
                 chiffre = true;
                 sc.close();
               
                 
                 
             } catch (NumberFormatException e) {
                 System.out.println("valeur entree n'est pas entier recommencer");
                 
             }

         } while (chiffre != true);
	}

}
