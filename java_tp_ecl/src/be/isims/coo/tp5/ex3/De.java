package be.isims.coo.tp5.ex3;

import java.util.Random;

public class De
{
	private int value = 0;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void Roles()
	{
		value =  new Random().nextInt(6) + 1;
	}

	public String toString()
	{
		Roles();
		return String.valueOf(value);
	}
}
