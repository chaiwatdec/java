package java_day11;

public class d11_1
{
	public static void main(String[] args)
	{
		String s = " Hello e ";
		String k = "1,2,3,7,8,9";
		String so = "HELLOEXPERT";
		String se = "OEXPERT";

		// trim the space ,start, end
		System.out.println("Trim: " + "'" + s.trim() + "'");

		// to upper
		System.out.println("toUpperCase: " + s.toUpperCase());

		// to lower
		System.out.println("toLowerCase: " + s.toLowerCase());

		// split
		String[] l = k.split(",");
		System.out.println("split:" + l[0] + " " + l[3]);

		// indexof
		int a = s.indexOf("e");
		int b = s.lastIndexOf("e");
		int c = s.indexOf("e", 2); // find e since position 2
		System.out.println("indexOf e: " + a);
		System.out.println("lastIndexOf e: " + b);
		System.out.println("indexOf e 2: " + c);

		// substring
		String ss = s.substring(4, 6);
		System.out.println("substring 4,6: " + ss);

		// charAt
		System.out.println("charAt 1: " + s.charAt(1));

		// isempty
		System.out.println("isEmpty: " + s.isEmpty());

		// equals
		System.out.println("equals s and k: " + s.equals(k));

		// compare
		System.out.println("compareTo: " + so.compareTo(se));

		// contains
		System.out.println("contains s ss: " + s.contains(ss));
	}
}
