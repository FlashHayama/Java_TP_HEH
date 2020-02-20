package lan.dream;

import java.util.*;

public class Game
{
	public int Roles()
	{
		return (new Random().nextInt(6) + 1);
	}

	public void Combination(int de1 , int de2)
	{
		int sum = de1 + de2;
		if(sum == 7)
		{
			System.out.println("Natural");
		}
		else if(sum == 11)
		{
			System.out.println("Yo-level");
		}
		else if(sum == 2)
		{
			System.out.println("Snake Eyes");
		}
		else if(sum == 3)
		{
			System.out.println("Ace Deuce");
		}
		else if(sum == 12)
		{
			System.out.println("Boxcars");
		}

	}
	public int Verify(int de1, int de2)
	{
		int sum = de1 + de2;
		if(sum == 7 || sum == 11)
		{
			return 0;
		}
		else if(sum == 2 || sum == 3 || sum == 12)
		{
			return 1;
		}
		if(sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10)
		{
			return 2;
		}
		else
		{
			return -1;
		}
	}
	public void Start()
	{

	}

}
