package assignments;

public class Calculate {
	int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	float arc(float r) {
		float area=3.14f*r*r;
		return area;
	}
	int arect(int a,int b) {
		int area=a*b;
		return area;
	}

	public static void main(String[] args) {
		Calculate s1=new Calculate();
		int a=s1.add(10,5);
		float b=s1.arc(52.2f);
		int c=s1.arect(25, 20);
		System.out.println("the sum is " + a);
		System.out.println("the area of circle is" + b);
		System.out.println("the area of rectangle is" + c);
		// TODO Auto-generated method stub

	}

}
