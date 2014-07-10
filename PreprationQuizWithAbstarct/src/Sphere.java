
public class Sphere extends Shape{
	private double radius;	

	public Sphere(double radius) {		
		this.radius =radius;
		name=super.name;
		area=super.area;
		volume=super.volume;
	}

	@Override
	public String getName() {	
		name="Sphere";
		return name;
	}
	@Override
	public Double getArea() {
		area=(4 * (Math.PI) * (Math.pow(radius, 2)));
		return area;
	}

	@Override
	public Double getVolume() {
		volume=(4 / 3 * (Math.PI) * (Math.pow(radius, 3)));
		return volume;
	}
	
	
}
