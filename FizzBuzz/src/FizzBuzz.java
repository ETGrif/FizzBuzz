
public class FizzBuzz
	{

		public static void main(String[] args)
			{
				for (int i = 1; i <= 1155; i++)
					{

						// rules
						int[] mods =
							{ 3, 5, 7, 11};
						String[] replacement =
							{ "Fizz", "Buzz" , "Fuzz", "Bizz"};

						
						// find replacements
						String output = "";
						for (int j = 0; j < mods.length; j++)
							{
								//for every mod, if it divides evenly, add its replacement to the output
								if (i % mods[j] == 0)
									{
										output += replacement[j];
									}
							}

						// print
						if (output.equals(""))
							{
								System.out.println(i);
							}
						else
							{
								System.out.println(output);
							}
						
					}
				
			}
		
	}