import java.util.ArrayList;
public class ArrayListChallenges
	{
		static double sum = 0;
		public static void main(String[] args)
			{
				ArrayList<Double>team = new ArrayList<Double>();
				team.add(10.0);
				team.add(9.5);
				team.add(11.3);
				team.add(23.4);
				team.add(0.3);
				
//				number one
				for (int i = 0; i<team.size(); i++)
					{
						System.out.println(team.get(i));
						sum +=team[i];
					}
//				number two
				
			}

	}
