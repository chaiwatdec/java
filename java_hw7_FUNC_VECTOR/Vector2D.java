package java_hw7_FUNC_VECTOR;

public class Vector2D
{
	public double X, Y;

	public Vector2D add(Vector2D V)
	{
		Vector2D result = new Vector2D();
		result.X = X + V.X;
		result.Y = Y + V.Y;

		return result;
	}

	public Vector2D minus(Vector2D V)
	{
		Vector2D result = new Vector2D();
		result.X = X - V.X;
		result.Y = Y - V.Y;

		return result;
	}

	public double dot(Vector2D V)
	{
		double result;

		result = (X * V.X) + (Y * V.Y);

		return result;
	}

	public double size()
	{
		// magnitude of vector
		double result;

		result = Math.sqrt((X * X) + (Y * Y));

		return result;
	}

	public Vector2D unit()
	{
		// unit of vector
		Vector2D result = new Vector2D();
		result.X = X / (Math.sqrt((X * X) + (Y * Y)));
		result.Y = Y / Math.sqrt((X * X) + (Y * Y));

		return result;
	}
}