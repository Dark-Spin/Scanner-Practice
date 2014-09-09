import java.util.ArrayList;

public class ArrayListChallenge

	{

	public static void main(String[] args)
		{
		ArrayList myArray = new ArrayList();

		myArray.add(2.1);
		myArray.add(1.1);
		myArray.add(18.9);
		myArray.add(28.1);
		myArray.add(3.8);
		double total = 0;
		double total2 = 0;

		for (int i = 0; i < myArray.size(); i++)
			{
			System.out.println(myArray.get(i));
			total = total + (double) myArray.get(i);
			}	
			System.out.println(total);
			
			myArray.add(6.8);
			myArray.add(4.2);
			myArray.remove(2.1);
			{
			for (int i = 0; i < myArray.size(); i++)
			total2 = total2 + (double) myArray.get(i);
			}
			System.out.println(total2 / myArray.size());
		
			

		}
	}
