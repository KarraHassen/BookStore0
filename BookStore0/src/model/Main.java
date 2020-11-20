package model;

import java.util.Date;



public class Main {

	public static void main(String[] args) {
		Client cl = new Client(0, "a", "a", "a1");
		Date d = new Date (2020, 11,11);
		Commande c0 = new Commande(0, d);
		cl.AjouterCommande(c0);
		
		
		LigneCommande lc1 = new LigneCommande(0, 10);
		LigneCommande lc2 = new LigneCommande(1, 11);
		
		
		
		Livre l = new Livre(0,"Look back in Anger " , "John Osborne", 50);
		Livre l1 = new Livre(1, "the great Gatsby", "Scott Fitzgerald", 50);
		
		lc1.setLivre(l);
		lc2.setLivre(l1);
		
		System.out.println("le prix totale pour ce livre est " +lc1.TotlaPrice());	
		System.out.println("le prix totale pour ce livre est " +lc2.TotlaPrice());
		
		c0.Addlc(lc1);
		c0.Addlc(lc2);
		
		
		
		double k = c0.CalPrixTot();
		System.out.println("le prix totlae pour cette commande est " +k);
		
		
		
		
		
		
		
		

	}

}
