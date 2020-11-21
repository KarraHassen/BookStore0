package connection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Commande;
import model.Livre;

public class Connectivity {
	
	
	Connection c=null;
	Statement stmt=null;
	public Connectivity() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/bookstore";
		c=DriverManager.getConnection(url, "root", "");
		if(c==null) {
			System.out.println("probleme de connexion a la base de donnée...");
		}
		else {
			
			System.out.println("bienvenu ..");
	}}
	
	
	public static ArrayList<Livre> Books=new ArrayList<Livre>();
	public ArrayList<Livre> getBook() {
		return Books;
	}

	public void setBook(ArrayList<Livre> Books) {
		this.Books = Books;
	}
	public static ArrayList<Commande> Commandes= new ArrayList<Commande>();
		
	public static ArrayList<Commande> getCommandes() {
		return Commandes;
	}

	public static void setCommandes(ArrayList<Commande> commandes) {
		Commandes = commandes;
	}

	
	
	
	
	
	
	
	public void add(Livre b) {
		try {
		
		
			PreparedStatement ps=c.prepareStatement(
					"INSERT INTO book (title_book,author_book,price_book,release_date) VALUES(?,?,?,?)");
			ps.setString(1,b.getTitrel());
			ps.setString(2,b.getAuteurl());
			ps.setDouble(3, b.getPrixuni());
			
			ps.setDate(4,(Date) b.getReleasedate());
			Books.add(b);
			
			if((ps.execute())==false) {
				System.out.println("livre ajoutée");}
					else {
				System.out.println("echec d'ajout du livre");
			}		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	public ArrayList getAll() {	
		try {
			PreparedStatement ps = c.prepareStatement("select * from book");
			ResultSet rs = ps.executeQuery();
			while( rs.next()) {
				
				Livre b1 = new Livre();
				
				
				b1.setIdl(rs.getInt("id_book"));
				b1.setTitrel(rs.getString("title_book"));
				b1.setAuteurl(rs.getString("author_book"));
				b1.setReleasedate(rs.getDate("release_date"));
				//b1.setReleasedate(rs.getInt("release_date"));
				b1.setPrixuni(rs.getInt("price_book"));
				Books.add(b1);
							
		}} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Books;
		
		
	}
}