package TD2.EXO5;

import java.util.ArrayList;
import java.util.Scanner;

public class ResultTest {
	
	 public static byte menu() {
	        byte tmp=0;
	     
	        
	         
	        
	        
	       
	        
	        
	        
	        System.out.println();
	        System.out.println();
	        System.out.println("1 : Rechercher un artile Par reference");
	        System.out.println("2 : Ajouter un article");
	        System.out.println("3 suppression ");
	        System.out.println("4 : Modifier un article Par refernce");
	        System.out.println("5: Rechercher par nom");
	          System.out.println("6 : afficher");
	          System.out.println("7:quitter");
	        
	    Scanner scan = new Scanner(System.in); 
	 
	        tmp=scan.nextByte();
	        return tmp;
	        
	    }
	    public static void main(String[] args) {
	           byte choix=0; 
	        Scanner sc = new Scanner(System.in);
	        Article ar = new Article();
	        ArrayList<Article> stocke = new ArrayList<Article>();

	        
	        
	        do {
	         try{
	            choix= menu(); 
	         } catch(Exception e) {
	             System.out.println("Choisissez une option entre 1 et 5");
	             System.out.println("");
	             choix=menu();
	         }
	         
	        
	        
	        
	        
	        

	            
	            switch (choix) {
	                case 1:
	                    program prog = new program();
	                    System.out.println("donner la reference a chercher");
	                   
	                     boolean chiffres = false;
	                    String inputs;

	                    do {
	                        inputs = sc.next();

	                        try {
	                            System.out.println("###");
	                            int x = Integer.parseInt(inputs);
	                            
	                             prog.Rechercher(x, stocke);
	                            chiffres = true;

	                            // You can use this method to convert String to int, But if input 
	                            //is not an int  value then this will throws NumberFormatException. 
	                            System.out.println("Valeur entree juste");
	                        } catch (NumberFormatException e) {
	                            System.out.println("valeur entree n'est pas entier recommencer");
	                            // Here catch NumberFormatException
	                            // So input is not a int.
	                        }

	                    } while (chiffres != true);
	                    
	                    
	                    
	                    

	                    break;
	                case 2:

	                    System.out.println("donner le nom de l'article");
	                    String nom = sc.next();
	                    ar.setNom(nom);
	                    System.out.println("donner la reference de l'article de l'article");
	                    boolean chiffre = false;
	                    String input;

	                    do {
	                        input = sc.next();

	                        try {
	                            System.out.println("###");
	                            int x = Integer.parseInt(input);
	                            ar.setNumeroReference(x);
	                            chiffre = true;

	                            // You can use this method to convert String to int, But if input 
	                            //is not an int  value then this will throws NumberFormatException. 
	                            
	                        } catch (NumberFormatException e) {
	                            System.out.println("valeur entree n'est pas entier recommencer");
	                            // Here catch NumberFormatException
	                            // So input is not a int.
	                        }

	                    } while (chiffre != true);

	                    System.out.println("la quantite du produit");

	                    String valeur;
	                    boolean chiffress = false;

	                    do {
	                        valeur = sc.next();

	                        try {
	                            System.out.println("###");
	                            int qt = Integer.parseInt(valeur);
	                            ar.setQuantiteStocke(qt);
	                            chiffress = true;

	                            // You can use this method to convert String to int, But if input 
	                            //is not an int  value then this will throws NumberFormatException. 
	                            System.out.println("Valeur entree juste");
	                        } catch (NumberFormatException e) {
	                            System.out.println("valeur entree n'est pas entier recommencer");
	                            // Here catch NumberFormatException
	                            // So input is not a int.
	                        }

	                    } while (chiffress != true);

	                    System.out.println("donner le prix l'article de l'article");

	                    String val;
	                    boolean chif = false;

	                    do {
	                        val = sc.next();

	                        try {
	                            System.out.println("###");
	                            int prix = Integer.parseInt(val);
	                            ar.setPrixVente(prix);
	                            chif = true;

	                            // You can use this method to convert String to int, But if input 
	                            //is not an int  value then this will throws NumberFormatException. 
	                            System.out.println("Valeur entree juste");
	                        } catch (NumberFormatException e) {
	                            System.out.println("valeur entree n'est pas entier recommencer");
	                            // Here catch NumberFormatException
	                            // So input is not a int.
	                        }

	                    } while (chif != true);

	                    if (stocke.isEmpty()) {
	                        stocke.add(ar);

	                    } else {

	                        for (int k = 0; k < stocke.size(); k++) {

	                            if (ar.equals(stocke.get(k))) {

	                                break;
	                            } else {
	                                stocke.add(ar);
	                            }

	                        }
	                    }

	                    break;
	                case 3:
	                    program progr = new program();
	                    System.out.println("Donner la refernce de l'article a supprimer");
	                    
	                    
	                     boolean chifsupprimer = false;
	                     String valSuprimer;

	                    do {
	                        valSuprimer = sc.next();

	                        try {
	                            System.out.println("###");
	                            int p = Integer.parseInt(valSuprimer);
	                            progr.SuppressionArticle(stocke, p);
	                            chifsupprimer = true;

	                            // You can use this method to convert String to int, But if input 
	                            //is not an int  value then this will throws NumberFormatException. 
	                            System.out.println("Valeur entree juste");
	                        } catch (NumberFormatException e) {
	                            System.out.println("valeur entree n'est pas entier recommencer");
	                            // Here catch NumberFormatException
	                            // So input is not a int.
	                        }

	                    } while (chifsupprimer != true);
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                   
	                    
	                    break;
	                case 4: 
	                    System.out.println("Infos a modier");
	                    
	                     System.out.println("donner le nom de l'article Remplcer dans la Modification");
	                    String nomModif = sc.next();
	                    ar.setNom(nomModif);
	                    System.out.println("donner la reference de l'article a Remplacer dans la modification");
	                    boolean chiffreModif = false;
	                    String inputModif;

	                    do {
	                        inputModif = sc.next();

	                        try {
	                            System.out.println("###");
	                            int x = Integer.parseInt(inputModif);
	                            ar.setNumeroReference(x);
	                            chiffreModif = true;

	                            // You can use this method to convert String to int, But if input 
	                            //is not an int  value then this will throws NumberFormatException. 
	                            
	                        } catch (NumberFormatException e) {
	                            System.out.println("valeur entree n'est pas entier recommencer");
	                            // Here catch NumberFormatException
	                            // So input is not a int.
	                        }

	                    } while (chiffreModif != true);

	                    System.out.println("la quantite du produit a Remplacer dans la modification");

	                    String valeurModif;
	                    boolean chiffressModif = false;

	                    do {
	                        valeurModif = sc.next();

	                        try {
	                            System.out.println("###");
	                            int qt = Integer.parseInt(valeurModif);
	                            ar.setQuantiteStocke(qt);
	                            chiffressModif = true;

	                            // You can use this method to convert String to int, But if input 
	                            //is not an int  value then this will throws NumberFormatException. 
	                            System.out.println("Valeur entree juste");
	                        } catch (NumberFormatException e) {
	                            System.out.println("valeur entree n'est pas entier recommencer");
	                            // Here catch NumberFormatException
	                            // So input is not a int.
	                        }

	                    } while (chiffressModif != true);

	                    System.out.println(" prix  de l'article a remplacer dans la modification");

	                    String valModif;
	                    boolean chifModif = false;

	                    do {
	                        valModif = sc.next();

	                        try {
	                            System.out.println("###");
	                            int prix = Integer.parseInt(valModif);
	                            ar.setPrixVente(prix);
	                            chifModif = true;

	                            // You can use this method to convert String to int, But if input 
	                            //is not an int  value then this will throws NumberFormatException. 
	                            System.out.println("Valeur entree juste");
	                        } catch (NumberFormatException e) {
	                            System.out.println("valeur entree n'est pas entier recommencer");
	                            // Here catch NumberFormatException
	                            // So input is not a int.
	                        }

	                    } while (chifModif != true);
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    
	                    System.out.println("###################");
	                    
	                     program progModif = new program();
	                    System.out.println("Donner la refernce ");
	                    
	                    
	                     boolean chifmodif = false;
	                     String valmodif;

	                    do {
	                        valmodif = sc.next();

	                        try {
	                            Article art=new Article();
	                             
	                            System.out.println("###");
	                            int modif = Integer.parseInt(valmodif);
	                            progModif.Modifier(stocke, modif, art);
	                            chifmodif= true;

	                            // You can use this method to convert String to int, But if input 
	                            //is not an int  value then this will throws NumberFormatException. 
	                            System.out.println("Valeur entree juste");
	                        } catch (NumberFormatException e) {
	                            System.out.println("valeur entree n'est pas entier recommencer");
	                            // Here catch NumberFormatException
	                            
	                        }

	                    } while (chifmodif != true);
	                    
	                        
	                        break;
	                        
	                case 5:
	                       
	                    System.out.println("Donner le nom de l'article arechercher");
	                    
	                    String nomArticle=sc.next();
	                    program p=new program();
	                    p.RechercherNom(stocke, nomArticle);
	                    
	                    break;
	                    
	                    
	                case 6:
	                    for (int i = 0; i < stocke.size(); i++) {
	                        Article art = stocke.get(i);
	                        System.out.println("liste" + art);
	                    }
	                    break;
	                case 7:
	                    System.out.println("sortir revoir");
	                    System.exit(0);
	                    
	            }
	        } 
	        while(choix>=1 || choix<=7 || choix!=6);

	    }

	
	
}