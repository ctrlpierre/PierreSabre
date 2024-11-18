package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		if (argent >= 10) {
			super.parler(beneficiaire.getNom() + " prend ces " + argent / 10 + " sous.");
			beneficiaire.recevoir(argent / 10);
		}
	}
	
	public void provoquer(Yakusa adversaire) {
		int force = honneur * 2;
		super.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		
		if (force >= adversaire.getReputation()) {
			super.parler("Je t'ai eu petit yakusa !");
			argent = adversaire.perdre();
			honneur += 1;
			
		} else {
			super.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			int gain = argent;
			argent = 0;
			if (honneur > 0) {
				honneur -= 1;
			}
			adversaire.gagner(gain);
		}
	}
}
