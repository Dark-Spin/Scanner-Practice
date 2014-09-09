public class LoopPractice
	{
	static String[] Orangutang =
		{ "monkey", "ape", "gorilla", "chimp", "jimmy" };
	static int[] numbers =
		{ 1, 4, 7, 2, 9, 12 };

	public static void main(String[] args)
		{
		int totalNumbers = 0;
		for (String animals : Orangutang)
			{
			System.out.println(animals);
			}
			{
			for (String animals : Orangutang)
				System.out.print(animals + " ");
			}
			{
			for (int i = 0; i < numbers.length; i = i + 2)
			System.out.println(numbers[i]);
			}
				{
				for(int total : numbers);
				totalNumbers = totalNumbers + total;
				System.out.println("The total numbers is " + totalNumbers + " ");
				}
			
			

		}

	}
