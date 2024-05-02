package java_day9;

public class Fractal
{
	public int numer, denom;

	public Fractal add(Fractal f)
	{
		Fractal result = new Fractal();
		result.numer = (numer * f.denom) + (f.numer * denom);
		result.denom = denom * f.denom;
		return result;
	}

	public Fractal sub(Fractal f)
	{
		Fractal result = new Fractal();
		result.numer = (numer * f.denom) - (f.numer * denom);
		result.denom = denom * f.denom;
		return result;
	}

	public Fractal mul(Fractal f)
	{
		Fractal result = new Fractal();
		result.numer = numer * f.numer;
		result.denom = denom * f.denom;
		return result;
	}
}
