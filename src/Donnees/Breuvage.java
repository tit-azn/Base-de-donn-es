package Donnees;

import java.util.ArrayList;

public class Breuvage {
	private String nomBreuvage;
	private Brasserie brasserieBreuvage;
	private int tauxAlcool;
	private String couleur;
	private String provenance;
	private ArrayList<String> listeTypeFermentation;
	private String fermentation;
	private LieuOrigine lieuOrigineBreuvage;
	private int anneeOrigine;
	private ArrayList<Bouteille> listeBouteilleBreuvage;
	
	public Breuvage(String nomBreuvage)
	{
		this.nomBreuvage = nomBreuvage;
		this.brasserieBreuvage = new Brasserie();
		this.tauxAlcool = 0;
		this.couleur = "inconnue";
		this.provenance = "inconnue";
		this.fermentation = "inconnue";
		this.lieuOrigineBreuvage = new LieuOrigine();
		this.anneeOrigine = 0;
	}
	
	public Breuvage(String nomBreuvage, int tauxAlcool)
	{
		this(nomBreuvage);
		this.setTauxAlcool(tauxAlcool);
	}
	
	public Breuvage(String nomBreuvage, int tauxAlcool, String couleur)
	{
		this(nomBreuvage,tauxAlcool);
		this.couleur = couleur;
	}
	
	public Breuvage(String nomBreuvage, int tauxAlcool, String couleur, String provenance)
	{
		this(nomBreuvage,tauxAlcool, couleur);
		this.provenance = provenance;
	}
	
	public Breuvage(String nomBreuvage, int tauxAlcool, String couleur, String provenance,String fermentation)
	{
		this(nomBreuvage,tauxAlcool, couleur, provenance);
		this.fermentation = fermentation;
	}
	
	public Breuvage(String nomBreuvage, int tauxAlcool, String couleur, String provenance,String fermentation,int anneeOrigine)
	{
		this(nomBreuvage, tauxAlcool, couleur, provenance,fermentation);
		this.anneeOrigine = anneeOrigine;
	}
	
	public void setNomBreuvage(String nomBreuvage)
	{
		this.nomBreuvage = nomBreuvage;
	}
	
	public void setTauxAlcool(int tauxAlcool)
	{
		if(tauxAlcool>0)
		{
			this.tauxAlcool = tauxAlcool;
		}
	}
	
	public void setCouleur(String couleur)
	{
		this.couleur = couleur;
	}
	
	public void setProvenance(String provenance)
	{
		this.provenance = provenance;
	}
	
	public void addTypeFermentation(String typeFermentation)
	{
		this.listeTypeFermentation.add(typeFermentation);
	}
	
	public void removeTypeFermentation(String typeFermentation)
	{
		int i;
		for(i=0;i<this.listeTypeFermentation.size();i++)
		{
			if(typeFermentation == this.listeTypeFermentation.get(i))
			{
				this.listeTypeFermentation.remove(i);
			}
		}
	}
	
	public void setFermentation(String fermentation)
	{
		this.fermentation = fermentation;
	}
	
	public void setAnneeOrigine(int annee)
	{
		this.anneeOrigine = annee;
	}
	
	public void addBouteilleBreuvage(Bouteille bouteille)
	{
		this.listeBouteilleBreuvage.add(bouteille);
	}
	
	public void removeBouteilleBreuvage(Bouteille bouteille)
	{
		int i;
		for(i=0;i<this.listeBouteilleBreuvage.size();i++)
		{
			if(bouteille == this.listeBouteilleBreuvage.get(i))
			{
				this.listeBouteilleBreuvage.remove(i);
			}
		}
	}
	
	public String getNomBreuvage()
	{
		return this.nomBreuvage;
	}
	
	public Brasserie getBrasserieBreuvage()
	{
		return this.brasserieBreuvage;
	}
	
	public int getTauxAlcool()
	{
		return this.tauxAlcool;
	}
	
	public String getCouleur()
	{
		return this.couleur;
	}
	
	public String getProvenance()
	{
		return this.provenance;
	}
	
	public ArrayList<String> getListeTypeFermentation()
	{
		return this.listeTypeFermentation;
	}
	
	public String getFermentation()
	{
		return this.fermentation;
	}
	
	public int getAnneeOrigine()
	{
		return this.anneeOrigine;
	}
	
	public ArrayList<Bouteille> getListeBouteilleBreuvage()
	{
		return this.listeBouteilleBreuvage;
	}
	
	public LieuOrigine getLieuOrigineBreuvage()
	{
		return this.lieuOrigineBreuvage;
	}
	
}