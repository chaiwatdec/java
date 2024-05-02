package java_day13;

public class City
{
	// Country,City,AccentCity,Region,Population,Latitude,Longtitude
	String Country, City, AccentCity, Region;
	long Population;
	double Latitude, Longtitude;
	
	public String toString() {
		return String.format("%s\t%s\t%s\t%s\t%d\t%f\t%f", Country,City,AccentCity,Region,Population,Latitude,Longtitude);
	}
}
