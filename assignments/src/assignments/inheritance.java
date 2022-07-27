package assignments;

class product{
	int id=78;
	String name="Amul";
	void display() {
		System.out.println("the name and id is" + name +id);
	}
}
class A extends product{
	int count=50;
	String category="Butter";
	void display1() {
		System.out.println("The name,id,count and category is" + name + count + category+ id);
	}
}
class B extends product{
	int count=90;
	String category="milk";
	void display2() {
		System.out.println("the name,id,count and category is" + name + id + count + category);
	}
}
class C extends product{
	int count=56;
	String category="choco";
	void display3() {
		System.out.println("the name,id,count and category is" + name + id + count + category);
	}
}
class SubA extends A{
	int price =30;
	int totalprice=count*price;
	void display4() {
		System.out.println("the name,id,count,category,price and total price is"  + name + id + count +category + price + totalprice );
	}
}
class SubB extends B{
	int price=10;
	int totalprice=count*price;
	void display5() {
		System.out.println("the name,id,count,category,price and total price is" + name + id + count +category + price + totalprice );
	}
}

public class inheritance {

	public static void main(String[] args) {
		A d=new A();
		B e=new B();
		C f=new C();
		SubA g=new SubA();
		SubB h=new SubB();
		d.display1();
		e.display2();
		f.display3();
		g.display4();
		h.display5();
		// TODO Auto-generated method stub

	}

}

