import java.util.ArrayList;
import java.util.List;

public class Spieler {
	String name = "";
	ArrayList<Stein> blau = new ArrayList<Stein>();
	ArrayList<Stein> braun = new ArrayList<Stein>();
	ArrayList<Stein> rosa = new ArrayList<Stein>();
	ArrayList<Stein> gelb = new ArrayList<Stein>();
	ArrayList<Stein> grün = new ArrayList<Stein>();
	

	int punkte;
	boolean ki;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPunkte() {
		return punkte;
	}
	public void setPunkte(int punkte) {
		this.punkte = punkte;
	}
	public List getBlau() {
		return blau;
	}
	public List getBraun() {
		return braun;
	}
	public List getRosa() {
		return rosa;
	}
	public List getGelb() {
		return gelb;
	}
	public List getGrün() {
		return grün;
	}
	public boolean isKi() {
		return ki;
	}
	
	
	
	

}
