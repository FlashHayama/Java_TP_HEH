package be.isims.coo.tp3.ex1;

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
}
