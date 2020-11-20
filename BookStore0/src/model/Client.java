package model;

public class Client {
	
	private int idc;
	private String nomc, prenomc, adressec;
	public int nbr =0;
	
	
	
	Commande [] commande = new Commande [50];


	public Client(int idc, String nomc, String prenomc, String adressec) {
		super();
		this.idc = idc;
		this.nomc = nomc;
		this.prenomc = prenomc;
		this.adressec = adressec;
	}


	public Client(int idc, String nomc, String prenomc, String adressec, Commande[] commande) {
		super();
		this.idc = idc;
		this.nomc = nomc;
		this.prenomc = prenomc;
		this.adressec = adressec;
		this.commande = commande;
	}


	public int getIdc() {
		return idc;
	}


	public void setIdc(int idc) {
		this.idc = idc;
	}


	public String getNomc() {
		return nomc;
	}


	public void setNomc(String nomc) {
		this.nomc = nomc;
	}


	public String getPrenomc() {
		return prenomc;
	}


	public void setPrenomc(String prenomc) {
		this.prenomc = prenomc;
	}


	public String getAdressec() {
		return adressec;
	}


	public void setAdressec(String adressec) {
		this.adressec = adressec;
	}


	@Override
	public String toString() {
		return "Client [idc=" + idc + ", nomc=" + nomc + ", prenomc=" + prenomc + ", adressec=" + adressec + "]";
	}
	
	
	
	public void AjouterCommande(Commande k)
	{ if(nbr<50)
	 {this.commande[nbr]=k ;
	 nbr++;
	 System.out.println("ajout du commande valider \n le nombre de commande du client " + getPrenomc()+ " est " + nbr );
	 }
	
	}
	
	
	

}

