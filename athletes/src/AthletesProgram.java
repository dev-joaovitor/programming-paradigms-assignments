import java.util.Scanner;
import athlete.*; // Athlete class, Sex enum

public class AthletesProgram 
{
	private static double womenAmount = 0;
	private static double menAmount = 0;
	private static Scanner sc = new Scanner(System.in);

	private static void incrementWomenAmount()
	{
		womenAmount += 1;
	}
	
	private static void incrementMenAmount()
	{
		menAmount += 1;
	}

	private static double getPositiveDouble()
	{
		double value = 0;

		while (true)
		{
			value = sc.nextDouble();

			if (value > 0) break;

			System.out.printf("Invalid number, try again: ");
		}
		sc.nextLine(); // clear the buffer
		return value;
	}

	private static Sex getValidSex()
	{
		Sex sex;
		char charSex;

		while (true)
		{
			charSex = sc.next().charAt(0);
			if (charSex == 'F' || charSex == 'f')
			{
				sex = Sex.FEMALE;
				incrementWomenAmount();
				break;
			}
			if (charSex == 'M' || charSex == 'm')
			{
				sex = Sex.MALE;
				incrementMenAmount();
				break;
			}
			System.out.printf("Invalid sex, try again: ");
		}
		return sex;
	}

	private static Athlete findHighestAthlete(Athlete[] athletes)
	{
		Athlete highestAthlete = null;
		for (Athlete athlete : athletes)
		{
			if (highestAthlete == null
				|| athlete.getHeight() > highestAthlete.getHeight())
				{
					highestAthlete = athlete;
				}
		}
		return highestAthlete;
	}

	private static double calcAthletesAverageWeight(Athlete[] athletes)
	{
		double weightSum = 0;
		for (Athlete athlete : athletes)
		{
			weightSum += athlete.getWeight();
		}
		return weightSum/athletes.length;
	}
	
	private static double calcMenPercentage(int athleteAmount)
	{
		return (menAmount/athleteAmount)*100;
	}
	
	private static double calcWomenAverageHeight(Athlete[] athletes)
	{
		if (womenAmount == 0) return 0;

		double womenHeightSum = 0;
		
		for (Athlete athlete : athletes)
		{
			if (athlete.getSex() == Sex.FEMALE)
			{
				womenHeightSum += athlete.getHeight();
			}
		}
		return womenHeightSum/womenAmount;
	}
	
	private static void printReport(Athlete[] athletes)
	{
		System.out.printf("\n*-*-* [MEASUREMENTS REPORT] *-*-*\n\n");
		
		System.out.printf(
			"- Average athlete weight: %.2f\n",
			calcAthletesAverageWeight(athletes)
		);
		
		Athlete highestAthlete = findHighestAthlete(athletes);
		
		System.out.printf(
			"- Highest athlete: %s, with a height of %.2f\n",
			highestAthlete.getName(),
			highestAthlete.getHeight()
		);
		
		System.out.printf(
			"- Men percentage: %.2f%%\n",
			calcMenPercentage(athletes.length)
		);
		
		if (womenAmount == 0)
		{
			System.out.printf("- There are no women registered\n");
			return;
		}

		System.out.printf(
			"- Women average height: %.2f",
			calcWomenAverageHeight(athletes)
		);
	}

	public static void main(String[] args)
	{
		System.out.printf("\n*-*-* [ATHLETE REGISTRATION SYSTEM] *-*-*\n\n");
		
		System.out.printf("Enter the number of athletes you want to register: ");
		int athleteAmount = (int) getPositiveDouble();

		Athlete[] athletes = new Athlete[athleteAmount];

		for (int i = 0; i < athletes.length; ++i)
		{
			System.out.printf("\nAthlete Number: %d\n", i+1);

			Athlete athlete = new Athlete();

			System.out.printf("Enter the athlete's name: ");
			athlete.setName(sc.nextLine());

			System.out.printf("Enter the athlete's sex (M - Male, F - Female): ");
			athlete.setSex(getValidSex());

			System.out.printf("Enter the athlete's height (e.g., 1.73): ");
			athlete.setHeight(getPositiveDouble()) ;

			System.out.printf("Enter the athlete's weight (e.g., 74.82): ");
			athlete.setWeight(getPositiveDouble());

			athletes[i] = athlete;
		}

		printReport(athletes);

		sc.close();    
	}
}
