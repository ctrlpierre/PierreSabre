package histoire;
import personnages.Commercant;
import personnages.Yakusa;
import personnages.Ronin;
import personnages.Samourai;

public class HistoireTP5 {

	public static void main(String[] args) {
		/*1
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakusa yaku = new Yakusa("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();*/
		
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		Commercant marco = new Commercant("Marco", 20);
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissance();
		akimoto.boire("thé");
	}

}
