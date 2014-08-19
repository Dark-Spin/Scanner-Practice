import java.util.Scanner;

public class ScannerPractice 
{
	
	int the;
	static String response;
	
	public static void main(String[] args) 
	{
	System.out.println("Do you want to speak to Donnie?");	 
	Scanner UserInput = new Scanner (System.in);
	response = UserInput.nextLine();
	if(response.equals("yes"))
			{
			System.out.println("The conversation does not start and stop when Donnie speaks.");
			}
	if(response.equals("no"))
			{
			System.out.println("Am I the only one around here who speaks to Donnie?");
			}
		
	}

}
