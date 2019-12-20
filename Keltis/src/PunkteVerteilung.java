import java.util.Iterator;




public class PunkteVerteilung {


//sieger wird in die aufrufende klasse verlagert

	public static int berechnePunkte(Spieler spieler) {
		
		

		int[] steinePunkte = {0, -4, -3, 2, 3, 6, 10, 10, 10, 10};
		int[] wunschSteinPunkte = {-4, -3, 2, 3, 6, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		// bonuspunkte kommen hierhin

		int gesamtPunktZahl = 0;
		int punkteBlau = spieler.getBlau().size();
		int punkteRosa = spieler.getRosa().size();
		int punkteBraun = spieler.getBraun().size();
		int punkteGruen = spieler.getGrün().size();
		int punkteGelb = spieler.getGrün().size();
		int wunschPunkte;

		Iterator<Stein> blauIter = spieler.getBlau().iterator();
		Iterator<Stein> rosaIter = spieler.getRosa().iterator();
		Iterator<Stein> braunIter = spieler.getBraun().iterator();
		Iterator<Stein> gruenIter = spieler.getGrün().iterator();
		Iterator<Stein> gelbIter = spieler.getGelb().iterator();

		int wunschSteineCounter = 0;

		while (blauIter.hasNext()) {

			if (blauIter.next().getSymbol().wunsch == true) {
				wunschSteineCounter++;
			}
			blauIter.next();
		}

		while (rosaIter.hasNext()) {

			if (rosaIter.next().getSymbol().wunsch == true) {
				wunschSteineCounter++;
			}
			rosaIter.next();
		}

		while (braunIter.hasNext()) {

			if (braunIter.next().getSymbol().wunsch == true) {
				wunschSteineCounter++;
			}
			braunIter.next();
		}

		while (gruenIter.hasNext()) {

			if (gruenIter.next().getSymbol().wunsch == true) {
				wunschSteineCounter++;
			}
			gruenIter.next();
		}

		while (gelbIter.hasNext()) {

			if (gelbIter.next().getSymbol().wunsch == true) {
				wunschSteineCounter++;
			}
			gelbIter.next();
		}

		gesamtPunktZahl += steinePunkte[punkteBlau];
		gesamtPunktZahl += steinePunkte[punkteRosa];
		gesamtPunktZahl += steinePunkte[punkteBraun];
		gesamtPunktZahl += steinePunkte[punkteGruen];
		gesamtPunktZahl += steinePunkte[punkteGelb];
		gesamtPunktZahl += wunschSteinPunkte[wunschSteineCounter];

		return gesamtPunktZahl;
	}

}
