package lightbulb;
import lightbulb.Types;
import lightbulb.Colors;

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
	
	// getters
	public String getMake()
	{
		return this.make;
	}

	public String getModel()
	{
		return this.model;
	}

	public int getWatts()
	{
		return this.watts;
	}
	
	public Types getType()
	{
		return this.type;
	}

	public String getTypeString()
	{
		switch(this.type)
		{
			case Incandescent:
				return "Incandescent";
			case Fluorescent:
				return "Fluorescent";
			case LED:
				return "LED";
			default:
				return "Other";
		}
	}
	
	public double getPrice()
	{
		return this.price;
	}

	public Colors getColor()
	{
		return this.color;
	}

	public String getColorString()
	{
		switch(this.color)
		{
			case Yellow:
				return "Yellow";
			case White:
				return "White";
			case Colorful:
				return "Colorful";
		}
		return "No color";
	}
	
	public int getWarrantyMonths()
	{
		return this.warrantyMonths;
	}

	public boolean getStatus()
	{
		return this.status;
	}

	public String getStatusString()
	{
		return status ? "On" : "Off";
	}

	// setters
	public boolean setMake(String make)
	{
		if (make.equals(""))
			return false;

		this.make = make;
		return true;
	}

	public boolean setModel(String model)
	{
		if (model.equals(""))
			return false;
		
		this.model = model;
		return true;
	}

	public boolean setWatts(int watts)
	{
		if (watts <= 0)
			return false;

		this.watts = watts;
		return true;
	}

	public boolean setType(int type)
	{
		if (type < 1 && type > 3)
			return false;
		
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

	public boolean setPrice(double price)
	{
		if (price <= 0.00)
			return false;

		this.price = price;
		return true;
	}

	public boolean setColor(int color)
	{
		if (color < 1 && color > 3)
			return false;

		switch(color)
		{
			case 1:
				this.color = Colors.White; break;
			case 2:
				this.color = Colors.Yellow; break;
			case 3:
				this.color = Colors.Colorful; break;
			default:
				return false;
		}
		return true;
	}

	public boolean setWarrantyMonths(int months)
	{
		if (months <= 0)
			return false;

		this.warrantyMonths = months;

		return true;
	}

	public boolean setStatus(boolean status)
	{
		if (this.status == status)
			return false;

		this.status = status;
		return true;
	}
}

