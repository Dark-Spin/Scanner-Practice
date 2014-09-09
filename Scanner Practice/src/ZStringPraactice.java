public class ZStringPraactice
	{
	static String alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z ";
	static int counter;

	public static void main(String[] args)
		{
		for (int i = 1; i < alphabet.length(); i = i + 2)
			{
			System.out.print(alphabet.substring(i - 1, i));
			}
		for (int i = 1; i < alphabet.length(); i = i + 4)
			{
			System.out.print(alphabet.substring(i - 1, i) + " ");
			}
		for (int i = 3; i < alphabet.length(); i = i + 4)
			{
			System.out.print(alphabet.substring(i - 1, i));
			}
		for (int i = 1; i < alphabet.length(); i = i + 2)
			{
			System.out.println(alphabet.substring(i - 1, i));
			}
		System.out.println("The number of characters is " + alphabet.length());
		for (int i = 1; i < alphabet.length(); i++)
			{
			if (" ".equals(alphabet.substring(i - 1, i)))
				{
				counter = counter+1;
				}
			}
		System.out.println("The number of spaces is " + counter);
		}
	}
