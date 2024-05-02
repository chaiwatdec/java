package java_hw7_FUNC_MATRIX;

public class Matrix3
{
	public double[][] E;

	public Matrix3 add(Matrix3 o)
	{
		Matrix3 result = new Matrix3();
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

	public Matrix3 minus(Matrix3 o)
	{
		Matrix3 result = new Matrix3();
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

	public Matrix3 mul(Matrix3 o)
	{
		Matrix3 result = new Matrix3();
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
		double resultcal;
		Matrix3 result = new Matrix3();

		row = row - 1;
		col = col - 1;

		result.E = new double[E.length - 1][E[0].length - 1];

		int nrow = 0;
		for (int i = 0; i < E.length; i++)
		{
			if (i == row)
			{
				continue;
			}

			int ncol = 0;
			for (int j = 0; j < E[0].length; j++)
			{
				if (j == col)
				{
					continue;
				}

				result.E[nrow][ncol] = E[i][j];
				ncol++;
			}
			nrow++;
		}

		resultcal = (result.E[0][0] * result.E[1][1]) - (result.E[0][1] * result.E[1][0]);

		return resultcal;
	}

	public double cof(int row, int col)
	{
		double result;
		result = Math.pow((-1), row + col) * minor(row, col);

		return result;
	}

	public Matrix3 adj()
	{
		Matrix3 result = new Matrix3();
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

	public Matrix3 inverse()
	{
		Matrix3 result = new Matrix3();
		result.E = new double[3][3];

		for (int i = 0; i < E.length; i++)
		{
			for (int j = 0; j < E[0].length; j++)
			{
				result.E[i][j] = adj().E[i][j] / det();
			}
		}

		return result;
	}
}