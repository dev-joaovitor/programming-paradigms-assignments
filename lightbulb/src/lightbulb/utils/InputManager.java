package lightbulb.utils;
import lightbulb.Colors;
import lightbulb.Types;
import java.util.Scanner;

public class InputManager
{
	private Scanner scanner;

	public int getPositeInteger()
	{
		int value = 0;

		while(true)
		{
			value = scanner.nextInt();

			if (value > 0) break;

			System.out.printf("Invalid number, try again: ");
		}
		return value;
	}

	public double getPositiveDouble()
	{
		double value = 0.00;

		while(true)
		{
			value = scanner.nextDouble();

			if (value > 0) break;

			System.out.printf("Invalid number, try again: ");
		}
		return value;
	}

	public String getValidString()
	{
		String text = "";
		while(true)
		{
			text = scanner.nextLine();

			if (!text.equals("")) break;

			System.out.printf("Invalid text, try again: ");
		}
		return text;
	}

	public Colors getValidBulbColor()
	{
		Colors color;
		while(true)
		{}
		
		return color;
	}

	public Types getValidBulbType()
	{	
		if (type < 1 && type > 3)
			return false;
		
		switch(type)
		{
			case 1:
				return Types.Incandescent; break;
			case 2:
				return Types.Fluorescent; break;
			case 3:
				return Types.LED; break;
			default:
				return Types.Other;
		}
	}


	void InputManager()
	{
		this.scanner = new Scanner(System.in);
	}
}
