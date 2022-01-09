package TD2.EX03;

public class Medicament {

	
	 private String nom;
	  private double prix;
	  private int stock;

	  public Medicament(String nom, double prix, int stock) {
	    this.nom = nom;
	    this.prix = prix;
	    this.stock = stock;
	  }
	  
	  

	  public void augmenterStock(int quantite) {
	    stock = stock + quantite;
	  }

	  public void diminuerStock(int quantite) {
	    stock = stock - quantite;
	  }

	  public int getStock() {
	    return stock;
	  }

	  public double getPrix() {
	    return prix;
	  }

	  public String getNom() {
	    return nom;
	  }

}
