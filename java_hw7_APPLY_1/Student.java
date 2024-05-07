package java_hw7_APPLY_1;

import java.util.Arrays;
import java.util.Comparator;

public class Student
{
	public String id, fullname, faculty;
	public int year, numberOfStudent;
	public static Student[] allStudent;
	public static int stdcount = 0;

	public Student()
	{
	}

	public Student(String id, String fullname, String faculty, int year, int numberOfStudent)
	{
		this.id = id;
		this.fullname = fullname;
		this.faculty = faculty;
		this.year = year;
		this.numberOfStudent = numberOfStudent;
	}

	public Student(String s)
	{
		String[] sp = s.split(" ");
		this.fullname = sp[0] + " " + sp[1];
		this.year = Integer.parseInt(sp[2]);
		this.faculty = sp[3];

		this.id = String.format("%05d", ++stdcount);
		// this.id = stdcount;
		int numberOfStudent = Integer.parseInt(this.id);

		// this.allStudent=1;

		System.out.printf("Create Student ID %05d Name %s\n", numberOfStudent, fullname);
	}

	public static void add(Student s)
	{
		if (allStudent == null)
			allStudent = new Student[1];
		else
			allStudent = Arrays.copyOf(allStudent, allStudent.length + 1);

		allStudent[allStudent.length - 1] = s;
		System.out.println("Add Student ID " + s.id);

		/*
		 * for (int i = 0; i < allStudent.length; i++) {
		 * System.out.println(allStudent[i].id + allStudent[i].fullname +
		 * allStudent[i].faculty); }
		 */
	}

	public static void sort(String type)
	{
		// System.out.println(type);

		if (type.equals("id"))
		{
			Arrays.sort(allStudent, Comparator.comparing(student -> student.id));
		} else if (type.equals("fullname"))
		{
			Arrays.sort(allStudent, Comparator.comparing(student -> student.fullname));
		}

		for (int i = 0; i < allStudent.length; i++)
		{
			/*
			 * System.out.println(allStudent[i].id + " " + allStudent[i].fullname + " " +
			 * allStudent[i].year + " " + allStudent[i].faculty);
			 * 
			 */
			System.out.println(allStudent[i].fullname);
		}
	}

	public static void find(String type, String value)
	{
		// Sort by fullname
		Arrays.sort(allStudent, Comparator.comparing(student -> student.fullname));

		for (int i = 0; i < allStudent.length; i++)
		{
			if (type.equals("id"))
			{
				// System.out.println(value);
				// Arrays.sort(allStudent, Comparator.comparing(student -> student.id));

				if (value.equals(allStudent[i].id))
				{
					System.out.println(allStudent[i].fullname);
				}

			} else if (type.equals("fullname"))
			{
				// Arrays.sort(allStudent, Comparator.comparing(student -> student.fullname));

				if (value.equals(allStudent[i].fullname))
				{
					System.out.println(allStudent[i].fullname);
				}
			} else if (type.equals("faculty"))
			{
				// Arrays.sort(allStudent, Comparator.comparing(student -> student.faculty));

				if (value.equals(allStudent[i].faculty))
				{
					System.out.println(allStudent[i].fullname);
				}
			} else if (type.equals("year"))
			{
				// Arrays.sort(allStudent, Comparator.comparing(student -> student.year));

				int fnyear = Integer.parseInt(value);
				if (fnyear == allStudent[i].year)
				{
					System.out.println(allStudent[i].fullname);
				}
			}
		}
	}

	public static void remove(String type, String value)
	{
		// Sort by fullname
		// Arrays.sort(allStudent, Comparator.comparing(student -> student.fullname));

		// List<Student> updated = new ArrayList<>();

		for (int i = 0; i < allStudent.length; i++)
		{
			if (type.equals("id"))
			{
				// System.out.println(value);
				// Arrays.sort(allStudent, Comparator.comparing(student -> student.id));

				if (value.equals(allStudent[i].id))
				{
					for (int j = i; j < allStudent.length - 1; j++)
					{
						allStudent[j] = allStudent[j + 1];
					}

					allStudent = Arrays.copyOf(allStudent, allStudent.length - 1);
				}

			} else if (type.equals("fullname"))
			{
				// Arrays.sort(allStudent, Comparator.comparing(student -> student.fullname));

				if (value.equals(allStudent[i].fullname))
				{
					for (int j = i; j < allStudent.length - 1; j++)
					{
						allStudent[j] = allStudent[j + 1];
					}
				}

				allStudent = Arrays.copyOf(allStudent, allStudent.length - 1);

			} else if (type.equals("faculty"))
			{
				// Arrays.sort(allStudent, Comparator.comparing(student -> student.faculty));

				if (value.equals(allStudent[i].faculty))
				{
					for (int j = i; j < allStudent.length - 1; j++)
					{
						allStudent[j] = allStudent[j + 1];
					}
				}

				allStudent = Arrays.copyOf(allStudent, allStudent.length - 1);

			} else if (type.equals("year"))
			{
				// Arrays.sort(allStudent, Comparator.comparing(student -> student.year));

				int fnyear = Integer.parseInt(value);

				if (fnyear == allStudent[i].year)
				{
					for (int j = i; j < allStudent.length - 1; j++)
					{
						allStudent[j] = allStudent[j + 1];
					}

					allStudent = Arrays.copyOf(allStudent, allStudent.length - 1);
				}

			}

			// allStudent = Arrays.copyOf(allStudent, allStudent.length - 1);
		}

		// int count = count(allStudent, 4);

		Arrays.sort(allStudent, Comparator.comparing(student -> student.fullname));

		for (int i = 0; i < allStudent.length; i++)
		{
			// System.out.println(allStudent[i].fullname + " " + allStudent[i].year + " " +
			// allStudent[i].faculty);
			System.out.println(allStudent[i].fullname);
		}

	}

	public static int count(Student[] s, int target)
	{
		int count = 0;
		for (int i = 0; i < allStudent.length; i++)
		{
			if (allStudent[i].year == target)
			{
				count++;
			}
		}

		return count;
	}

	public void setID(String id)
	{
		this.id = id;
	}

	public int getID()
	{
		int iid = Integer.parseInt("id");
		return iid;
	}

	public void setFullname(String fullname)
	{
		this.fullname = fullname;
	}

	public String getFullname()
	{
		return fullname;
	}

	public void setFaculty(String faculty)
	{
		this.faculty = faculty;
	}

	public String getFaculty()
	{
		return faculty;
	}

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public int getNumberOfStudent()
	{
		return numberOfStudent;
	}

	public void setNumberOfStudent(int numberOfStudent)
	{
		this.numberOfStudent = numberOfStudent;
	}

}
