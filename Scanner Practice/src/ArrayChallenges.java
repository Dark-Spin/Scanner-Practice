
public class ArrayChallenges
	{
	static String [] challenge1 = {"baboon", "moose", "monkey", "gorilla"};
	static int [] challenge2 = {4,8,12,19};
	static int total;
	
	public static void main(String[] args)
		{
		System.out.println(challenge1 [3]);
		System.out.println(challenge2[challenge2.length - 1]);
		for(int i = 0; i < challenge2.length; i++ )	
			{
			System.out.println( challenge2 [ i ]);
			total = total + challenge2 [i];
			}
			double average = total / challenge2.length;
			System.out.println( average );
	}
}