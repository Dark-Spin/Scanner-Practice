import java.util.ArrayList;
import java.util.Scanner;

public class Student
	{
	private String name;
	private double score;
	private String newName;
	private double newScore;
	
	public Student( String n, double s);
		{
		name = n;
		score = s;
		}
		
		public String getName()
			{
			return name;
			}
		public double getScore()
			{
			return score;
			}
		public void setName (String name)
			{
			this.name = name;
			}
		public void setScore (double score)
			{
			this.score = score;
			}
	
	public static void main(String[] args)	
		
		{
		ArrayList<Student> results = new ArrayList<Student>();
		
		results.add(new Student("Charlie", 20.0));
		results.add(new Student("Mac", 75.5));
		results.add(new Student("Dennis", 99.9));
		results.add(new Student("Dee", 86.7));
		results.add(new Student("Frank", 60.5));
		//grades.add(new Student(userName, userScore));
		displayScore();
		
		}
		
	private static void displayScore()
		{
		for(Student x: results)
			{
			System.out.println(x.getName() + x.getScore());
			}
		}

	}
