
public class Circle extends TwoDimensional {
	private double area;
	private double radius;
	
	public Circle(double radius) {
		this.radius=radius;				
	}	
	public double getArea() {
		area=((Math.PI) * (Math.pow(radius, 2)));	
		return area;
	}	
	public String toString()
    {
		return String.format("This Circle's Area: %.2f",getArea());
    }


}
