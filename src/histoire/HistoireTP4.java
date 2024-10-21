package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakusa;

public class HistoireTP4 {

	public static void main(String[] args) {
		/* 1
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);*/
		
		/* 2
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();*/
		
		Commercant marco = new Commercant("Marco", 15);
		Yakusa yaku = new Yakusa("Yaku Le Noir", "whisky", 30, "Warsong");
		yaku.direBonjour();
		yaku.extorquer(marco);
	}
}
