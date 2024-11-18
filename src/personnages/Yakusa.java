package personnages;

public class Yakusa extends Humain {
	
	private String clan;
	private int reputation = 0;

	public Yakusa(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
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
	
	public int perdre() {
		int temp = argent;
		argent = 0;
		if (reputation > 0) {
			reputation -= 1;
		}
		super.parler("J'ai perdu mon duel et mes " + temp 
				+ " sous, snif... J'ai déshonoré le clan de "
				+ clan + ".");
		return temp;
	}
	
	public void gagner(int gain) {
		argent += gain;
		reputation += 1;
		super.parler("Ce ronin pensait vraiment battre "
				+ getNom() + " du clan de " + clan + " ? Je l'ai dépouillé de ses " 
				+ gain + " sous.");
	}
}
