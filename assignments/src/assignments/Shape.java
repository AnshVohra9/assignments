package assignments;

public class Shape {
	int a;
	int b;
	float c;
	int d;
	Shape(){
		System.out.println("this is default");
	}
	Shape(int c,int d){
		a=c;
		b=d;	
	}
	Shape(int c){
		d=c;
	}
	Shape(float r){
		c=r;
	}
	void displaysq() {
		System.out.println("the area of sq is" + d*d);
	}
	void displayrect() {
		System.out.println("the area of rect is" + a*b);
	}
	void displaycirc() {
		System.out.println("the area of circle is" + 3.14f*c*c);
	}
	public static void main(String[] args) {
		Shape s1=new Shape(10);
		Shape s2=new Shape(10,20);
		Shape s3=new Shape(5.22f);
		s1.displaysq();
		s2.displayrect();
		s3.displaycirc();
		// TODO Auto-generated method stub

	}

}
