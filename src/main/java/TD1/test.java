/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD1;

/**
 *
 * @author user
 */
public class test {
    public static void main(String[] args) {
        Employe e1;
		e1 = new Employe("Jerzy", "17", 15);
                Personnel pers=new Personnel();
                pers.ajouterEmploye(e1);
                pers.AfichagePersonnel();
              //System.out.println(pers.tabEmp[0].getNom());
              // pers.chercherEmploye("17");
                //System.out.println(   pers.chercherEmploye("17"));
       // System.out.println("aficher");
        //System.out.println(e1.toString());
    }
    
}
