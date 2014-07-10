
public class Sphere extends ThreeDimensional {
	private double radius;
	private double area,volume;

	public Sphere(double radius) {
		this.radius=radius;				
	}	
	public double getArea() {
		area=(4 * (Math.PI) * (Math.pow(radius, 2)));
		return area;
	}	   
	public double getVolume() {
		volume=(4 / 3 * (Math.PI) * (Math.pow(radius, 3)));
		return volume;
	}
	public String toString()
    {
        return String.format("This Sphere's Area: %.2f and Volume : %.2f ",getArea(),getVolume());
    }

    


}
