package be.isims.coo.tp5.ex1;

public class Carre extends Rectangle
{

	public Carre(float x, float y, float cote)
	{
		super(x, y, cote, cote);
	}

	@Override
	protected void setLocation(float x, float y)
	{
		super.setLocation(x, y);
	}

	protected void setSize(float cote)
	{
		super.width = cote;
		super.height = cote;
	}

	@Override
	protected float getArea()
	{
		return super.getArea();
	}

	@Override
	public String toString()
	{
		return super.toString();
	}
}
