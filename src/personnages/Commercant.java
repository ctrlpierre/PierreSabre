package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		int temp = argent;
		argent = 0;
		super.parler("J'ai tout perdu ! Le monde est trop injuste...");
		return temp;
	}
	
	public void recevoir(int argent) {
		super.parler(argent + " sous ! Je te remercie généreux donnateur !");
		this.argent += argent;
	}	
}
