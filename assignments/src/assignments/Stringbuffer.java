package assignments;

public class Stringbuffer {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Started Java");
		s.append("Phase1");
		System.out.println(s);
		s.delete(2,5);
		System.out.println(s);
		s.replace(8, 12,"Python");
		System.out.println(s);
		s.insert(7,"language");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		System.out.println(s.charAt(9));
		// TODO Auto-generated method stub

	}

}
