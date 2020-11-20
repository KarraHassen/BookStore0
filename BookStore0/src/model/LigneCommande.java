package model;

public class LigneCommande {

	
	private int idlc;
	private int qte;
	private Livre livre;
	
	
	
	public LigneCommande(int idlc, int qte ) {
		super();
		this.idlc = idlc;
		this.qte = qte;
		
	}


	public int getIdlc() {
		return idlc;
	}


	public void setIdlc(int idlc) {
		this.idlc = idlc;
	}


	public int getQte() {
		return qte;
	}


	public void setQte(int qte) {
		this.qte = qte;
	}


	public Livre getLivre() {
		return livre;
	}


	public void setLivre(Livre livre) {
		this.livre = livre;
	}


	@Override
	public String toString() {
		return "LigneCommande [idlc=" + idlc + ", qte=" + qte + "]";
	}
	 
	public double TotlaPrice() {
		 double totlc = livre.getPrixuni()*qte;
		 return totlc;
		 
		 
	 }
	
	
	 public void AfficherLigneCommande() {
		 System.out.println("le prix unitaire est "+ livre.getPrixuni());
		 System.out.println("la quantité est"+ qte);
		 
	 }
	
}

