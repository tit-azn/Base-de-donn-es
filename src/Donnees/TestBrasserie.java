package Donnees;

public class TestBrasserie {
	
	public static void main(String args[])
	{
		Brasserie b = new Brasserie("Kronenbourg","Cronenbourg","France");
		b.setBrasserie("Heineken");
		b.getOrigine().setLieuOrigine("Mulhouse");
		b.getOrigine().setPaysOrigine("Allemagne");
		System.out.println(b);
	}
}
