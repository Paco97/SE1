public class Symbol extends Stein{

	
		//constructor
	public Symbol(int wert, Symbol symbol, String farbe) {
		super(wert, symbol, farbe);
		
	}
	
	
	
	//2 wunschsteine pro farbe
	//2 kleeblatt pro farbe
	// 1 mal  +1 bonuspunkt und 1 mal +3 bonuspunkte pro farbe
	static boolean wunsch;
	static boolean kleeblatt;
	static int bonuspunkte;
	
	
	
	public static boolean getWunsch() {
		return wunsch;
	}
	public static void setWunsch(boolean wunschUeb) {
		wunsch = wunschUeb;
	}
	public static boolean getKleeblatt() {
		return kleeblatt;
	}
	public static void setKleeblatt(boolean kleeblattt) {
		kleeblatt = kleeblattt;
	}
	public static int getBonuspunkte() {
		return bonuspunkte;
	}
	public static void setBonuspunkte(int bonuspunktee) {
		bonuspunkte = bonuspunktee;
	}
	
	
	
	
	
}
