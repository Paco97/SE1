import java.util.ArrayList;
import java.util.List;

public class Spieler {
	String name = "";
	ArrayList<Stein> blau = new ArrayList<Stein>();
	ArrayList<Stein> braun = new ArrayList<Stein>();
	ArrayList<Stein> rosa = new ArrayList<Stein>();
	ArrayList<Stein> gelb = new ArrayList<Stein>();
	ArrayList<Stein> gr�n = new ArrayList<Stein>();
	

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
	public List getGr�n() {
		return gr�n;
	}
	public boolean isKi() {
		return ki;
	}
	
	
	
	

}
