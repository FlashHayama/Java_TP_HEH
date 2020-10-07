package be.isims.coo.tp5.ex1;

public class Rectangle
{
	protected float x;
	protected float y;
	protected float width;
	protected float height;

	public Rectangle(float x, float y, float width, float height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	protected void setLocation(float x, float y)
	{
		this.x = x;
		this.y = y;
	}

	protected void setSize(float width, float height)
	{
		this.width = width;
		this.height = height;
	}

	protected float getArea()
	{
		float v = width * height;
		return v;
	}

	@Override
	public String toString()
	{
		String s = "x = " + x + ", y = " + y + ", L = " + width + ", l = " + height + ", air = " + getArea();
		return s;
	}
}
