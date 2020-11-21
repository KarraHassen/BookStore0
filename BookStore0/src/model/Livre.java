package model;

import java.util.Date;

public class Livre {

	private int idl;
	private String titrel, auteurl;
	private double prixuni;
	private Date releasedate; 
	
	
	public Livre(int idl, String titrel, String auteurl, double prixuni, Date releasedate) {
		super();
		this.idl = idl;
		this.titrel = titrel;
		this.auteurl = auteurl;
		this.prixuni = prixuni;
		this.releasedate = releasedate;
	}
	


	public Livre() {
		super();
	}



	public int getIdl() {
		return idl;
	}


	public void setIdl(int idl) {
		this.idl = idl;
	}


	public String getTitrel() {
		return titrel;
	}


	public void setTitrel(String titrel) {
		this.titrel = titrel;
	}


	public String getAuteurl() {
		return auteurl;
	}


	public void setAuteurl(String auteurl) {
		this.auteurl = auteurl;
	}


	public double getPrixuni() {
		return prixuni;
	}


	public void setPrixuni(double prixuni) {
		this.prixuni = prixuni;
	}

	

	public Date getReleasedate() {
		return releasedate;
	}


	public void setReleasedate(Date releasedate) {
		this.releasedate = releasedate;
	}


	@Override
	public String toString() {
		return "Livre [idl=" + idl + ", titrel=" + titrel + ", auteurl=" + auteurl + ", prixuni=" + prixuni
				+ ", releasedate=" + releasedate + "]";
	}

	
	

	
	
	
	
	
	
	
}
