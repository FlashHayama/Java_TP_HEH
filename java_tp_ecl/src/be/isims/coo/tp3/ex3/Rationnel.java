package be.isims.coo.tp3.ex3;

public class Rationnel
{
	private int numerateur;
	private int denominateur;
	private float reduit;

	public int getNumerateur() { return numerateur; }
	public int getDenominateur() { return denominateur; }
	public float getReduit() { return reduit; }

	public Rationnel(int numerateur, int denominateur) {
		this.numerateur = numerateur;
		this.denominateur = denominateur;
		this.reduit = (float)(numerateur / denominateur);
	}

	public Rationnel(int numerateur) {
		this.numerateur = numerateur;
		this.denominateur = 1;
		this.reduit = (float)numerateur;
	}

	public Rationnel plus(Rationnel other)
	{
		int d;
		int n;
		int t;
		if(this.denominateur == other.denominateur)
		{
			d = this.denominateur;
			n = this.numerateur + other.numerateur;
			t = 0;
		}
		else
		{
			int pg;
			if(this.denominateur > other.denominateur) {
				pg = this.denominateur;
				t = this.pgdc(this.denominateur, other.denominateur);
				n = this.numerateur * t + other.numerateur * ((this.denominateur * t)/other.denominateur);
			}
			else {
				pg = other.denominateur;
				t = this.pgdc(this.denominateur, other.denominateur);
				n = other.numerateur * t + (this.numerateur * ((other.denominateur * t)/this.denominateur));
			}
			d = t * pg;
		}
		return new Rationnel(n,d);
	}

	private int pgdc(int a, int b)
	{
		if(b == 0) {
			return a;
		}
		else {
			return pgdc(b,a % b);
		}
	}

	public String toString() {
		if(this.denominateur == 1)
		{
			return String.valueOf(this.numerateur);
		}
		else
		{
			return this.numerateur + "/" + this.denominateur;
		}
	}

}
