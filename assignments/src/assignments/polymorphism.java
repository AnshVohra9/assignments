package assignments;
class Shapes{
	float l=20;
	float b=8;
	float getArea() {
		return 0f;
	}
}
class rectangle extends Shapes{
	float getArea() {
		return l*b;
	}
}
class square extends Shapes{
	float getArea() {
		return l*l;
	}
}
class triangle extends Shapes{
	float getArea() {
		return 0.5f*l*b;
	}
}
class rhombus extends Shapes{
	float getArea() {
		return 0.5f*l*b;
	}
}

public class polymorphism {

	public static void main(String[] args) {
		Shapes s;
		s=new rectangle();
		System.out.println("the area of rectangle is" + s.getArea());
		
		s=new square();
		System.out.println("the area of square is" + s.getArea());
		
		s=new triangle();
		System.out.println("the area of triangle is" + s.getArea());
		
		s=new rhombus();
		System.out.println("the area of rhombus is" + s.getArea());
		
		// TODO Auto-generated method stub

	}

}
