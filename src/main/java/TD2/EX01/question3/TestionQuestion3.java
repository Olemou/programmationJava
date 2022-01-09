package TD2.EX01.question3;

public class TestionQuestion3 {
	
	public static void main(String[] args) {
	int i ;
	 System.out.println("//////////////// ") ;
	 System.out.println("Question 2 : création et test devariables ") ;
	 System.out.println("//////////////// ") ;
	 Divertissement em1 = new Divertissement("La roue de la fortune","Foucault") ;
	if ( em1.Programmer(20) )
	 System.out.println("ok emission programmée");
	else System.out.println("emission non programmée") ;
	 Fiction em2 = new Fiction("Citizen Kane",
	"Wells",true,3) ;
	if ( em2.Programmer(17) )
	 System.out.println("ok emission programmée");
	else System.out.println("emission non programmée") ;
	 Reportage em3 = new Reportage("Voiture de luxe", 1, 1) ;
}
}

