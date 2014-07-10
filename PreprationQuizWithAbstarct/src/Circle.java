
public class Circle extends TwoDimensional {
	private double radius;

	public Circle(double radius) {
		this.radius =radius;
		name=super.name;
		area=super.area;
		volume=super.volume;
	}
	@Override
	public String getName() {	
		name="Circle";
		return name;
	}
	@Override
	public Double getArea() {
		area=((Math.PI) * (Math.pow(radius, 2)));	
		return area;
	}
}
