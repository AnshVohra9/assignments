package assignments;

public class Student {
	String name;
	int age;
	char section;
	char gender;
	int subject1,subject2,subject3;
	Student(String s,int a,char b,char c,int d,int e, int f){
		name=s;
		age=a;
		section=b;
		gender=c;
		subject1=d;
		subject2=e;
		subject3=f;
		
	}
	void display() {
		System.out.println(name + " " +age+" " + section +" "+ gender );
		int totalmarks=subject1+subject2+subject3;
		System.out.println("the total marks obtained are" + totalmarks);
		float percentage=((totalmarks/300.0f)*100);
		System.out.println("the percentage is" + percentage);
		
	}

	public static void main(String[] args) {
		Student s1=new Student("ansh",5,'C','M',50,80,90);
		Student s2=new Student("anshika",15,'D','F',50,40,30);
		Student s3=new Student("amal",20,'A','M',25,35,95);
		Student s4=new Student("Vanshika",26,'B','F',35,35,85);
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		// TODO Auto-generated method stub

	}

}
