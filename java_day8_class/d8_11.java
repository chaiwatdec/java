package java_day8_class;

import java.util.Arrays;

public class d8_11
{

	public static void main(String[] args)
	{
		String s[][]=new String[][]
		{
			{
				"xxxx",
				"x--x",
				"x--x",
				"x--x",
				"xxxx"
			},
			{
				"---x",
				"---x",
				"---x",
				"---x",
				"---x"
			},
			{
				"xxxx",
				"---x",
				"xxxx",
				"x---",
				"xxxx"
			},
			{
				"xxxx",
				"---x",
				"xxxx",
				"---x",
				"xxxx"
			},
			{
				"x--x",
				"x--x",
				"xxxx",
				"---x",
				"---x"
			},
			{
				"xxxx",
				"x---",
				"xxxx",
				"---x",
				"xxxx"
			},
			{
				"xxxx",
				"x---",
				"xxxx",
				"x--x",
				"xxxx"
			},
			{
				"xxxx",
				"---x",
				"---x",
				"---x",
				"---x"
			},
			{
				"xxxx",
				"x--x",
				"xxxx",
				"x--x",
				"xxxx"
			},
			{
				"xxxx",
				"x--x",
				"xxxx",
				"---x",
				"---x"
			}
		};
		
		System.out.println(Arrays.deepToString(s[0]));
	}
}
