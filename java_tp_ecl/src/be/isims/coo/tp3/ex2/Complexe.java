package be.isims.coo.tp3.ex2;

public class Complexe {
	private float reel;
	private float complexe;

	public float getReel() {
		return reel;
	}

	public void setReel(float reel) {
		this.reel = reel;
	}

	public float getComplexe() {
		return complexe;
	}

	public void setComplexe(float complexe) {
		this.complexe = complexe;
	}

	public Complexe() {
		this.reel = 0f;
		this.complexe = 0f;
	}

	public Complexe(float reel, float complexe) {
		this.reel = reel;
		this.complexe = complexe;
	}

	public Complexe addition(Complexe complexe2) {
		float x = this.getReel() + complexe2.getReel();
		float y = this.getComplexe() + complexe2.getComplexe();
		Complexe ca = new Complexe(x, y);
		return ca;
	}

	public Complexe soustraction(Complexe complexe2) {
		float x = this.getReel() - complexe2.getReel();
		float y = this.getComplexe() - complexe2.getComplexe();
		Complexe cs = new Complexe(x, y);
		return cs;
	}

	public void afficher() {
		System.out.println("(" + this.reel + "," + this.complexe + ")");
	}

}
