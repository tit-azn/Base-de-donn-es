package Donnees;

public class LieuOrigine {
	private String lieuOrigine;
	private String paysOrigine;
	
	public LieuOrigine(String lieu,String pays)
	{
		this.lieuOrigine=lieu;
		this.paysOrigine=pays;
	}
	
	public LieuOrigine(String pays)
	{
		this.paysOrigine=pays;
		this.lieuOrigine="inconnu";
	}
	
	public LieuOrigine()
	{
		this.paysOrigine="inconnu";
		this.lieuOrigine="inconnu";
	}
	
	public void setLieuOrigine(String lieu)
	{
		this.lieuOrigine=lieu;
	}
	
	public void setPaysOrigine(String pays)
	{
		this.paysOrigine=pays;
	}
	
	public String getLieuOrigine()
	{
		return this.lieuOrigine;
	}
	
	public String getPaysOrigine()
	{
		return this.paysOrigine;
	}
	
	public String toString()
	{
		return "Le lieu d'origine est " + this.getLieuOrigine() + " dont le pays est " + this.getPaysOrigine() + ".";
	}
}
