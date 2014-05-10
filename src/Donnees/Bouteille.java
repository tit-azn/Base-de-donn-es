package Donnees;

public class Bouteille {
	int tailleBouteille;
	String typeBouteille;
	String typeBouchon;
	
	public Bouteille()
	{
		this.tailleBouteille = 0;
		this.typeBouteille = "inconnu";
		this.typeBouchon = "inconnu";
	}
	
	public Bouteille(int taille)
	{
		this();
		if(taille>0)
		{
			this.tailleBouteille = taille;
		}
		else
		{
			this.tailleBouteille = 0;
		}
	}
	
	public Bouteille(String typeBouteille)
	{
		this();
		this.typeBouteille = typeBouteille;
	}
	
	public Bouteille(int tailleBouteille,String typeBouteille)
	{
		this(tailleBouteille);
		this.typeBouteille = typeBouteille;
	}
	
	public Bouteille(String typeBouteille,String typeBouchon)
	{
		this();
		this.typeBouteille = typeBouteille;
		this.typeBouchon = typeBouchon;
	}
	
	public Bouteille(int tailleBouteille,String typeBouteille, String typeBouchon)
	{
		this(tailleBouteille,typeBouteille);
		this.typeBouchon = typeBouchon;
	}
	
	public void setTailleBouteille(int tailleBouteille)
	{
		if(tailleBouteille>0)
		{
			this.tailleBouteille = tailleBouteille;
		}
	}
	
	public void setTypeBouteille(String typeBouteille)
	{
		this.typeBouteille = typeBouteille;
	}
	
	public void setTypeBouchon(String typeBouchon)
	{
		this.typeBouchon = typeBouchon;
	}
	
	public int getTailleBouteille()
	{
		return this.tailleBouteille;
	}
	
	public String getTypeBouteille()
	{
		return this.typeBouteille;
	}
	
	public String getTypeBouchon()
	{
		return this.typeBouchon;
	}
	
	public String toString()
	{
		return "La bouteille fait " + this.getTailleBouteille() +
		"cl, a une forme " + this.getTypeBouteille() + " et un bouchon " + this.getTypeBouchon();
	}
}