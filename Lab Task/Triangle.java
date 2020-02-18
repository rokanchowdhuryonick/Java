package triangle;

public class Triangle {
	private int x, y, z;

	public Triangle() {
		//Default Constructor...
	}
	public Triangle(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void showInfo() {
		System.out.println("X = "+this.x+", Y = "+this.y+", Z = "+this.z);
	}
	
	public void testTriangle() {
		if(x == y && x == z) {
			System.out.println("Equilateral");
		}else if(x!=y && x!=z) {
			System.out.println("Scalene");
		}else {
			System.out.println("Icosceles");
		}
	}
	
	
}
