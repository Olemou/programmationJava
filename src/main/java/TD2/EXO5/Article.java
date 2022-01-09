package TD2.EXO5;

public class Article {
	String nom;
	double NumeroReference;
	int QuantiteStocke;
	double prixVente;
	public Article(String nom, double numeroReference, int quantiteStocke, double prixVente) {
		
		this.nom = nom;
		this.NumeroReference = numeroReference;
		this.QuantiteStocke = quantiteStocke;
		this.prixVente = prixVente;
	}
	public Article() {
		
	}
	public String getNom() {
		return nom;
		
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(NumeroReference);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		if (Double.doubleToLongBits(NumeroReference) != Double.doubleToLongBits(other.NumeroReference))
			return false;
		return true;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getNumeroReference() {
		return NumeroReference;
	}
	public void setNumeroReference(double numeroReference) {
		NumeroReference = numeroReference;
	}
	public int getQuantiteStocke() {
		return QuantiteStocke;
	}
	public void setQuantiteStocke(int quantiteStocke) {
		QuantiteStocke = quantiteStocke;
	}
	public double getPrixVente() {
		return prixVente;
	}
	public void setPrixVente(double prixVente) {
		this.prixVente = prixVente;
	}
	@Override
	public String toString() {
		return "Article [nom=" + nom + ", NumeroReference=" + NumeroReference + ", QuantiteStocke=" + QuantiteStocke
				+ ", prixVente=" + prixVente + "]";
	}
	
	
	

}
