package TD2.EXO5;

import java.util.ArrayList;

public class program {
	


	

         
   
            
          
	
	

		
	

	public void Rechercher(int ref,ArrayList<Article> stocke) {

		if (stocke.isEmpty()) {
			System.out.println("stocke vide");
		}
		for (Article art : stocke) {

			if (art.getNumeroReference() == ref) {
				System.out.println("l'article est present");
			}
			if (art.getNumeroReference() != ref) {
				System.out.println("l'article n'existe pas");
			}
		}

	}
	public void SuppressionArticle(ArrayList<Article> stocke,int ref) {
		
		if(stocke.isEmpty()) {
			System.out.println("liste  vide  impossible de supprimer");
		}
		
		for(int i=0;i< stocke.size();i++) {
			if(stocke.get(i).getNumeroReference()==ref) {
				
				stocke.remove(i);
				System.out.println("element supprimer");
			}
		}
	}
        
        public void Modifier(ArrayList<Article> stocke,int ref,Article article){
            
            if(stocke.isEmpty()) {
			System.out.println("liste  vide  impossible de supprimer");
		}
		
		for(int i=0;i< stocke.size();i++) {
			if(stocke.get(i).getNumeroReference()==ref) {
				
				stocke.set(i, article);
				System.out.println("element supprimer");
			}
		}
            
        }
        public void RechercherNom(ArrayList<Article> stocke, String nom){
            if (stocke.isEmpty()) {
			System.out.println("stocke vide");
		}
		for (Article art : stocke) {

			if (art.getNom().equals(nom) ){
				System.out.println("l'article est present");
			}
			if (!(art.getNom().equals(nom)) ){
				System.out.println("l'article n'existe pas");
			}
		}

            
        }
	 
}
