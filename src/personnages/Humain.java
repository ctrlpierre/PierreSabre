package personnages;

public class Humain {
	private String nom;
	private String boisson;
	protected int argent;
	protected int nbConnaissance = 0;
	protected Humain[] memoire = new Humain[30];
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom 
				+ " et j'aime boire du " + boisson + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix < 0) {
			throw new IllegalArgumentException("Prix invalide : " + prix); 
		} else if (prix > argent) {
			parler("Je n'ai plus que " + argent + " sous en poche. "
					+ "Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		} else {
			parler("J'ai " + argent + " sous en poche. "
					+ "Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		}
	}
	
	private void gagnerArgent(int gain) {
		this.argent += gain;
	}
	
	private void perdreArgent(int perte) {
		this.argent -= perte;
	}
	
	private void memoriser(Humain autreHumain) {
		if (nbConnaissance == memoire.length) {
			for (int i = 0; i < memoire.length - 1; i++) {
				memoire[i] = memoire[i + 1];
			}
			memoire[memoire.length - 1] = autreHumain;
		} else {
			memoire[nbConnaissance++] = autreHumain;
		}
	}
	
	private void repondre(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain);
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	
	public void listerConnaissance() {
		if (nbConnaissance == 0) {
			parler("Je ne connais personne.");
		} else {
			String listeHumain = "Je connais beaucoup de monde dont : ";
			for (int i = 0; i < nbConnaissance; i++) {
				listeHumain += memoire[i].getNom();
				if (i < nbConnaissance - 1) {
					listeHumain += ", ";
				}
			}
			parler(listeHumain);
		}
	}
	
}
