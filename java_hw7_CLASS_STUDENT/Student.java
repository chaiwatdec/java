package java_hw7_CLASS_STUDENT;

public class Student
{
	public String name, surname, classroom;
	public int id, score;

	public Student(int id, String name, String surname, String classroom, int score)
	{
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.classroom = classroom;
		this.score = score;
	}

	public String getFullname()
	{
		return name + " " + surname;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSurname()
	{
		return surname;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	public String getClassroom()
	{
		return classroom;
	}

	public void setClassroom(String classroom)
	{
		this.classroom = classroom;
	}

	public int getScore()
	{
		return score;
	}

	public void setScore(int score)
	{
		this.score = score;
	}

	public int getID()
	{
		return id;
	}

	public void setID(int id)
	{
		this.id = id;
	}

	public String getGrade()
	{
		if (score > 90)
		{
			return "A";
		} else if (score > 80)
		{
			return "B";
		} else if (score > 70)
		{
			return "C";
		} else if (score > 60)
		{
			return "D";
		} else
		{
			return "F";
		}
	}

	public static double scoreAverage(Student[] students)
	{
		int totalScore = 0;
		for (int i = 0; i < students.length; i++)
		{
			totalScore += students[i].getScore();
		}
		return (double) totalScore / students.length;
	}

	public static double scoreClass(Student[] students, String classroom)
	{
		int totalScore = 0;
		int count = 0;
		for (int i = 0; i < students.length; i++)
		{
			if (students[i].getClassroom().equals(classroom))
			{
				totalScore += students[i].getScore();
				count++;
			}
		}

		if (count == 0)
		{
			return 0;
		}
		return (double) totalScore / count;
	}

	public static void ranking(Student[] students)
	{
		for (int i = 0; i < students.length - 1; i++)
		{
			for (int j = 0; j < students.length - i - 1; j++)
			{
				if (students[j].score < students[j + 1].score)
				{
					Student temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < students.length; i++)
		{
			System.out.println(students[i].getFullname());
		}
	}
}