package Donnees;

public class Brasserie {
	String nomBrasserie;
	LieuOrigine origine;
	
	public Brasserie()
	{
		this.nomBrasserie = "inconnu";
		this.origine = new LieuOrigine();
	}
	
	public Brasserie(String brasserie)
	{
		this.origine = new LieuOrigine();
		this.nomBrasserie = brasserie;
	}
	
	public Brasserie(String brasserie, String lieu, String pays)
	{
		this.origine = new LieuOrigine(lieu,pays);
		this.nomBrasserie = brasserie;
	}
	
	public Brasserie(String brasserie, String pays)
	{
		this.origine = new LieuOrigine(pays);
		this.nomBrasserie = brasserie;
	}
	
	public void setBrasserie(String brasserie)
	{
		this.nomBrasserie = brasserie;
	}
	
	public String getnomBrasserie()
	{
		return this.nomBrasserie;
	}
	
	public LieuOrigine getOrigine()
	{
		return this.origine;
	}
	
	public String toString()
	{
		return "La brasserie " + this.getnomBrasserie() +
		" dont le lieu d'origine est " + this.getOrigine().getLieuOrigine() +
		" et le pays est " + this.getOrigine().getPaysOrigine() + ".";
	}
}
