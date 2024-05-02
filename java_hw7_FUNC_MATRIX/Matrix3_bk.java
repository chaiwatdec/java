package java_hw7_FUNC_MATRIX;

public class Matrix3_bk
{
	public double[][] E;

	public Matrix3_bk add(Matrix3_bk o)
	{
		Matrix3_bk result = new Matrix3_bk();
		result.E = new double[3][3];

		for (int i = 0; i < E.length; i++)
		{
			for (int j = 0; j < E[0].length; j++)
			{
				result.E[i][j] = E[i][j] + o.E[i][j];
			}
		}

		return result;
	}

	public Matrix3_bk minus(Matrix3_bk o)
	{
		Matrix3_bk result = new Matrix3_bk();
		result.E = new double[3][3];

		for (int i = 0; i < E.length; i++)
		{
			for (int j = 0; j < E[0].length; j++)
			{
				result.E[i][j] = E[i][j] - o.E[i][j];
			}
		}

		return result;
	}

	public Matrix3_bk mul(Matrix3_bk o)
	{
		Matrix3_bk result = new Matrix3_bk();
		result.E = new double[3][3];

		for (int i = 0; i < E.length; i++)
		{
			for (int j = 0; j < E.length; j++)
			{
				for (int k = 0; k < E.length; k++)
				{
					result.E[i][j] += E[i][k] * o.E[k][j];
				}
			}
		}

		return result;
	}

	public double det()
	{
		double result = 0;
		result += E[0][0] * (E[1][1] * E[2][2] - E[1][2] * E[2][1]);
		result -= E[0][1] * (E[1][0] * E[2][2] - E[1][2] * E[2][0]);
		result += E[0][2] * (E[1][0] * E[2][1] - E[1][1] * E[2][0]);

		return result;
	}

	public double minor(int row, int col)
	{
		double result;

		if (row == 1 && col == 1)
		{
			result = (E[1][1] * E[2][2]) - (E[2][1] * E[1][2]);
		} else if (row == 1 && col == 2)
		{
			result = (E[1][0] * E[2][2]) - (E[2][0] * E[1][2]);
		} else if (row == 1 && col == 3)
		{
			result = (E[1][0] * E[2][1]) - (E[2][0] * E[1][1]);
		} else if (row == 2 && col == 1)
		{
			result = (E[0][1] * E[2][2]) - (E[2][1] * E[0][2]);
		} else if (row == 2 && col == 2)
		{
			result = (E[0][0] * E[2][2]) - (E[2][0] * E[0][2]);
		} else if (row == 2 && col == 3)
		{
			result = (E[0][0] * E[2][1]) - (E[2][0] * E[0][1]);
		} else if (row == 3 && col == 1)
		{
			result = (E[0][1] * E[1][2]) - (E[1][1] * E[0][2]);
		} else if (row == 3 && col == 2)
		{
			result = (E[0][0] * E[1][2]) - (E[1][0] * E[0][2]);
		} else
		{
			result = (E[0][0] * E[1][1]) - (E[1][0] * E[0][1]);
		}

		return result;
	}

	public double cof(int row, int col)
	{
		double cofactor;
		cofactor = Math.pow((-1), row + col) * minor(row, col);

		return cofactor;
	}

	public Matrix3_bk adj()
	{
		Matrix3_bk result = new Matrix3_bk();
		result.E = new double[3][3];

		for (int i = 0; i < result.E.length; i++)
		{
			for (int j = 0; j < result.E.length; j++)
			{
				int row = i + 1;
				int col = j + 1;
				result.E[j][i] = Math.pow((-1), row + col) * (minor(row, col));
			}
		}

		return result;
	}
}