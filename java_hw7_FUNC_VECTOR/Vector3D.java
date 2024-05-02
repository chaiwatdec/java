package java_hw7_FUNC_VECTOR;

public class Vector3D
{
	public double X, Y, Z;

	public Vector3D add(Vector3D V)
	{
		Vector3D result = new Vector3D();
		result.X = X + V.X;
		result.Y = Y + V.Y;
		result.Z = Z + V.Z;

		return result;
	}

	public Vector3D minus(Vector3D V)
	{
		Vector3D result = new Vector3D();
		result.X = X - V.X;
		result.Y = Y - V.Y;
		result.Z = Z - V.Z;

		return result;
	}

	public double dot(Vector3D V)
	{
		double result;

		result = (X * V.X) + (Y * V.Y) + (Z * V.Z);

		return result;
	}

	public double size()
	{
		// magnitude of vector
		double result;

		result = Math.sqrt((X * X) + (Y * Y) + (Z * Z));

		return result;
	}

	public Vector3D unit()
	{
		// unit of vector
		Vector3D result = new Vector3D();
		result.X = X / (Math.sqrt((X * X) + (Y * Y) + (Z * Z)));
		result.Y = Y / Math.sqrt((X * X) + (Y * Y) + (Z * Z));
		result.Z = Z / Math.sqrt((X * X) + (Y * Y) + (Z * Z));

		return result;
	}
}