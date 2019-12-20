import java.util.*;
public class Spielbrett {
	
	Stein [][] brett = new Stein[11][5];
	boolean offen = false;
	Stein stein;
	
	public String toString() {
		return "";
	}
	
	public void brettBefüllen() {
		//farbe 11 steine mit random wert 0 bis 10 
		//davon 2 mit wuschstein, 2 mit kleeblatt, 2 mit bonuspunkte
		//stein muss an einer random location im feld plaziert werden 

		int crot = 0;
		int cblau = 0;
		int crosa = 0;
		int cwunsch = 0;
		int cklee = 0;
		boolean cBonusEins = false;
		boolean cBonusDrei = false;
		int[] belegteZahlen = new int[11];
		for( int i = 0; i < 12; i++) {
			Stein x = new Stein();
			x.symbol.setFarbe("Rot");
			
			int randomZahl = ((int)(Math.random() * 11) + 1);
			
//			if(belegteZahlen.)
			
			
			
			if(cwunsch < 2) {
				x.symbol.setWunsch(true);
			}
			
			
		}	
	}
	
	public void istDrin() {
		
	}
	
//	public void setOffen(//hier die position) {
//		this.offen = true;
//	}

	public boolean getOffen() {
		return offen;
	}
	
	
}