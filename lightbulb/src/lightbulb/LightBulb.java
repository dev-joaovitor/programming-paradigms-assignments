package lightbulb;
import lightbulb.Types;

public class LightBulb
{
	private String make;
	private String model;
	private int watts;
	private Types type;
	private double price;
	private Colors color;
	private int warrantyMonths;
	private boolean status;
	
	public boolean setMake(String make)
	{
		if (make.toEquals(""))
		{
			return false;
		}
		this.make = make;
		return true;
	}

	public boolean setModel(String model)
	{
		if (model.toEquals(""))
		{
			return false;
		}
		this.model = model;
		return true;
	}

	public boolean setWatts(int watts)
	{
		if (watts <= 0)
		{
			return false;
		}
		this.watts = watts;
		return true;
	}

	public boolean setType(int type)
	{
		if (type < 1 && type > 3)
		{
			return false;
		}
		
		switch(type)
		{
			case 1:
				this.type = Types.Incandescent; break;
			case 2:
				this.type = Types.Fluorescent; break;
			case 3:
				this.type = Types.LED; break;
			default:
				this.type = Types.Other;
		}
		return true;
	}
}

