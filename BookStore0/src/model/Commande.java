package model;

import java.util.Date;

import java.util.Vector;

public class Commande {

	
	private int refcom;
	private double prixtot= 0;
	private Date datecom;
	 public Livre l;
	 	
	private Vector<LigneCommande> vec = new Vector<LigneCommande>();


	public Commande(int refcom,  Date datecom) {
		super();
		this.refcom = refcom;
		
		this.datecom = datecom;
	}


	public int getRefcom() {
		return refcom;
	}


	public void setRefcom(int refcom) {
		this.refcom = refcom;
	}


	public double getPrixtot() {
		return prixtot;
	}


	public void setPrixtot(double prixtot) {
		this.prixtot = prixtot;
	}


	public Date getDatecom() {
		return datecom;
	}


	public void setDatecom(Date datecom) {
		this.datecom = datecom;
	}


	@Override
	public String toString() {
		return "Commande [refcom=" + refcom  + ", datecom=" + datecom + ", vec=" + vec + "]";
	}
	
	
	public double CalPrixTot() {
		
		/*for(LigneCommande lc : vec) {
			prixtot += lc.TotlaPrice(l);
		}*/
		
		for (int i= 0; i<vec.size(); i++) {
			prixtot+= vec.elementAt(i).TotlaPrice();
		}
		return prixtot;
		
	}
	
	public void AfficherCommande() {
		for ( int i = 0; i<vec.size(); i++) {
			vec.elementAt(i).AfficherLigneCommande();
		}
	}
	
	public void Addlc(LigneCommande lc ) {
		vec.add(lc);
		System.out.println("la ligne de commande" +lc +"est ajouter ");
	}
	
	
	
}