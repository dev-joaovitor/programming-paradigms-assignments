import lightbulb.LightBulb;
import lightbulb.Types;
import lightbulb.Colors;
import lightbulb.utils.InputManager;

public class LightBulbProgram
{
	public static void main(String[] args)
	{
		InputManager im = new InputManager();

		LightBulb lb = new LightBulb();

		lb.setMake(im.getValidString());
		lb.setModel(im.getValidString());
		lb.setWatts(im.getPositiveInteger());
		lb.setType(im.getValidBulbType());
		lb.setPrice(im.getPositiveDouble());
		lb.setColor(im.getValidBulbColor());
		lb.setWarrantyMonths(im.getPositiveInteger());
		//lb.setStatus();


	}
}
