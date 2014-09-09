import java.util.ArrayList;

public class Dogs
	{

	private String name;
	private String breed;
	private int age;
	private double weight;

	public Dogs(String n, String b, int a, double w)
		{
		name = n;
		breed = b;
		age = a;
		weight = w;
		}

	public String getName()
		{
		return name;
		}

	public String getBreed()
		{
		return breed;
		}

	public int getAge()
		{
		return age;
		}

	public double getWeight()
		{
		return weight;
		}

	public static void main(String[] args)
		{
		ArrayList<Dogs> cataloge = new ArrayList<Dogs>();

		cataloge.add(new Dogs("Jimmy", "Shiba Inu", 1, 20.0));
		cataloge.add(new Dogs("Wow", "Shiba Inu", 8, 30.0));
		cataloge.add(new Dogs("Pup", "Mutt", 1, 44.5));
		cataloge.add(new Dogs("Levi", "Golden Retriever", 3, 17.0));
		cataloge.add(new Dogs("Slav", "Russian PitBull", 5, 50.0));

		for (int i = 0; i < cataloge.size(); i++)
			{
			System.out.println(cataloge.get(i).getName() + " the "
					+ cataloge.get(i).getBreed() + " is "
					+ cataloge.get(i).getAge() + " year(s) old and weigh(s) "
					+ cataloge.get(i).getWeight() + " pounds. ");
			System.out.println(cataloge.get(i).getWeight() + i);
			}
		}

	}
