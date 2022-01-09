package TD2.EX03;

import java.util.Scanner;


public class Pharmacie {
	
	private static Scanner scanner = new Scanner(System.in);
	 public static void main(String args[]) {
	 Client[] clients = new Client[2];
	 Medicament[] medicaments = new Medicament[2];
	 clients[0] = new Client("Malfichu", 0.0);
	 clients[1] = new Client("Palichon", 0.0);
	 medicaments[0] = new Medicament("Aspiron", 20.40, 5);
	 medicaments[1] = new Medicament("Rhinoplexil", 19.15, 5);
	 int choix = 0;
	 while (choix < 4) {
	 choix = menu();
	 switch (choix) {
	 case 1:
	 achat(clients, medicaments);
	 break;
	 case 2:
	 approvisionnement(medicaments);
	 break;
	 case 3:
	 affichage(clients, medicaments);
	 break;
	 case 4:
	 quitter();
	 break;
	 default:
	 
	 choix = 0;
	 }
	 }
	 }
	 
	 static int menu() {
	 int choix = 0;
	 System.out.println();
	 System.out.println();
	 System.out.println("1 : Achat de medicament");
	 System.out.println("2 : Approvisionnement en medicaments");
	 System.out.println("3 : Etats des stocks et des credits");
	 System.out.println("4 : Quitter");
	 while ((choix != 1) && (choix != 2) && (choix != 3) && (choix != 4)) {
	 choix = scanner.nextInt();
	 }
	 // se débarasser du \n
	 scanner.nextLine();
	 return choix;
	 }
	 /**
	 * Méthode auxiliaire de main permettant à un client
	 * d'acheter un médicament
	 */
	 static void achat(Client[] clients, Medicament[] medicaments) {
	 Client client = lireClient(clients);
	 Medicament medicament = lireMedicament(medicaments);
	 double paiement = lirePaiement();
	 int quantite = lireQuantite();
	 if (quantite <= medicament.getStock()) {
	 medicament.diminuerStock(quantite);
	 client.augmenterCredit((medicament.getPrix() * quantite) - paiement);
	 } else
	 System.out.println("Achat Impossible. Quantite insuffisante");
	 }
	
	 static void approvisionnement(Medicament[] medicaments) {
	 Medicament medicament = lireMedicament(medicaments);
	 System.out.println("Donner la Quantite : ");
	 int quantite = scanner.nextInt();
	 // se débarasser du \n
	 scanner.nextLine();
	 medicament.augmenterStock(quantite);
	 }
	 /**
	 * Méthode auxiliaire de main permettant d'afficher les
	 * données stockées dans les tableaux clients et medicaments
	 */
	 static void affichage(Client[] clients, Medicament[] medicaments) {
	 System.out.println("Affichage des stocks");
	 for (int i = 0; i < medicaments.length; i++) {
	 System.out.println("Stock du medicament " + medicaments[i].getNom()
	 + " :" + medicaments[i].getStock());
	 }
	 System.out.println("Affichage des credits");
	 for (int i = 0; i < clients.length; i++) {
	 System.out.println("Credit du client " + clients[i].getNom()
	 + " :" + clients[i].getCredit());
	 }
	 }
	 /**
	 * Retourne l'objet Client associé à un nom (String)
	 * Le nom est lu et redemandé tant qu'il ne correspond
	 * pas au nom d'un client contenu dans le tableau clients
	 */
	 static Client lireClient(Client[] clients) {
	 String nom = null;
	 boolean trouve = false;
	 Client c = null;
	 System.out.println("Nom du client?:");
	 while (!trouve) {
	 nom = scanner.nextLine();
	 for (int i = 0; (!trouve && i < clients.length); i++) {
	 if ((clients[i].getNom()).equals(nom)) {
	 trouve = true;
	 c = clients[i];
	 }
	 }
	 if (!trouve) {
	 System.out.println("Client inconnu. Veuilliez recommencer");
	 }
	 }
	 return c;
	 }
	
	 
	 static Medicament lireMedicament(Medicament[] medicaments) {
	 String nom = null;
	 boolean trouve = false;
	 Medicament m = null;
	 System.out.println("Nom du medicament?:");
	 while (!trouve) {
	 nom = scanner.nextLine();
	 for (int i = 0; (!trouve && i < medicaments.length); i++) {
	 if ((medicaments[i].getNom()).equals(nom)) {
	 trouve = true;
	 m = medicaments[i];
	 }
	 }
	 if (!trouve) {
	 System.out.println("Medicament inconnu. Veuilliez recommencer");
	 }
	 }
	 return m;
	 }
	 static double lirePaiement() {
	 double paiement = 0.0;
	 System.out.println("quel est le montant du paiement?");
	 paiement = scanner.nextDouble();
	 scanner.nextLine();
	 return paiement;
	 }
	 static int lireQuantite() {
	 int quantite;
	 System.out.println("quelle est la quantite achetee?");
	 quantite = scanner.nextInt();
	 scanner.nextLine();
	 return quantite;
	 }
	 static void quitter() {
	 System.out.println("Programme termine!");
	 }



}