import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;



public class Spiel {

	
	
	Spieler sieger;
	Spieler[] spieler = new Spieler[4];
	Spielbrett sb;
	Spieler spielerAmZug;
	
	public void start() {
		//loop wird gestartet
	}
	
	
	
	int [] spielerPunkte = new int [4];
	public Spieler sieger() {
		int eins = PunkteVerteilung.berechnePunkte(spieler[0]);
		int zwei = PunkteVerteilung.berechnePunkte(spieler[1]);
		int drei = PunkteVerteilung.berechnePunkte(spieler[2]);
		int vier = PunkteVerteilung.berechnePunkte(spieler[3]);
	spielerPunkte[0] = eins;
	spielerPunkte[1] = zwei;
	spielerPunkte[2] = drei;
	spielerPunkte[3] = vier;
	
	
	int maxAt = 0;

	for (int i = 0; i < spielerPunkte.length; i++) {
	    maxAt = spielerPunkte[i] > spielerPunkte[maxAt] ? i : maxAt;
		}//for:
	
	return spieler[maxAt];
	
	}//sieger methode
	
	
	
	
	

	

		
	


	
	
}
