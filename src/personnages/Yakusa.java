package personnages;

public class Yakusa extends Humain {
	
	private String clan;
	private int reputation = 0;

	public Yakusa(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		super.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		super.parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		
		int vol = victime.seFaireExtorquer();
		argent += vol;
		reputation += 1;
		
		super.parler("J’ai piqué les " + vol + " sous de Marco, ce qui me fait " + argent 
				+ " sous dans ma poche. Hi ! Hi !");
	}
}
