package java_hw7_FUNC_MATRIX;

public class MatrixN
{
	public int N;
	public double[][] E;

	public MatrixN(int n)
	{
		this.N = n;
		this.E = new double[n][n];
	}

	public MatrixN(int n, double[][] e)
	{
		this.N = n;
		this.E = new double[n][n];
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				this.E[i][j] = e[i][j];
			}
		}
	}

	public void printMyMatrix()
	{
		for (int i = 0; i < this.N; i++)
		{
			for (int j = 0; j < this.N; j++)
			{
				System.out.println(E[i][j]);
			}
		}
	}

	public MatrixN add(MatrixN m)
	{
		MatrixN result = new MatrixN(this.N);

		for (int i = 0; i < this.N; i++)
		{
			for (int j = 0; j < this.N; j++)
			{
				result.E[i][j] = this.E[i][j] + m.E[i][j];
			}
		}
		return result;
	}

	public MatrixN minus(MatrixN m)
	{
		MatrixN result = new MatrixN(this.N);

		for (int i = 0; i < this.N; i++)
		{
			for (int j = 0; j < this.N; j++)
			{
				result.E[i][j] = this.E[i][j] - m.E[i][j];
			}
		}
		return result;
	}

	public MatrixN mul(MatrixN m)
	{
		MatrixN result = new MatrixN(this.N);

		for (int i = 0; i < E.length; i++)
		{
			for (int j = 0; j < E.length; j++)
			{
				for (int k = 0; k < E.length; k++)
				{
					result.E[i][j] += E[i][k] * m.E[k][j];
				}
			}
		}

		return result;
	}

	public double det()
	{
		return det(this.E);
	}

	private double det(double[][] matrix)
	{
		int n = matrix.length;
		if (n == 1)
		{
			return matrix[0][0];
		}

		double det = 0;
		for (int j = 0; j < n; j++)
		{
			det += Math.pow(-1, j) * matrix[0][j] * det(getsubmatrix(matrix, 0, j));
		}
		return det;
	}

	private double[][] getsubmatrix(double[][] matrix, int row, int col)
	{
		int n = matrix.length;
		double[][] submatrix = new double[n - 1][n - 1];
		int r = 0, c;
		for (int i = 0; i < n; i++)
		{
			if (i == row)
				continue;
			c = 0;
			for (int j = 0; j < n; j++)
			{
				if (j == col)
					continue;
				submatrix[r][c] = matrix[i][j];
				c++;
			}
			r++;
		}
		return submatrix;
	}

	public double minor(int row, int col)
	{
		row--;
		col--;

		double[][] nmatrix = new double[N - 1][N - 1];

		int nrow = 0;
		for (int i = 0; i < N; i++)
		{
			if (i == row)
			{
				continue;
			}

			int ncol = 0;
			for (int j = 0; j < N; j++)
			{
				if (j == col)
				{
					continue;
				}

				nmatrix[nrow][ncol] = E[i][j];
				ncol++;
			}
			nrow++;
		}

		double resultcal = det(nmatrix);

		return resultcal;
	}

	public double cof(int row, int col)
	{
		double result;
		result = Math.pow((-1), row + col) * minor(row, col);

		return result;
	}

	public MatrixN adj()
	{
		MatrixN result = new MatrixN(this.N);

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

	public MatrixN inverse()
	{
		MatrixN result = new MatrixN(this.N);

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