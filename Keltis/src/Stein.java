public class Stein {
		
	
	public Stein(int wert, Symbol symbol, String farbe) {
		this.zahl = wert;
		this.symbol = symbol;
		this.farbe = farbe;
	}
	public Stein() {
	}



	int zahl = 0;
	Symbol symbol;
	String farbe;
	
	
	
	
	public int getZahl() {
		return zahl;
	}
	public void setZahl(int zahl) {
		this.zahl = zahl;
	}
	public Symbol getSymbol() {
		return symbol;
	}
	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}
	public void setFarbe(String Farbe) {
		this.farbe = Farbe;
	}
	public String getFarbe() {
		return this.farbe;

	}
}
