package java_hw7_FUNC_MATRIX;

public class Matrix2
{
	public double E11, E12, E21, E22;

	public Matrix2 add(Matrix2 m)
	{
		Matrix2 result = new Matrix2();
		result.E11 = E11 + m.E11;
		result.E12 = E12 + m.E12;
		result.E21 = E21 + m.E21;
		result.E22 = E22 + m.E22;

		return result;
	}

	public Matrix2 minus(Matrix2 m)
	{
		Matrix2 result = new Matrix2();
		result.E11 = E11 - m.E11;
		result.E12 = E12 - m.E12;
		result.E21 = E21 - m.E21;
		result.E22 = E22 - m.E22;

		return result;
	}

	public Matrix2 mul(Matrix2 m)
	{
		Matrix2 result = new Matrix2();
		result.E11 = (E11 * m.E11) + (E12 * m.E21);
		result.E12 = (E11 * m.E12) + (E12 * m.E22);
		result.E21 = (E21 * m.E11) + (E22 * m.E21);
		result.E22 = (E21 * m.E12) + (E22 * m.E22);

		return result;
	}

	public double det()
	{
		return E11 * E22 - E12 * E21;
	}

	public double minor(int row, int col)
	{
		double minor;
		if (row == 1 && col == 1)
		{
			minor = E22;
		} else if (row == 1 && col == 2)
		{
			minor = E21;
		} else if (row == 2 && col == 1)
		{
			minor = E12;
		} else
		{
			minor = E11;
		}

		return minor;
	}

	public double cof(int row, int col)
	{
		double cofactor;
		cofactor = Math.pow((-1), row + col) * minor(row, col);

		return cofactor;
	}

	public Matrix2 adj()
	{
		Matrix2 result = new Matrix2();
		result.E11 = E22;
		result.E12 = E12 * -1;
		result.E21 = E21 * -1;
		result.E22 = E11;

		return result;
	}

	public Matrix2 inverse()
	{
		Matrix2 result = new Matrix2();
		result.E11 = E22 * (1 / ((E11 * E22) - (E12 * E21)));
		result.E12 = (E12 * -1) * (1 / ((E11 * E22) - (E12 * E21)));
		result.E21 = (E21 * -1) * (1 / ((E11 * E22) - (E12 * E21)));
		result.E22 = E11 * (1 / ((E11 * E22) - (E12 * E21)));

		return result;
	}
}
