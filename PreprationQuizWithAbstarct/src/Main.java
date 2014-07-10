
public class Main {
	public static void main(String[] args) {
		
		System.out.println("Hi friends.. **With Abstract** ");
		
		Circle c1 = new Circle(5);
		Sphere s1 = new Sphere(3);
		System.out.println(" - - - ");
		System.out.println(c1.getName()+"\t"+ c1.getArea() +"\t\t\t\t" +c1.getClass());
		System.out.println(" - - - ");
		System.out.println(s1.getName()+"\t"+ s1.getArea() +"\t" + s1.getVolume() +"\t" +s1.getClass());
	}

}
