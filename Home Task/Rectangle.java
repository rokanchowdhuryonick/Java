class Point{
	private double x;
	private double y;

	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
}
public class Rectangle {
	Point A, B, C, D;
	double length, width;
	public Rectangle(Point A, Point B, Point C, Point D){
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
		this.length = C.getX()-B.getX();
		this.width = A.getY()-B.getY();
		
	}
	public Rectangle(Point B, double length, double width){
		this.length = length;
		this.width = width;
		this.B = B;
		this.A = new Point(this.B.getX(), this.B.getY()+this.width);
		this.C = new Point(this.B.getX()+this.length, this.B.getY());
		this.D = new Point(this.C.getX(), this.C.getY()+this.width);
	}
	void draw(){
		System.out.println("Rectangle------------");
		System.out.println("Point A: "+ this.A.getX()+", "+ this.A.getY());
		System.out.println("Point B: "+ this.B.getX()+", "+ this.B.getY());
		System.out.println("Point C: "+ this.C.getX()+", "+ this.C.getY());
		System.out.println("Point D: "+ this.D.getX()+", "+ this.D.getY());
		System.out.println("Length: "+ this.length +" cm");
		System.out.println("Width: "+ this.width +" cm");
		System.out.println("Rectangle------------");
		System.out.println();
	}
	public static void main(String[] args) {
		Point p1 = new Point(1,1);
		Rectangle rectangle1 = new Rectangle(p1, 8, 4);
		rectangle1.draw();
		Point p2 = new Point(2, 6);
		Point p3 = new Point(2, 2);
		Point p4 = new Point(10, 2);
		Point p5 = new Point(10, 6);
		Rectangle rectangle2 = new Rectangle(p2, p3, p4, p5);
		rectangle2.draw();

	}

}
